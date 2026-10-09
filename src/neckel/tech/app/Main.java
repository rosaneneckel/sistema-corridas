package neckel.tech.app;

import neckel.tech.sistemacorridas.Motorista;
import neckel.tech.sistemacorridas.MotoristaIniciante;
import neckel.tech.sistemacorridas.MotoristaParceiroFrotista;
import neckel.tech.sistemacorridas.MotoristaPremium;

public class Main {

    public static void main(String[] args) {

        MotoristaIniciante joao = new MotoristaIniciante("Joao Silva", "ABC-1234");
        joao.registrarCorrida(20.0);
        joao.registrarCorrida(15.0);
        joao.registrarCorrida(30.0);

        MotoristaPremium maria = new MotoristaPremium("Maria Souza", "XYZ-5678");
        maria.registrarCorrida(50.0);
        maria.registrarCorrida(40.0);
        maria.registrarCorrida(35.0);
        maria.registrarCorrida(60.0);
        maria.registrarCorrida(45.0);

        MotoristaParceiroFrotista carlos = new MotoristaParceiroFrotista("Carlos Lima", "FRT-0001");
        carlos.registrarCorrida(100.0);
        carlos.registrarCorrida(90.0);

        imprimirExtrato(joao);
        imprimirExtrato(maria);
        imprimirExtrato(carlos);
    }

    private static void imprimirExtrato(Motorista motorista) {
        System.out.println("===== HOLERITE =====");
        System.out.println("Nome: " + motorista.getNome());
        System.out.println("Placa: " + motorista.getPlacaDoVeiculo());
        System.out.println("Corridas realizadas: " + motorista.getQuantidadeDeCorridasRealizadas());
        System.out.printf("Valor Bruto: R$ %.2f%n", motorista.getValorTotalBrutoArrecadado());
        System.out.printf("Valor Liquido a Receber: R$ %.2f%n", motorista.calcularPagamentoLiquido());
        System.out.println("=====================");
        System.out.println();
    }
}