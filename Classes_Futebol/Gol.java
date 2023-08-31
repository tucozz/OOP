public class Gol extends Lance{

    private Time timeMarcador;
    private Time timeSofredor;
    private Jogador assistente;

    public Gol(float minuto, Jogador autor, Time timeMarcador, Time timeSofredor) {
        super(minuto, autor);
        this.timeMarcador = timeMarcador;
        this.timeSofredor = timeSofredor;
    }

    public Gol(float minuto, Jogador autor, Time timeMarcador, Time timeSofredor, Jogador assistente) {
        super(minuto, autor);
        this.timeMarcador = timeMarcador;
        this.timeSofredor = timeSofredor;
        this.assistente = assistente;
    }
    
}
