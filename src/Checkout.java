void main() {

    PIX pix = new PIX(600);

    pix.processar(100);
    pix.processar(100);

    Cartao cc = new Cartao(400);
    cc.processar(250);
    pix.processar(100);

    Boleto boleto = new Boleto(LocalDate.of(2026, 05, 05));

    boleto.processar(200);
}
