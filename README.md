# Sistema de Corridas

Projeto desenvolvido para a disciplina de Padrões de Projeto [P3] da Tech UniDiasUp.

Simula o motor financeiro de pagamento de motoristas de uma plataforma de mobilidade, 
aplicando os conceitos de Herança, Classes Abstratas, Polimorfismo e Encapsulamento.

## Estrutura

- `Motorista` (classe abstrata): define os atributos e comportamentos comuns a todos os motoristas.
- `MotoristaIniciante`: taxa de 25% + taxa de inatividade se fizer menos de 5 corridas.
- `MotoristaPremium`: taxa de 15% + bônus de R$ 2,00 por corrida.
- `MotoristaParceiroFrotista`: taxa de 20% + dedução fixa de R$ 800,00 (aluguel do veículo).
- `Main`: simula o sistema, registrando corridas e exibindo o extrato de cada motorista.

## Restrições arquiteturais atendidas

- Sem uso de interfaces.
- Sem composição de objetos complexos — resolvido via herança e polimorfismo.
- Atributos encapsulados (`private`), com acesso controlado por getters e métodos `protected`.
- Boas práticas de Clean Code (nomenclatura descritiva, constantes nomeadas, métodos pequenos).

## Como executar

Abra o projeto no IntelliJ e execute a classe `Main.java`.

## Autor

Rosane Neckel
