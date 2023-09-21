public class Livro extends Item{
    private String autor;

    public Livro(String nome, float preço, String autor){
        super(nome, preço);
        this.autor = autor;
    }

    @Override
    public String toString(){
        return super.toString() + ", Autor: " + autor;
    }

}