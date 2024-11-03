import java.util.Scanner;

public class Exercicio03 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 5.7. Exercício 03: Imprima o nome do dia da semana (domingo, segunda-feira, etc.)<br><br>
     * Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7). Dependendo do número informado você deve imprimir o nome desse dia.<br><br>
     *
     * Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   03/11/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Opções o dia da semana:" +
                "\n1 - Domingo" +
                "\n2 - Segunda-feira" +
                "\n3 - Terça-feira" +
                "\n4 - Quarta-feira" +
                "\n5 - Quinta-feira" +
                "\n6 - Sexta-feira" +
                "\n7 - Sabado");
        System.out.println();
        System.out.println();
        System.out.print("Digite o dia da semana desejada: ");
        Integer diaDaSemana = scanner.nextInt();
        switch (diaDaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Digite um mês válido!");
                System.exit(1);
        }
        scanner.close();
    }
}
