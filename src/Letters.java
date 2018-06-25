import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

class Words {

    public static void main(String[] args) {

        Letters randomA = new Letters();
        randomA.createRandomWords();
    }
}

class Letters {

    public void createRandomWords() {
        final Queue<String> wordA = new ArrayDeque<>();
        final RandomLengthStringGenerator randomLengthStringGenerator = new RandomLengthStringGenerator();

        for (int i = 0; i < 50; i++) {
            final String randomString = randomLengthStringGenerator.generateRandomWordsWithA();

            wordA.offer(randomString);
        }

        final EvenOrOdd splitWordA = new EvenOrOdd(wordA);

        final List<String> getEven = splitWordA.getEvenA();
        final List<String> getOdd = splitWordA.getOddA();

        System.out.println(getEven);
        System.out.println();
        System.out.println(getOdd);

    }
}

class RandomLengthStringGenerator {

    private Random randomA = new Random();

    public String generateRandomWordsWithA() {

        StringBuilder wordA = new StringBuilder();

        int randomLength = randomA.nextInt(50) + 1;

        for (int i = 0; i < randomLength; i++) {
            wordA.append("a");
        }
        return wordA.toString();
    }
}

class EvenOrOdd {

    private Queue<String> wordA;

    public EvenOrOdd(Queue<String> wordA) {
        this.wordA = wordA;
    }

    public List<String> getEvenA() {

        final List<String> result = new ArrayList<>();

        for (String evenA : wordA) {
            if (evenA.length() % 2 == 0) {
                result.add(evenA);
            }
        }
        return result;
    }

    public List<String> getOddA () {

        final List<String> result = new ArrayList<>();

        for (String oddA : wordA) {
            if (oddA.length() % 2 != 0) {
                result.add(oddA);
            }
        }
        return result;
    }
}












