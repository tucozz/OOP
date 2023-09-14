package visualizacao;

import redesocial.RedeSocial;
import redesocial.Usuario;

public abstract class VisualizaDot {
    public static void printGraph(RedeSocial redeSocial){
        System.out.println("digraph G {");
        for(Usuario u : redeSocial.getUsuarios().values()){
            for(Usuario am : u.getAmigos().values()){
                System.out.println("    " + u.getNome() + " -> " + am.getNome());
            }
        }
        System.out.println("}");
    }
}
