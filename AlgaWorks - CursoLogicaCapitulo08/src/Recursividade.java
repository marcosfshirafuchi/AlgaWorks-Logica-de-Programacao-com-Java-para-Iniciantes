import java.util.Scanner;

public class Recursividade {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 8.8. Recursividade<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 11/11/2024
     */
//    public static void main(String[] args) {
//        //imprimirNumero(0);
//        String[] alunos = new String[]{"Alexandre", "João", "Maria"};
//
//        iterarNomes(alunos, 0);
//    }
//
//    static void iterarNomes(String[] alunos, Integer i) {
//        System.out.println("Aluno: " + alunos[i]);
//
//        if (++i < alunos.length) {
//            iterarNomes(alunos,i);
//        }
//    }
//
//    static void imprimirNumero(Integer numero) {
//        System.out.println("Número: " + numero);
//        if (numero < 10) {
//            imprimirNumero(++numero);
//        }
//
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
        iterarEExibirPosicoesDoVetorString(vetor,0);
    }

    static void iterarEExibirPosicoesDoVetorString(String[] vetor, Integer i){

            imprimir("[" + i + "] " + vetor[i]);
        if(++i < vetor.length){
            iterarEExibirPosicoesDoVetorString(vetor, i);
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
