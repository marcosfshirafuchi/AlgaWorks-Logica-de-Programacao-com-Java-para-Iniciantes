package exercicio01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 10.3. Exercício 01: Crie uma lista de tarefas e salve a lista em um arquivo<br><br>
     * Crie um programa que vai receber, através do console, uma lista de atividades que vai ajudar o usuário a planejar suas tarefas para o dia seguinte.<br><br>
     *
     * Depois que o usuário informar, uma a uma, suas tarefas, as mesmas serão salvas em um arquivo de texto - cada tarefa vai ocupar uma linha desse arquivo.<br><br>
     *
     * Para receber cada tarefa do usuário, use o laço while. Enquanto o usuário não digitar um "x" no console, continue pedindo que ele informe as atividades.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 26/11/2024
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<String>();
        int i =1;
        while (true){
            System.out.print("Digite a " + i +"ª tarefa: ");
            String tarefa = scanner.nextLine();

            if ("x".equals(tarefa) || "X".equals(tarefa)) {
                break; // Essa é a única maneira de parar esse laço.
            }
            linhas.add(i + " - " +tarefa);
            i++;
        }

        Path arquivo = Paths.get("D:\\Users\\famil\\IdeaProjects\\AlgaWorks\\tmp\\exercicio01\\tarefas.txt");
        Files.write(arquivo, linhas);

        scanner.close();
        System.out.println("Fim...");
    }
}
