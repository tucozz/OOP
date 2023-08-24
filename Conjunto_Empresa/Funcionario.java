public class Funcionario{
    private String nome;
    private Float salario;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
    
}