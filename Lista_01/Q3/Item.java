public abstract class Item {
    private String nome;
    private float preço;

    public Item(String nome, float preço){
        this.nome = nome;
        this.preço = preço;
    }

    @Override
    public String toString(){
        return ("Nome: " + nome + ", Preço: " + preço);
    }
}
