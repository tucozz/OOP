import java.util.HashSet;

public class App{
    public static void main(String[] args){
        Empresa empresa = new Empresa("Melon Tech");

        Departamento departamento1 = new Departamento("Desenvolvimento");
        empresa.addDepartamento(departamento1);
        departamento1.addFuncionario("Jheam", 10);
        departamento1.addFuncionario("Johann", 2500);
        departamento1.addFuncionario("Rafael Chess", 1800);

        Departamento departamento2 = new Departamento("Tradução");
        empresa.addDepartamento(departamento2);
        departamento2.addFuncionario("Dua Lipa", 5000);
        departamento2.addFuncionario("Bruna Marquezine", 3200);
        departamento2.addFuncionario("Ryolth", 1200);

        Departamento departamento3 = new Departamento("Midia");
        empresa.addDepartamento(departamento3);
        departamento3.addFuncionario("Virginha", 100000);
        departamento3.addFuncionario("Larissa Manoela", 8);
        departamento3.addFuncionario("funcionario33", 3300);

        HashSet<Departamento> departamentosCopy = empresa.getDepartamentos();

        for(Departamento d : departamentosCopy){
            System.out.println("DEPARTAMENTO: " + d.getNome() + "-----------");
            for(Funcionario f : d.funcionarios){
                System.out.println("Nome: " + f.getNome());
                System.out.println("Salario: " + f.getSalario());
                System.out.println("");
            }
            System.out.println("Media Salarial do Departamento: " + d.mediaSalarial());
            System.out.println("");
        }
        System.out.println("Media Salarial da Empresa: " + empresa.mediaSalarial());
        
    }
}