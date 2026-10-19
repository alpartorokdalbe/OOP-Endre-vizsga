class RepuloCsillamPoni extends CsillamPoni {
    private String szarnySzin;

    public RepuloCsillamPoni(String nev, int csillamPont, String szarnySzin) {
        super(nev, csillamPont);
        this.szarnySzin = szarnySzin;
    }

    @Override
    public String bemutatkozas() {
        String nev = this.getNev();
        return "Repulo poni: " + nev + ", szarny szin: " + szarnySzin + ", csillam pont: " + getCsillamPont();
    }
}