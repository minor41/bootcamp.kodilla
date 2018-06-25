class Test{
    static void zwieksz(int liczba){
        liczba++;
    }
}
class Main{
    public static void main(String[] args) {
        int a = 5;
        Test.zwieksz(a);
        System.out.println(a);
    }
}