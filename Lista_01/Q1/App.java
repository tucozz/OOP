public class App{
    public static void main(String[] args){
        try{
            Ponto pontos[] = new Ponto[3];

            pontos[0] = new Ponto(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
            pontos[1] = new Ponto(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
            pontos[2] = new Ponto(Double.parseDouble(args[4]), Double.parseDouble(args[5]));
        
            Triangulo triangulo = new Triangulo(pontos[0], pontos[1], pontos[2]);
            System.out.println(triangulo.getPerimetro());
        
        } catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Coordenadas do Triangulo nao inseridas corretamente");
            return;
        }
    }
}