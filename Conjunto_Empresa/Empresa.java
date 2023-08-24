import java.util.HashSet;

public class Empresa{
    private String nome;
    private HashSet<Departamento> departamentos = new HashSet<>();

    public Empresa(String nome){
        this.nome = nome;
    }

    public HashSet<Departamento> getDepartamentos() {
        HashSet<Departamento> departamentosCopy = new HashSet<>(departamentos);
        return departamentosCopy;
    }
    
    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    public boolean removeDepartamento(Departamento departamento){
        return this.departamentos.remove(departamento);
    }

    public float mediaSalarial(){
        float soma = 0;
        HashSet<Funcionario> allFuncionarios = new HashSet<>();   
        for(Departamento d : this.departamentos){
            for(Funcionario f : d.funcionarios){
                allFuncionarios.add(f);
            }
        }

        if(allFuncionarios.size() == 0)
            return 0;

        for(Funcionario f : allFuncionarios){
            soma += f.getSalario();
        }

        return soma / (float)allFuncionarios.size();
    }

}