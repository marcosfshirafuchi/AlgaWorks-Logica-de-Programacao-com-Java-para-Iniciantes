package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 10.2. Escrevendo informações em arquivos de texto<br><br>
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
        for (int i = 0; i < 5; i++){
            System.out.print("Jogador " + i + ": ");
            String nome = scanner.nextLine();

            linhas.add(nome);
        }

        Path arquivo = Paths.get("D:\\Users\\famil\\IdeaProjects\\AlgaWorks\\tmp\\aula\\arquivo.txt");
        Files.write(arquivo, linhas);

        scanner.close();
        System.out.println("Fim...");
    }
}
