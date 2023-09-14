package redesocial;
import java.util.HashMap;

public class RedeSocial {
    private String nome;
    private HashMap<Integer, Usuario> usuarios = new HashMap<>();

    public RedeSocial(String nome){
        this.nome = nome;
    }

    public Usuario newUsuario(int id, String name){
        Usuario usuario = new Usuario(name, id, this);
        usuarios.put(usuario.getId(), usuario);
        return usuario;
    }

    public void addUsuario(Usuario usuario){
        usuarios.put(usuario.getId(), usuario);
    }

    public void removeUsuario(Usuario usuario){
        usuarios.remove(usuario.getId());

        for(Usuario u : this.usuarios.values()){
            u.removeAmigo(usuario);
        }
    }
}
