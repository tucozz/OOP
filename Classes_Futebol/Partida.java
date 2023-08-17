public class Partida{
    private Time timeA;
    private Time timeB;
    private int golsA;
    private int golsB;

    public Partida(Time timeA, Time timeB){
        this.timeA = timeA;
        this.timeB = timeB;
        golsA = 0;
        golsB = 0;
    }

    public void incrementaGolA(){
        golsA++;
    }

    public void incrementaGolB(){
        golsB++;
    }

    public void imprimePlacar(){
        System.out.println("PLACAR: " + timeA.getNome() + "/ " + golsA + " - " + golsB + " \\" + timeB.getNome());
    }
}
