public class PIX extends Pagamento{

    private double saldo;

    public PIX(double saldo) {
        super();
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void processar(double valor) {
        if(valor > saldo){
            IO.println("Compra não Autorizada, valor insuficiente");
        }else {
            IO.println("Compra aprovada, ID: " + getId() );
        }
    }

}

