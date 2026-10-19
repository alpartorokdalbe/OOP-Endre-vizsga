class CsillamPoni {
    private String nev;
    private int csillamPont;
    
    public CsillamPoni(String nev, int csillamPont) {
        this.nev = nev;
        this.csillamPont = csillamPont;
    }
    
    public void adjCsillamot(int mennyiseg) {
        csillamPont += mennyiseg;
    }

    // Added getNev() getter
    public String getNev() {
        if(nev == null || nev.isEmpty()) {
            return "Nincs nev";
        }
        return nev;
    }

    public int getCsillamPont() {
        return csillamPont;
    }

    public String bemutatkozas() {
        return nev + ": " + csillamPont;
    }
}