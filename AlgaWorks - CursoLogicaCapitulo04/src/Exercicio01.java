import java.util.Scanner;

public class Exercicio01 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 4.3. Exercício 01: Calculadora simples<br><br>
     * Para criar uma calculadora simples você vai precisar receber três informações pelo console. São os dois números que participarão da operação e também a operação que será realizada.<br><br>
     *
     * Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.<br><br>
     *
     * Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos aqui no curso - o *Scanner*. Para receber a operação você pode receber também um número que vai indicar a mesma. Por exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão.<br><br>
     *
     * Com esses três valores - os dois números e qual será a operação - você pode utilizar a estrutura de decisão if para só realizar a operação que o usuário escolheu. Se estiver com dúvidas, então volte a aula onde falamos sobre alteração do valor de uma variável - aula 3.10.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   21/08/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        Double numero1 = scanner.nextDouble();
        System.out.println("Digite a operação desejada: \n1 - Adição \n2 - Subtração\n3 - Multiplicação \n4 - Divisão");
        Integer numeroDaOperacao = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        Double numero2 = scanner.nextDouble();
        Double resultado = null;
        if (numeroDaOperacao == 1){
            resultado = numero1 + numero2;
            System.out.printf("%.1f + %.1f = %.1f",numero1,numero2,resultado);
        } else if (numeroDaOperacao == 2) {
            resultado = numero1 - numero2;
            System.out.printf("%.1f - %.1f = %.1f",numero1,numero2,resultado);
        }else if (numeroDaOperacao == 3) {
            resultado = numero1 * numero2;
            System.out.printf("%.1f * %.1f = %.1f",numero1,numero2,resultado);
        }else if (numeroDaOperacao == 4) {
            if (numero2 == 0){
                System.out.println("Não pode dividir por zero!");
            }else {
                resultado = numero1 / numero2;
                System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, resultado);
            }
        }
        scanner.close();
    }
}
