public class Time{
    private String nome;
    private int nTitulosMundiais;

    public Time(String nome){
        this.nome = nome;
    }

    public Time(String nome, int nTitulosMundiais){
        this.nome = nome;
        this.nTitulosMundiais = nTitulosMundiais;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }


}