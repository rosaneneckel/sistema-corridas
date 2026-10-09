package neckel.tech.sistemacorridas;

public abstract class Motorista {

    private String nome;
    private String placaDoVeiculo;
    private int quantidadeDeCorridasRealizadas;
    private double valorTotalBrutoArrecadado;

    public Motorista(String nome, String placaDoVeiculo) {
        this.nome = nome;
        this.placaDoVeiculo = placaDoVeiculo;
        this.quantidadeDeCorridasRealizadas = 0;
        this.valorTotalBrutoArrecadado = 0.0;
    }

    public void registrarCorrida(double valorDaCorrida) {
        quantidadeDeCorridasRealizadas++;
        valorTotalBrutoArrecadado += valorDaCorrida;
    }

    public abstract double calcularPagamentoLiquido();


    protected void adicionarValorAoTotalBruto(double valor) {
        this.valorTotalBrutoArrecadado += valor;
    }

    public String getNome() {
        return nome;
    }

    public String getPlacaDoVeiculo() {
        return placaDoVeiculo;
    }

    public int getQuantidadeDeCorridasRealizadas() {
        return quantidadeDeCorridasRealizadas;
    }

    public double getValorTotalBrutoArrecadado() {
        return valorTotalBrutoArrecadado;
    }
}