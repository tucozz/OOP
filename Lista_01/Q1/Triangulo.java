public class Triangulo {
    private Ponto pontos[] = new Ponto[3];

    public Triangulo(Ponto p0, Ponto p1, Ponto p2){
        this.pontos[0] = p0;
        this.pontos[1] = p1;
        this.pontos[2] = p2;
    }
    
    public double getPerimetro(){
        return pontos[0].distanceTo(pontos[1]) + pontos[1].distanceTo(pontos[2]) + pontos[0].distanceTo(pontos[2]);
    }
}
