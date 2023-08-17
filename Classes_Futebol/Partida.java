public class Partida{
    private Time timeA;
    private Time timeB;
    private int[] gols = new int[2];

    public Partida(Time timeA, Time timeB){
        this.timeA = timeA;
        this.timeB = timeB;
    }

    public Time getTimeA() {
        return timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public void incrementaGolA(){
        gols[0]++;
    }

    public int getGolA(){
        return gols[0];
    }

    public void incrementaGolB(){
        gols[1]++;
    }

    public int getGolB(){
        return gols[1];
    }

    public void imprimePlacar(){
        System.out.println("PLACAR: " + timeA.getNome() + "/ " + gols[0] + " - " + gols[1] + " \\" + timeB.getNome());
    }
}
