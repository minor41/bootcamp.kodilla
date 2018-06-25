public class Punkt {
    int x;
    int y;
}
class Test2 {
    static void zmien(Punkt pkt){
        pkt.x++;
        pkt.y++;
    }
}
class Main2{

    public static void main(String args[]){
        Punkt punkt = new Punkt();
        punkt.x = 5;
        punkt.y = 5;

        Test2.zmien(punkt);

        System.out.println("Współrzędne to: " + punkt.x + " " + punkt.y);
    }
}