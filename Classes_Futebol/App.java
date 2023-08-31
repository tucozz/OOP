public class App {
    public static void main(String[] args) {
        Time fla = new Time("Flamengo");
        Time flu = new Time("Fluminense");
        PartidaDetalhada flaflu = new PartidaDetalhada(fla, flu);
        Campeonato libertadores = new Campeonato();
        libertadores.adicionaPartida(flaflu);

        Jogador goleiroBruno = new Jogador("Bruno");
        flaflu.realizaGol(fla, flu, goleiroBruno, 15);
        flaflu.realizaGol(fla, flu, goleiroBruno, 28);

        for(Lance l : flaflu.getLances()){
            System.out.println(l);
        }
    }
}
