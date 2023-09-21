public class Conta {
    private int id;
    private double saldo;

    public Conta(int id){
       this.id = id;
       this.saldo = 0;
    }

    public void deposito(float quantia){
        setSaldo(saldo + quantia);
    }

    public void saque(float quantia){
        if(getSaldo() - quantia >= 0){
            setSaldo(getSaldo() - quantia*1.05);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    protected void setSaldo(double quantia){
        saldo = quantia;
    }

    public double getSaldo(){
        return saldo;
    }
}