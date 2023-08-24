import java.util.HashSet;

public class Empresa{
    private HashSet<Departamento> departamentos = new HashSet<>();

    public HashSet<Departamento> getDepartamentos() {
        HashSet<Departamento> departamentosCopy = new HashSet<>(departamentos);
        return departamentosCopy;
    }

    public void setDepartamentos(HashSet<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    public boolean removeDepartamento(Departamento departamento){
        return this.departamentos.remove(departamento);
    }

}