public class Main {
    public static void main(String[] args) {
        CsillamPoni p = new RepuloCsillamPoni("CsillamKapitan", 7, "lila");

        p.adjCsillamot(3);
        System.out.println(p.bemutatkozas());
    }
}