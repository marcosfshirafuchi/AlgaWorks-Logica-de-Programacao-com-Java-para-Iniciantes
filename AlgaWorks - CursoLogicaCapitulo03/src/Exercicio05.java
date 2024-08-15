import java.util.Scanner;

public class Exercicio05 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 3.13. Exercício 05: Constantes<br><br>
     * Volte no exercício 03 desse capítulo e transforme o valor 70 em uma constante.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   12/08/2024
     */
    static final Integer NOTA_APROVACAO = 70;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        Double nota = scanner.nextDouble();
        Boolean resultado = nota >=NOTA_APROVACAO ? true:false;

        if (resultado){
            System.out.println("O aluno passou de ano!");
        }else{
            System.out.println("O aluno não passou de ano!");
        }

        scanner.close();
    }
}
