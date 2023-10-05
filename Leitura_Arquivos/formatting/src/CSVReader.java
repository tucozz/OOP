import java.io.FileInputStream;
import java.util.Scanner;

public class CSVReader {
    
    public static void main(String[] args){
        System.out.println("Lendo CSV:");
        try(FileInputStream fin = new FileInputStream("../entrada.csv"); 
        Scanner s = new Scanner(fin, "ISO-8859-1")){
            while(s.hasNextLine()){
                String line = s.nextLine();
                System.out.println("Procesndo Linha: " + line);
                try(Scanner lineScanner = new Scanner(line)){
                    lineScanner.useDelimiter(";");
                    while(lineScanner.hasNext()){
                        String token = lineScanner.next();
                        System.out.println("Leu: [" + token + "]");
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
