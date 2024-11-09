import java.util.Scanner;

public class Exercicio01 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 7.3. Exercício 01: Cadastrando as tarefas do dia<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   09/11/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de tarefas para cadastrar: ");
        Integer quantidadeDeTarefas = scanner.nextInt();
        String[] tarefas = new String[quantidadeDeTarefas];
        scanner.nextLine();
        for (int i = 0; i < quantidadeDeTarefas;i++){
            System.out.print("Digite a "+(i+1)+"ª tarefa: ");
            tarefas[i] = scanner.nextLine();
        }
        System.out.println();
        System.out.println("Tarefas do dia: ");
        for (int i = 0; i < quantidadeDeTarefas;i++){
            System.out.println((i+1)+"- " + tarefas[i]);

        }
        scanner.close();
    }
}
