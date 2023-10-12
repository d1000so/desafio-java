package src.main.java;

class ContaPoupanca extends ContaBancaria {
    private final double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        //DONE:
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        System.out.println("Conta Poupanca:");
        super.exibirInformacoes();
        //DONE:
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}
