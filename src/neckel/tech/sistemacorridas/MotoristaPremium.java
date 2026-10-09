package neckel.tech.sistemacorridas;

public class MotoristaPremium extends Motorista {

    private static final double PERCENTUAL_TAXA_PLATAFORMA = 0.15;
    private static final double BONUS_POR_CORRIDA = 2.0;

    public MotoristaPremium(String nome, String placaDoVeiculo) {
        super(nome, placaDoVeiculo);
    }

    @Override
    public void registrarCorrida(double valorDaCorrida) {
        super.registrarCorrida(valorDaCorrida);
        adicionarValorAoTotalBruto(BONUS_POR_CORRIDA);
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorTotalBrutoArrecadado() * (1 - PERCENTUAL_TAXA_PLATAFORMA);
    }
}