import java.util.Scanner;

public class Exercicio02 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 2.7. Exercício 02: Cálculo do índice de massa corporal<br>
     * O índice de massa corporal, mais conhecido pela sigla IMC, é um índice adotado pela OMS (Organização Mundial de Saúde), que é usado para o diagnóstico do sobrepeso e da obesidade. O IMC pode ser facilmente calculado a partir de dois simples dados: peso e altura.<br><br>
     *
     * A fórmula para o seu cálculo eu vou passar aqui pra você e sua missão é criar um pequeno programa que faça esse cálculo automaticamente. Veja aqui a fórmula:<br><br>
     *
     * IMC = PESO / (ALTURA * ALTURA)<br><br>
     * Lembrando que o peso é em quilogramas e a altura é em metros.<br><br>
     *
     * A primeira coisa a se fazer é declarar duas variáveis que vão receber o peso e a altura, respectivamente. Esses dois valores serão informados pelo usuário - da mesma forma como fizemos na aula anterior.<br><br>
     *
     * Depois dessas duas variáveis, vai ser preciso declarar uma terceira que vai guardar o resultado da multiplicação da altura por ela mesma (é a parte "ALTURA * ALTURA" da fórmula acima).<br><br>
     *
     * Agora basta dividir o peso pela multiplicação que foi feita. O resultado dessa divisão já será o final. Guarde o resultado dessa divisão em uma quarta variável que será utilizada para exibir para o usuário.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   30/07/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura: ");
        Double altura = scanner.nextDouble();
        System.out.print("Digite o peso: ");
        Double peso = scanner.nextDouble();
        Double imc = peso / (altura * altura);
        System.out.printf("O IMC de %.2f metros e %.2f kg : %.2f",altura,peso,imc);
        scanner.close();
    }
}
