import java.util.LinkedList;

public class Campeonato {
    private LinkedList<Partida> partidas = new LinkedList<>();

    public void adicionaPartida(Partida p){
        partidas.add(p);
    }

    public Partida getPartida(int idx){
        return partidas.get(idx);
    }
}
