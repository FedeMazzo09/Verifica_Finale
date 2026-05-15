import java.util.*;

public class GestoreTraffico {
    private HashMap<Pacchetto, Statistica> stock;

    public GestoreTraffico() {
        stock = new HashMap<>();
    }

    public void aggiungiPacchetto(Pacchetto p, Statistica s) {
        stock.put(p, s);
    }

    public void riceviPacchetto(Pacchetto p, Statistica s) {
        if(stock.containsKey(p)) {
            for (Map.Entry<Pacchetto, Statistica> elemento : stock.entrySet()) {
                if (elemento.getKey().hashCode() == p.hashCode()) {
                    Statistica Stemp = elemento.getValue();
                    Pacchetto Ptemp = elemento.getKey();
                    Stemp.setContatore(Stemp.getContatore() + 1);
                    Stemp.setDatiCumulativi(s.getDatiCumulativi());
                    stock.put(Ptemp, Stemp);
                }
            }
        }else {
            stock.put(p, s);
        }
    }

    public String visualizzaPacchetti() {
        return "GestoreTraffico{" +
                "stock=" + stock +
                "}";
    }

    public void azzeraPacchetto(Pacchetto p) {
        for(Map.Entry<Pacchetto, Statistica> elemento : stock.entrySet()){
            if(elemento.getKey().hashCode() == p.hashCode()){
                Statistica Stemp = elemento.getValue();
                Pacchetto Ptemp = elemento.getKey();
                Stemp.setContatore(0);
                Stemp.setDatiCumulativi("");
                Ptemp.setProtocollo("");
                Ptemp.setPortaDestinatario(0);
                stock.put(Ptemp, Stemp);
            }
        }
    }

    public void cancellaPacchetti() {
        for(Map.Entry<Pacchetto, Statistica> elemento : stock.entrySet()){
            if(elemento.getValue().getContatore()<3){
                stock.remove(elemento.getKey());
            }
        }
    }
}
