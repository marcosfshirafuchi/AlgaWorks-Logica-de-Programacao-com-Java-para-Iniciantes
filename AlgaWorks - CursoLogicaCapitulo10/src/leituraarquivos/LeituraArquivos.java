package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 10.4. Lendo informações de um arquivo de texto<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 27/11/2024
     */
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("D:\\Users\\famil\\IdeaProjects\\AlgaWorks\\tmp\\aula\\arquivo.txt");
        List<String> linhas = Files.readAllLines(arquivo);
        for (int i = 0; i < linhas.size(); i++){
            String nome  = linhas.get(i);
            System.out.println("Jogador " + i +": " + nome);
        }
    }
}
