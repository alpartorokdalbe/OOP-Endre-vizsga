public class Main {
    public static void main(String[] args) {
        int napiPontok[] = {4, 7, 9, 9, 8 ,2, 10};

        // Created parent and child pony objects
        CsillamPoni p = new RepuloCsillamPoni("CsillamKapitany", 7, "lila");
        CsillamPoni p2 = new CsillamPoni("RagyogoSzivarvany", 7);

        // Intro for both ponies
        p.adjCsillamot(3);
        System.out.println(p2.bemutatkozas());
        System.out.println(p.bemutatkozas());

        System.out.println(leghosszabbCsillamSorozat(napiPontok, 8));
        System.out.println(leghosszabbCsillamSorozat(new int[0], 8));
    }

    public static int leghosszabbCsillamSorozat(int[]napiPontok, int minimum) {
        int maxHossz = 0;
        int aktualisHossz = 0;

        for (int pont : napiPontok) {
            if (pont >= minimum) {
                aktualisHossz++;
                if (aktualisHossz > maxHossz) {
                    maxHossz = aktualisHossz;
                }
            } else {
                aktualisHossz = 0;
            }
        }

        return maxHossz;
    }
}