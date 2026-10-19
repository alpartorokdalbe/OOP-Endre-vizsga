public class Main {
    public static void main(String[] args) {
        CsillamPoni p = new RepuloCsillamPoni("CsillamKapitan", 7, "lila");

        CsillamPoni p2 = new CsillamPoni("CsillamKapitan", 7);

        p.adjCsillamot(3);
        System.out.println(p2.bemutatkozas());
    }
}