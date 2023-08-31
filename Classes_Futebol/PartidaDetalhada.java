import java.util.LinkedList;
import java.util.List;

public class PartidaDetalhada extends Partida {

    private List<Lance> lances = new LinkedList<>();

    public PartidaDetalhada(Time timeA, Time timeB) {
        super(timeA, timeB);
    }

    public void realizaGol(Time timeMarcador, Time timeSofredor, Jogador autor, int minuto){
        if(timeMarcador.getNome() == this.getTimeA().getNome())
            this.incrementaGolA();
        else
            this.incrementaGolB();

        Gol gol = new Gol(minuto, autor, timeMarcador, timeSofredor);
        lances.add(gol);
    }

    public void realizaGolContra(Time timeMarcador, Time timeSofredor, Jogador autor, int minuto){
        if(timeMarcador.getNome() == this.getTimeA().getNome())
            this.incrementaGolB();
        else
            this.incrementaGolA();

        Gol gol = new GolContra(minuto, autor, timeMarcador, timeSofredor);
        lances.add(gol);
    }

    public void realizaCartaoAmarelo(float minuto, Jogador autor){
        Cartao cartao = new CartaoAmarelo(minuto, autor);
        lances.add(cartao);
    }

    public void realizaCartaoVermelho(float minuto, Jogador autor){
        Cartao cartao = new CartaoVermelho(minuto, autor);
        lances.add(cartao);
    }
    
}
