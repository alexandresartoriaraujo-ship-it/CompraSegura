import java.time.LocalDate;

public class Boleto extends Pagamento{

    private LocalDate vencimento;

    public Boleto(LocalDate vencimento) {
        this.vencimento = LocalDate.now();
    }

    @Override
    public void processar(double valor) {
    IO.println("Vencimento para " + vencimento.plusDays(4) + " no valor de R$ " + valor);

    }

}
