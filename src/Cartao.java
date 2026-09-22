public class Cartao extends Pagamento{

    private double limite;

    public Cartao(double limite) {
        this.limite = limite;
    }

    @Override
    public void processar(double valor) {
        if (valor > limite) {
            IO.println("Compra negada, limite insuficiente");
        } else {
            IO.println("Compra aprovada, transação: " + getId());
        }
    }
}
