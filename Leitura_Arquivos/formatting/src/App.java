import java.io.FileInputStream;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import School.Aluno;

public class App {
    public static void main(String[] args){
        System.out.println("Lendo CSV:");
        try(FileInputStream fin = new FileInputStream("../entrada.csv"); 
        Scanner s = new Scanner(fin, "ISO-8859-1")){
            Locale brLocale = Locale.forLanguageTag("pt-BR");
			NumberFormat nf = NumberFormat.getInstance(brLocale);
            // criar nova lista
            while(s.hasNextLine()){
                Aluno aluno = new Aluno();
                String line = s.nextLine();
                System.out.println("Procesndo Linha: " + line);
                try(Scanner lineScanner = new Scanner(line)){
                    lineScanner.useDelimiter(";");
                    aluno.setMatricula(lineScanner.next());
                    aluno.setNome(lineScanner.next());
                    aluno.setCr(nf.parse(lineScanner.next()).floatValue());
                    aluno.setNascimento(LocalDate.parse(lineScanner.next()));
                    aluno.setRenda_familiar(nf.parse(lineScanner.next()).floatValue());
                    String token = lineScanner.next();
                }
                //adicionar aluno na lista
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        //calcular tudo usando aquela lista
    }
}
