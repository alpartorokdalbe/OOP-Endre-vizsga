public class Main {
    public static void main(String[] args) {
        // Created parent and child pony objects
        CsillamPoni p = new RepuloCsillamPoni("CsillamKapitany", 7, "lila");
        CsillamPoni p2 = new CsillamPoni("RagyogoSzivarvany", 7);

        // Intro for both ponies
        p.adjCsillamot(3);
        System.out.println(p2.bemutatkozas());
        System.out.println(p.bemutatkozas());
    }
}