import java.util.Scanner;

public class Exercicio02 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 4.5. Exercício 02: Desconto de frete em compras acima de R$100,00<br><br>
     * Crie um programa que receba o valor de um produto e exiba o valor final da compra. Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00. Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.<br><br>
     *
     * Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   21/08/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        Double valorFinal = valorProduto;
        Boolean precisaCobrarFrete = valorProduto<100;
        if (precisaCobrarFrete)
            valorFinal += 15.00;
        System.out.println("Valor final: " + valorFinal);
        scanner.close();
    }
}
