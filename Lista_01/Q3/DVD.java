public class DVD extends Item{
    private float duração;
    
    public DVD(String nome, float preço, float duração){
        super(nome, preço);
        this.duração = duração;
    }

    @Override
    public String toString(){
        return super.toString() + ", Duração: " + duração;
    }
}
