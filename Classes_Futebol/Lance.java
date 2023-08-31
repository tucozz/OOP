public abstract class Lance {
    private float minuto;
    private Jogador autor;

    public Lance(float minuto, Jogador autor){
        this.minuto = minuto;
        this.autor = autor;
    }

    public float getMinuto(){
        return minuto;
    }

    public Jogador getAutor(){
        return autor;
    }
}
