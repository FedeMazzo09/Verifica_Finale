public class Statistica {
    private int contatore;
    private String datiCumulativi;

    public Statistica(String datiCumulativi) {
        this.contatore = 1;
        this.datiCumulativi = datiCumulativi;
    }

    public int getContatore() {
        return contatore;
    }

    public String getDatiCumulativi() {
        return datiCumulativi;
    }

    public void setContatore(int contatore) {
        this.contatore = contatore;
    }

    public void setDatiCumulativi(String datiCumulativi) {
        this.datiCumulativi = datiCumulativi;
    }

    @Override
    public String toString() {
        return "Statistica{" +
                "contatore=" + contatore +
                ", datiCumulativi='" + datiCumulativi + '\'' +
                '}';
    }
}
