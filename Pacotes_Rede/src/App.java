import redesocial.RedeSocial;
import redesocial.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        //SETUP
        RedeSocial twitter = new RedeSocial("twitter");

        Usuario tucozz = twitter.newUsuario(001, "@tucozz");
        Usuario srjheam = twitter.newUsuario(002, "@srjheam");
        Usuario nacar0lina = twitter.newUsuario(003, "@nacar0lina");
        Usuario opedromoraes = twitter.newUsuario(004, "@opedromoaes");
        Usuario oeduardosg = twitter.newUsuario(005, "@oeduardosg");

        tucozz.addAmigo(srjheam);
        tucozz.addAmigo(nacar0lina);
        tucozz.addAmigo(oeduardosg);
        tucozz.addAmigo(opedromoraes);

        srjheam.addAmigo(tucozz);
        srjheam.addAmigo(oeduardosg);

        opedromoraes.addAmigo(tucozz);
        opedromoraes.addAmigo(nacar0lina);

        oeduardosg.addAmigo(tucozz);
        oeduardosg.addAmigo(nacar0lina);
        oeduardosg.addAmigo(opedromoraes);

        //TESTS
        for(Usuario u : twitter.getUsuarios().values()){
            System.out.println("AMIGOS DE " + u.getNome() + ":");
            for(Usuario am : u.getAmigos().values()){
                System.out.println(am.getNome());
            }
            System.out.println("");
        }

        tucozz.removeAmigo(opedromoraes);
        
        for(Usuario u : twitter.getUsuarios().values()){
            System.out.println("AMIGOS DE " + u.getNome() + " APOS REMOCAO SIMPLES:");
            for(Usuario am : u.getAmigos().values()){
                System.out.println(am.getNome());
            }
            System.out.println("");
        }

        twitter.removeUsuario(srjheam);

        for(Usuario u : twitter.getUsuarios().values()){
            System.out.println("AMIGOS DE " + u.getNome() + " APOS REMOCAO COMPLETA:");
            for(Usuario am : u.getAmigos().values()){
                System.out.println(am.getNome());
            }
            System.out.println("");
        }

    }
}
