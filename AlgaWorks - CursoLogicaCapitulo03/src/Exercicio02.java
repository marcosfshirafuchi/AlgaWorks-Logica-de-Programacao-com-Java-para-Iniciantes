import java.util.Scanner;
/**
 * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
 * 3.6. Exercício 02: Faça a impressão do nome e do sobrenome da pessoa<br><br>
 * Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e depois imprime o nome completo. Para isso, você vai precisar de duas variáveis: a primeira você pode chamar de "nome" e a segunda de "sobrenome". Por último, você vai juntar o nome e o sobrenome em uma única impressão.<br><br>
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author  Marcos Ferreira Shirafuchi
 * @version 1.0
 * @since   04/08/2024
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Nome completo: " + nome + " " +sobrenome+"!");
        scanner.close();
    }
}
