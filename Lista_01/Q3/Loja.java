import java.util.LinkedList;
import java.util.List;

public class Loja {
    public static void main(String[] args){
        List<Item> items = new LinkedList<>();

        items.add(new Livro("Praticamente Inofensiva", 12, "Douglas Adams"));
        items.add(new Livro("Dracula", 40, "Bram Stoker"));
        items.add(new CD("Tropicalia", 25, 12));
        items.add(new CD("Skank no Mineirao", 30, 31));
        items.add(new DVD("O Show de Truman", 10, 107));

        for(Item i : items){
            System.out.println("Item em estoque //" + i);
        }
        
    }
}
