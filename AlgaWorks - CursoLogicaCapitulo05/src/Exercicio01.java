import java.util.Scanner;

public class Exercicio01 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 5.3. Exercício 01: Verificar se a pessoa passou no concurso público<br><br>
     * Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.<br><br>
     *
     * A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150. Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.<br><br>
     *
     * No final mostre para o candidato se ele conseguiu ou não.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   03/11/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota de português: ");
        Double notaPortugues = scanner.nextDouble();
        if (notaPortugues < 0 || notaPortugues > 100)
            System.out.println("Digite a nota maior que zero e menor que 100!");
        else{
            System.out.print("Digite a nota de matemática: ");
            Double notaMatematica = scanner.nextDouble();
            if (notaMatematica < 0 || notaMatematica > 100)
                System.out.println("Digite a nota maior que zero e menor que 100!");
            if (notaPortugues>= 60 && notaMatematica >= 60){
                if (notaPortugues + notaMatematica >=150){
                    System.out.println("Você conseguiu passar no concurso público!");
                }
                else{
                    System.out.println("Você não conseguiu passar no concurso público!");
                }
            } else {
                System.out.println("Você não conseguiu passar no concurso público!");
            }
        }
        scanner.close();
    }
}
