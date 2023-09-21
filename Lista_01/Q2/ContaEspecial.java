public class ContaEspecial extends Conta {
    public ContaEspecial(int id){
        super(id);
    }

    @Override
    public void saque(float quantia){
        if(getSaldo() - quantia >= 0){
            setSaldo(getSaldo() - quantia*1.01);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}
