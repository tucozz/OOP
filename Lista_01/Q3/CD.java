public class CD extends Item{
    private int numeroFaixas;

    public CD(String nome, float preço, int numeroFaixas){
        super(nome, preço);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString(){
        return super.toString() + ", Numero de faixas: " + numeroFaixas;
    }

}
