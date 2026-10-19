class CsillamPoni {
    // Modified the nev variable to be private
    private String nev;
    private int csillamPont;
    
    public CsillamPoni(String nev, int csillamPont) {
        // Added validation for the constructor parameters
        if(nev == null || nev.isEmpty()) {
            throw new IllegalArgumentException("Nev nem lehet ures");
        }

        if(csillamPont < 0) {
            throw new IllegalArgumentException("Csillam pont nem lehet negativ");
        }

        // Added this. to the following lines to avoid ambiguity
        // between the instance variables and the constructor parameters
        this.nev = nev;
        this.csillamPont = csillamPont;
    }
    
    public void adjCsillamot(int mennyiseg) {
        // Added validation for the method parameter
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
        return nev + ", csillampont: " + csillamPont;
    }
}