class CsillamPoni {
    private String nev;
    private int csillamPont;
    
    public CsillamPoni(String nev, int csillamPont) {
        if(nev == null || nev.isEmpty()) {
            throw new IllegalArgumentException("Nev nem lehet ures");
        }

        if(csillamPont < 0) {
            throw new IllegalArgumentException("Csillam pont nem lehet negativ");
        }

        this.nev = nev;
        this.csillamPont = csillamPont;
    }
    
    public void adjCsillamot(int mennyiseg) {
        if(mennyiseg < 0) {
            throw new IllegalArgumentException("Csillam pont nem lehet negativ");
        }

        csillamPont += mennyiseg;
    }

    // Added getNev() getter
    public String getNev() {
        if(this.nev == null || this.nev.isEmpty()) {
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