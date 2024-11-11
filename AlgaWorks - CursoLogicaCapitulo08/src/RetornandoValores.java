import java.util.Scanner;

public class RetornandoValores {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 8.6. Retornando valores<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 10/11/2024
     */
//    public static void main(String[] args) {
//        // 50 --- 100%
//        //  x --- 20%
//
//        // 50 * 30 = x * 100
//
//        // x = (50 * 20) / 100
//
//        Double[] premissaIncial = new Double[]{725.5, 100.0};
//        Double proporcao = 20.0;
//        Double resultadoFinal = regraDeTres(premissaIncial,proporcao);
//        System.out.println("Resultado: " + resultadoFinal);
//    }
//
//    static Double regraDeTres(Double[] premissa, Double proporcao) {
//        Double resultado = (premissa[0] * proporcao) / premissa[1];
//        return resultado;
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

        imprimir("Escolha dentre os cursos abaixo:");

        iterarEExibirPosicoesDoVetorString(cursos);


        Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ",scanner);

        Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido,cursos);

        if(!posicaoValida){
            encerrarProgramaPorCausaDaPosicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[]{"Cartão", "Boleto"};

        imprimir("Escolha dentre as formas de pagamento abaixo: ");

        iterarEExibirPosicoesDoVetorString(formasPagamento);


        Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", scanner);

        posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);

        if(!posicaoValida){
            encerrarProgramaPorCausaDaPosicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }

    static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner){
        imprimirEContinuarNaMesmaLinha(texto);
        Integer numero = scanner.nextInt();
        return numero;
    }

    static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor){
        Boolean valida = posicao >= 0 && posicao < vetor.length;
        return valida;
    }

    static void imprimir(String texto){
        System.out.println(texto);
    }

    static void imprimirEContinuarNaMesmaLinha(String texto){
        System.out.print(texto);
    }

    static void iterarEExibirPosicoesDoVetorString(String[] vetor){
        for(int i = 0; i < vetor.length; i++){
            imprimir("[" + i + "] " + vetor[i]);
        }
    }

    static void imprimirTraco(){
        imprimir("---------------------------------------------------------------");
    }

    static void encerrarProgramaPorCausaDaPosicaoInvalida(){
        System.err.println("Posição inválida!");
        System.exit(1);
    }
}
