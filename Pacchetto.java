import java.util.Objects;

public class Pacchetto {
    private String ipSorgente;
    private int portaDestinatario;
    private String protocollo;

    public Pacchetto(String ipSorgente, int portaDestinatario, String protocollo) {
        this.ipSorgente = ipSorgente;
        this.portaDestinatario = portaDestinatario;
        this.protocollo = protocollo;
    }

    public void setPortaDestinatario(int portaDestinatario) {
        this.portaDestinatario = portaDestinatario;
    }

    public void setProtocollo(String protocollo) {
        this.protocollo = protocollo;
    }

    @Override
    public String toString() {
        return "Pacchetto{" +
                "ipSorgente='" + ipSorgente + '\'' +
                ", portaDestinatario=" + portaDestinatario +
                ", protocollo='" + protocollo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pacchetto pacchetto = (Pacchetto) o;
        return Objects.equals(ipSorgente, pacchetto.ipSorgente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ipSorgente);
    }
}
