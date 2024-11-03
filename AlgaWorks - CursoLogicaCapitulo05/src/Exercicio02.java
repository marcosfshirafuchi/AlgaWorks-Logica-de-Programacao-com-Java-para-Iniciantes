import java.util.Scanner;

public class Exercicio02 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 5.5. Exercício 02: Calcule o bônus do funcionário(a)<br><br>
     * Pense em uma empresa fictícia que todo o mês de Janeiro premia seus funcionários com um bônus, caso a meta seja alcançada.<br><br>
     *
     * Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa para o ano que passou. Depois, receba o parâmetro referente ao faturamento real da empresa no ultimo ano. Por último, receba a média salarial do funcionário(a) para o ano anterior (não precisa fazer cálculo de média salarial, já que estamos trabalhando com um algoritmo fictício - na hora de informar esse parâmetro, invente um valor qualquer para representar essa média salarial).<br><br>
     *
     * Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual, então os funcionários ganharam um bônus que será igual a média salarial deles no último ano. Caso o faturamento seja menor que a meta, mas, seja maior ou igual a 80% do valor da meta, então eles receberão também 80% de sua média salarial.<br><br>
     *
     * No final, mostre de quanto será o prêmio desse funcionário(a).<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   03/11/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor faturamento do último ano: ");
        Double faturamentoAnual = scanner.nextDouble();
        System.out.print("Digite o valor faturamento real: ");
        Double faturamentoReal = scanner.nextDouble();
        System.out.print("Digite o valor média salarial do funcionário: ");
        Double mediaSalarial = scanner.nextDouble();
        Double bonusDoFuncionario = 0.0;
        if (faturamentoReal >=faturamentoAnual){
            bonusDoFuncionario = mediaSalarial;
        }else{
            if ((faturamentoReal/faturamentoAnual) >=0.80){
                bonusDoFuncionario = mediaSalarial * 0.80;
            }
        }
        System.out.printf("O bônus do funcionário: R$ %.2f\n",bonusDoFuncionario);
        scanner.close();
    }
}
