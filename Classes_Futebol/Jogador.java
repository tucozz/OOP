public class Jogador {
    private String nome;
    private float salario;

    public Jogador(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }


}
