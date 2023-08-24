import java.util.HashSet;

public class Departamento{
    private String nome;
    HashSet<Funcionario> funcionarios = new HashSet<>();

    public Departamento(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addFuncionario(String nome, float salario){
        Funcionario funcionario = new Funcionario(nome);
        funcionario.setSalario(salario);

        this.funcionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }

    public HashSet<Funcionario> getFuncionarios(){
        HashSet<Funcionario> funcCopy = new HashSet<>();
        return funcCopy;
    }

    public float mediaSalarial(){
        float soma = 0;
        for(Funcionario f : this.funcionarios){
            soma += f.getSalario();
        }

        return soma / (float)this.funcionarios.size();
    }

}