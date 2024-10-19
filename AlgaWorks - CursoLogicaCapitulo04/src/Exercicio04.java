import java.util.Scanner;

public class Exercicio04 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 4.9. Exercício 04: Verificação da possibilidade de aposentadoria
     * Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previdência, depois verifique se ela pode aposentar ou não.<br><br>
     *
     * Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos. Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   18/10/2024
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        Integer idade = scanner.nextInt();
        System.out.print("Digite o tempo contribuição: ");
        Integer tempoDeContribuicao = scanner.nextInt();
        if (idade >= 55 && tempoDeContribuicao>=25){
            System.out.println("Pode aposentar!");
        }else{
            System.out.println("Não pode aposentar!");
        }
        scanner.close();
    }
}
