public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(numero, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
        
    }

  
    
}