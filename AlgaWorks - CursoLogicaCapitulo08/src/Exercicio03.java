import java.util.Scanner;

public class Exercicio03 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 8.7. Exercício 03: Crie uma pequena calculadora de subtração e adição<br><br>
     * Crie um programa que peça dois números do usuário e também qual a operação ele deseja fazer - adição ou subtração. Para cada operação, você deve construir um método que realize a mesma, ou seja, teremos um método para adição, que vai receber dois números como parâmetros e retornar o resultado da soma entre eles, e outro método para subtração.<br><br>
     *
     * Fique a vontade para implementar multiplicação e divisão também.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 11/11/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        Double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        Double segundoNumero = scanner.nextDouble();
        String[] operacoes = new String[]{"+", "-","*","/"};
        System.out.println("Operações matemáticas abaixo: ");
        for (int i = 0; i < operacoes.length; i++){
            System.out.println("["+i+"] : " + operacoes[i]);
        }
        System.out.print("Digite a operação matemática desejada: ");
        Integer operacaoDesejada = scanner.nextInt();
        Boolean verificacaoOperacaoDesejada = operacaoDesejada >= 0 && operacaoDesejada < operacoes.length;
        if (!verificacaoOperacaoDesejada){
            System.err.println("Posição inválida!");
            System.exit(1);
        }
        Double resultado = 0.0;
        if (operacaoDesejada == 0)
            resultado = adicao(primeiroNumero, segundoNumero);
        else if (operacaoDesejada == 1) {
            resultado = subtracao(primeiroNumero, segundoNumero);
        } else if (operacaoDesejada == 2) {
            resultado = multiplicacao(primeiroNumero, segundoNumero);
        } else {
            resultado = divisao(primeiroNumero, segundoNumero);
        }
        System.out.println("Resultado da operação escolhida: ");
        System.out.println(primeiroNumero+ " " +operacoes[operacaoDesejada] + " " + segundoNumero + " " + "=" + resultado);
        scanner.close();
    }
    static Double adicao(Double primeiroNumero, Double segundoNumero){
        return primeiroNumero + segundoNumero;
    }
    static Double subtracao(Double primeiroNumero, Double segundoNumero){
        return primeiroNumero - segundoNumero;
    }
    static Double multiplicacao(Double primeiroNumero, Double segundoNumero){
        return primeiroNumero * segundoNumero;
    }
    static Double divisao(Double primeiroNumero, Double segundoNumero){
        if (segundoNumero == 0){
            System.err.println("Não pode dividir por zero!");
            System.exit(1);
        }
        return primeiroNumero / segundoNumero;
    }
}
