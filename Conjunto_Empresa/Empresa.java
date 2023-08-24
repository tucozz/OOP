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
        int soma = 0;
        for(Departamento d : this.departamentos){
            soma += d.mediaSalarial();
        }

        return soma / (float)this.departamentos.size();
    }

}