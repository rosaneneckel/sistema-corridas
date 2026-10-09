package neckel.tech.sistemacorridas;

public class MotoristaParceiroFrotista extends Motorista {

    private static final double PERCENTUAL_TAXA_PLATAFORMA = 0.20;
    private static final double VALOR_ALUGUEL_VEICULO = 800.0;

    public MotoristaParceiroFrotista(String nome, String placaDoVeiculo) {
        super(nome, placaDoVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double valorLiquido = getValorTotalBrutoArrecadado() * (1 - PERCENTUAL_TAXA_PLATAFORMA);
        valorLiquido -= VALOR_ALUGUEL_VEICULO;

        if (valorLiquido < 0) {
            return 0.0;
        }

        return valorLiquido;
    }
}
