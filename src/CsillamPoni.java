class CsillamPoni {
    public String nev;
    private int csillamPont;
    
    public CsillamPoni(String nev, int csillamPont) {
        this.nev = nev;
        this.csillamPont = csillamPont;
    }
    
    public void adjCsillamot(int mennyiseg) {
        csillamPont += mennyiseg;
    }

    public int getCsillamPont() {
        return csillamPont;
    }

    public String bemutatkozas() {
        return nev + ": " + csillamPont;
    }
}