import java.util.Scanner;

public class Exercicio02 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 8.5. Exercício 02: Identifique um novo padrão no algoritmo da aula passada<br><br>
     * Veja novamente o algoritmo da aula passada e identifique o outro trecho que poderia ser reaproveitado através do uso de métodos.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 10/11/2024
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};

        System.out.println("Escolha dentre os cursos abaixo:");

        iterarEExibirPosicoesDoVetorString(cursos);

        System.out.print("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();

        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

        if (!posicaoValida) {
            encerrarProgramaPorCausaDePosicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[]{"Cartão", "Boleto"};

        System.out.println("Escolha dentre as formas de pagamento abaixo: ");

        iterarEExibirPosicoesDoVetorString(formasPagamento);

        System.out.print("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

        posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;

        if (!posicaoValida) {
            encerrarProgramaPorCausaDePosicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }

    static void iterarEExibirPosicoesDoVetorString(String[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] " + vetor[i]);
        }
    }

    static void imprimirTraco() {
        System.out.println("---------------------------------------------------------------");
    }

    static void encerrarProgramaPorCausaDePosicaoInvalida() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }
}
