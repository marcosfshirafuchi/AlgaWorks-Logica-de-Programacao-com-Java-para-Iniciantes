import java.util.Scanner;

public class Exercicio01 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 3.4. Exercício 01: Calculando o quadrado de um número<br><br>
     * Leia um número no console e depois faça o cálculo do quadrado desse número e exiba o resultado no console. Lembrando que o quadrado de um número é calculado multiplicando-se o número por ele mesmo. Por exemplo, para encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, tendo como resultado o número 4.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   02/08/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        Integer numero = scanner.nextInt();
        Integer quadrado = numero * numero;
        System.out.printf("O quadrado de %d = %d\n",numero,quadrado);
    }
}
