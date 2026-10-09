package neckel.tech.sistemacorridas;

public class MotoristaIniciante extends Motorista {

    private static final double PERCENTUAL_TAXA_PLATAFORMA = 0.25;
    private static final int QUANTIDADE_MINIMA_CORRIDAS = 5;
    private static final double TAXA_DE_INATIVIDADE = 50.0;

    public MotoristaIniciante(String nome, String placaDoVeiculo) {
        super(nome, placaDoVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double valorLiquido = getValorTotalBrutoArrecadado() * (1 - PERCENTUAL_TAXA_PLATAFORMA);

        if (getQuantidadeDeCorridasRealizadas() < QUANTIDADE_MINIMA_CORRIDAS) {
            valorLiquido -= TAXA_DE_INATIVIDADE;
        }

        return valorLiquido;
    }
}