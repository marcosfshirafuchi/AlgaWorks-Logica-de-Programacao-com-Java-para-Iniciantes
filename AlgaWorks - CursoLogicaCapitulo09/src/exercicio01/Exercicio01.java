package exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 9.3. Exercício 01: Método que informa necessidade de repor estoque<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 14/11/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.print("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();
        System.out.print("Digite a quantidade de produto: ");
        produto.quantidadeEstoque = scanner.nextInt();
        System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + eNecessarioReporEstoque(produto));
        scanner.close();
    }

    static Boolean eNecessarioReporEstoque(Produto produto) {
        if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_NO_ESTOQUE) {
            return true;
        }

        return false;
    }
}
