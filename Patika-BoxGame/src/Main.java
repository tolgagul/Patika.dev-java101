public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Jackson", 65, 100, 98, 56);
        Fighter f2 = new Fighter("Rousso", 88, 100, 78, 71);

        Ring match = new Ring(f1, f2, 68, 100);
        match.run();
    }
}