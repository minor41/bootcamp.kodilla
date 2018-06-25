import java.util.Arrays;
import java.util.List;

class Skill {
    private String name;
    private int value;

    public Skill(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}

interface Player {
    int calculateSkills();
}

class BasketballPlayer implements Player {

    private String name;
    private List<Skill> skills;

    public BasketballPlayer(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public int calculateSkills() {
        int sum = 0;
        for (Skill skill : skills) {
            sum += skill.getValue();
        }
        return sum / skills.size();
    }

    public String getName() {
        return name;
    }
}

interface Team {

    String getName();

    int calculateTeamPower();

}

class BasketballTeam implements Team {

    private String name;
    private List<BasketballPlayer> players;


    public BasketballTeam(String name, List<BasketballPlayer> players) {
        this.name = name;
        this.players = players;
    }

    public int calculateTeamPower() {
        int sum = 0;
        for (BasketballPlayer player : players) {
            sum = sum + player.calculateSkills();
        }
        return sum;
    }

    public String getName() {
        return this.name;
    }

}

class Application2 {
    public static void main(String[] args) {

        final Skill barca1Speed = new Skill("speed", 90);
        final Skill barca1Agility = new Skill("agility", 50);

        final List<Skill> barca1Skills = Arrays.asList(barca1Speed, barca1Agility);

        final BasketballPlayer barca1 = new BasketballPlayer("Robert Horry", barca1Skills);

        final BasketballPlayer barca2 =
                new BasketballPlayer(
                        "Jason Kidd",
                        Arrays.asList(
                                new Skill("speed", 90),
                                new Skill("agility", 50)
                        )
                );


        final BasketballPlayer barca3 = new BasketballPlayer("Toni Kukoc", Arrays.asList(new Skill("speed", 90), new Skill("agility", 50)));

        final List<BasketballPlayer> teamPlayers1 = Arrays.asList(barca1, barca2, barca3);

        final Team team1 = new BasketballTeam("abc", teamPlayers1);


        final BasketballPlayer real1 = new BasketballPlayer("Penny Hardeway", Arrays.asList(new Skill("speed", 90), new Skill("agility", 50)));
        final BasketballPlayer real2 = new BasketballPlayer("John Smith", Arrays.asList(new Skill("speed", 90), new Skill("agility", 50)));
        final BasketballPlayer real3 = new BasketballPlayer("Leo Doe", Arrays.asList(new Skill("speed", 90), new Skill("agility", 50)));

        final List<BasketballPlayer> teamPlayers2 = Arrays.asList(real1, real2, real3);

        final Team team2 = new BasketballTeam("def", teamPlayers2);

        final int team1Power = team1.calculateTeamPower();
        final int team2Power = team2.calculateTeamPower();

        System.out.println("Team: " + team1.getName() + " vs Team: " + team2.getName());

        System.out.println("Team " + team1.getName() + " power = " + team1Power);
        System.out.println("Team " + team2.getName() + " power = " + team2Power);

    }
}
