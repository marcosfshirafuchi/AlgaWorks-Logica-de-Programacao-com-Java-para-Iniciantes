import java.util.Scanner;

public class Exercicio04 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 8.9. Exercício 04: Exibir a tabuada de um número qualquer<br><br>
     * Crie um programa que receba um número qualquer do usuário e imprima a tabuada desse número, do 0 até o 10. Por exemplo, a tabuada do número dois ficaria assim:<br><br>
     *
     * 2 x 0 = 0<br>
     * 2 x 1 = 2<br>
     * 2 x 2 = 4<br>
     * 2 x 3 = 6<br>
     * 2 x 4 = 8<br>
     * 2 x 5 = 10<br>
     * 2 x 6 = 12<br>
     * 2 x 7 = 14<br>
     * 2 x 8 = 16<br>
     * 2 x 9 = 18<br>
     * 2 x 10 = 20<br><br>
     * Para fazer esse trabalho você deve usar a técnica da recursividade. Crie um método com o nome de "imprimirTabuada" que receba dois parâmetros - o multiplicando e o multiplicador. O multiplicando será o número que o usuário digitou e o multiplicador será o número que irá ser incrementado a cada operação de multiplicação.<br><br>
     *
     * Dentro do método "imprimirTabuada" você deve multiplicar um parâmetro pelo outro, mostrar para o usuário a multiplicação feita juntamente com o resultado, e, no final, incrementar o multiplicador e fazer uma nova chamada ao método "imprimirTabuada" com o multiplicador já incrementado.<br><br>
     *
     * Obviamente, a primeira chamada, ao método "imprimirTabuada", será feita a partir do método "main". O parâmetro referente ao multiplicando você terá, pois, será o usuário que irá digitar pelo console, e o multiplicador você pode iniciar, na primeira chamada, com o número zero estaticamente. O método "imprimirTabuada" é que fará o trabalho de incrementá-lo para as próximas chamadas que forem feitas.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 11/11/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a tabuada desejada: ");
        Integer numero = scanner.nextInt();
        System.out.println("----------------------------------");
        imprimirTabuada(numero,0);
        System.out.println("----------------------------------");
        scanner.close();
    }
    static void imprimirTabuada(Integer multiplicando, Integer multiplicador){
        System.out.println(multiplicando + " X " + multiplicador + " = " + multiplicando * multiplicador);
        if (++multiplicador <= 10){
            imprimirTabuada(multiplicando,multiplicador);
        }
    }
}
