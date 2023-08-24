import java.util.HashSet;

public class App{
    public static void main(String[] args){
        Empresa empresa = new Empresa("Empresa1");

        Departamento departamento1 = new Departamento("Teste1");
        empresa.addDepartamento(departamento1);

        Departamento departamento2 = new Departamento("Teste2");
        empresa.addDepartamento(departamento2);

        Departamento departamento3 = new Departamento("Teste3");
        empresa.addDepartamento(departamento3);

        HashSet<Departamento> departamentosCopy = empresa.getDepartamentos();

        for(Departamento d : departamentosCopy){
            System.out.println(d.getNome());
        }
        
    }
}