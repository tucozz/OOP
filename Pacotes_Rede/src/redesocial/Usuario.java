package redesocial;
import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private RedeSocial redeSocial;
    private String nome;
    private int id;
    private Map<Integer, Usuario> amigos = new HashMap<>();

    public Usuario(String nome, int id, RedeSocial redeSocial){
        this.nome = nome;
        this.id = id;
        this.redeSocial = redeSocial;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getId(){
        return id;
    }

    public void addAmigo(Usuario amigo){
        amigos.put(amigo.id, amigo);
    }

    public void removeAmigo(Usuario ex_amigo){
        amigos.remove(ex_amigo.id);
    }

    public Map<Integer, Usuario> getAmigos(){
        Map<Integer, Usuario> map2 = new HashMap<Integer, Usuario>(amigos);
        return map2;
    }
}
