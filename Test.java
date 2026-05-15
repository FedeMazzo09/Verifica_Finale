import java.util.*;

public class Test {
    static void main(String[] args) {
        GestoreTraffico g1 = new GestoreTraffico();

        Pacchetto p1 = new Pacchetto("192.168.1.1", 80, "TCP");
        Pacchetto p2 = new Pacchetto("192.168.1.1", 443, "UDP");

        Statistica s1 = new Statistica("ciao");
        Statistica s2 = new Statistica("miao");

        g1.riceviPacchetto(p1, s1);
        System.out.println(g1.visualizzaPacchetti());

        g1.riceviPacchetto(p2, s2);
        System.out.println(g1.visualizzaPacchetti());

        g1.azzeraPacchetto(p1);
        System.out.println(g1.visualizzaPacchetti());

        g1.cancellaPacchetti();
        System.out.println(g1.visualizzaPacchetti());

    }
}
