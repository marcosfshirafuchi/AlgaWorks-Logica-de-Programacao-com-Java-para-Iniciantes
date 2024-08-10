import java.util.Scanner;

public class Exercicio03 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 3.8. Exercício 03: Crie um programa que informa se o aluno passou de ano<br><br>
     * O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação lógica para saber se a nota do aluno é maior que 70. O resultado dessa operação lógica deve ser atribuido a uma variável do tipo Boolean.<br><br>
     *
     * Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir, no console, uma mensagem que vai dizer se o aluno passou ou não passou.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   07/08/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        Double nota = scanner.nextDouble();
        Boolean resultado = nota >=70 ? true:false;

        if (resultado){
            System.out.println("O aluno passou de ano!");
        }else{
            System.out.println("O aluno não passou de ano!");
        }

        scanner.close();
    }
}
