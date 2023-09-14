package redesocial;
import java.util.HashMap;
import java.util.Map;

public class RedeSocial {
    private String nome;
    private Map<Integer, Usuario> usuarios = new HashMap<>();

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

    public Map<Integer, Usuario> getUsuarios(){
        Map<Integer, Usuario> map2 = new HashMap<Integer, Usuario>(usuarios);
        return map2;
    }
}
