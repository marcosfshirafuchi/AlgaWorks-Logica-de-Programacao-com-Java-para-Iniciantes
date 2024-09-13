import java.util.Scanner;

public class Exercicio03 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 4.7. Exercício 03: Cálculo de gastos familiar<br><br>
     * Faça um programa que receba:<br><br>
     *
     * O valor da conta de luz<br>
     * Conta de água<br>
     * Conta de telefone<br>
     * Escola do filho<br>
     * Fatura do cartão<br>
     * Gastos com supermercado<br>
     * ... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   12/09/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double gastoTotal=0.0;

        System.out.print("Digite o valor da Conta de luz: ");
        Double valorDaContaDeLuz = scanner.nextDouble();
        gasto
    Total+=valorDaContaDeLuz;
        System.out.print("Digite o valor da Conta de água: ");
        Double valoDaContaDeAgua = scanner.nextDouble();
        gastoTotal+=valoDaContaDeAgua;
        System.out.print("Digite o valor da Conta de telefone: ");
        Double valorDaContaDeTelefone = scanner.nextDouble();
        gastoTotal+=valorDaContaDeTelefone;
        System.out.print("Digite o valor da Escola do filho: ");
        Double valorDaEscolaDoFilho = scanner.nextDouble();
        gastoTotal+=valorDaEscolaDoFilho;
        System.out.print("Digite o valor da Fatura do cartão: ");
        Double valorDaFaturaDoCartao = scanner.nextDouble();
        gastoTotal+=valorDaFaturaDoCartao;
        System.out.print("Digite o valor dos Gastos com supermercado: ");
        Double valorDosGastosComSupermercado = scanner.nextDouble();
        gastoTotal+=valorDosGastosComSupermercado;
        System.out.println("O valor do gasto total: " + gastoTotal);
        scanner.close();
    }
}
