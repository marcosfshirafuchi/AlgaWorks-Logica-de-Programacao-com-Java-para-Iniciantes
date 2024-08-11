import java.util.Scanner;

public class Exercicio04 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 3.11. Exercício 04: Encontre o valor total baseado na quantidade e no desconto<br><br>
     * Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja. Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.
     *
     * Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for maior que 10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, você NÃO aplica desconto algum.<br><br>
     *
     * Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) você multiplica o subtotal pelo próprio percentual e divide tudo por 100.<br><br>
     *
     * Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar será o valor total final e deverá ser apresentado no console.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   10/08/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        Integer quantidadeProduto = scanner.nextInt();
        Double percentualDesconto;
        if (quantidadeProduto>=10){
            percentualDesconto = 10.0;
        }else{
            percentualDesconto = 0.0;
        }
        Double subTotal = valorProduto * quantidadeProduto;
        Double desconto = subTotal * percentualDesconto/100;
        Double valorTotal = subTotal - desconto;
        System.out.println("Valor total: " + valorTotal);
        scanner.close();
    }
}
