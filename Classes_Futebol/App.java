public class App {
    public static void main(String[] args) {
        Time fla = new Time("Flamengo");
        Time flu = new Time("Fluminense");

        Partida flaflu = new Partida(fla, flu);

        flaflu.incrementaGolA();
        flaflu.incrementaGolB();
        flaflu.incrementaGolB();

        flaflu.imprimePlacar();
    }
}
