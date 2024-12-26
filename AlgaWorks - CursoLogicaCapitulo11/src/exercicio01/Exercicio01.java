package exercicio01;

import org.apache.commons.mail.EmailException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 11.4. Exercício 01: Crie uma lista de tarefas e envie a lista por email<br><br>
     * Crie um programa que faça o mesmo que o exercício 1 do capítulo 10, mas, ao invés de salvar as atividades no arquivo, envie as atividades por e-mail.<br><br>
     *
     * Uma dica aqui na hora do envio da lista de tarefas por e-mail é colocar cada tarefa em uma linha. Você pode fazer isso utilizando utilizando o código que diz onde a linha termina. Esse código é o "\n".<br><br>
     *
     * Toda vez que o código "\n" é encontrado em uma *string* é feita uma quebra de linha na hora de apresentar a informação.<br><br>
     *
     * Supondo que você tem uma lista com algumas tarefas, você pode fazer assim:<br><br>
     *
     * String tarefas = "";<br><br>
     *
     * for (int iteracao = 0; iteracao < listaComAsTarefas.size(); iteracao++) {<br>
     * 	tarefas += listaComAsTarefas.get(iteracao) + "\\n"; // Repare aqui a quebra de linha.<br>
     * }<br><br>
     *
     * String mensagem = "Suas tarefas: \\n" + tarefas; // Aqui também tem uma quebra de linha. Essa é a variável que vai ser enviada como o texto do e-mail.<br>
     * Faça testes com e sem o código de quebra de linha para perceber a diferença visualmente.<br><br>
     *
     * Verificação da forma de envio de e-mail<br>
     * Certifique-se de ter olhado o conteúdo de apoio da aula 11.3, para que você consiga enviar o e-mail desse desafio corretamente.<p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 29/11/2024
     */
    public static void main(String[] args) throws IOException, EmailException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<String>();

        String tarefa;
        int i = 0;
        while (true) { // Deixei o true como condição do laço, pois, o que vai pará-lo é o fato do usuário digitar o "x" no console.
            System.out.print("Tarefa " + i + ": ");
            tarefa = scanner.nextLine();

            if ("x".equals(tarefa)) {
                break; // Essa é a única maneira de parar esse laço.
            }

            linhas.add(tarefa);
            i++;
        }

        String tarefas = "";

        for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
            tarefas += linhas.get(iteracao) + "\n";
        }

        String mensagem = "Suas tarefas: \n" + tarefas;

        System.out.print("Digite seu e-mail: ");
        String para = scanner.next();

        Carteiro.enviar(para, "Sua lista de tarefas", mensagem);

        System.out.println("Fim...");

        scanner.close();
    }
}
