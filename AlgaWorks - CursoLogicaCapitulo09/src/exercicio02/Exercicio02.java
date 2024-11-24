package exercicio02;

public class Exercicio02 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 9.5. Exercício 02: Método de instância que informa necessidade de repor estoque<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 23/11/2024
     */
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook XZ10";
        produto.quantidadeEstoque = 8;

        System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + produto.eNecessarioReporEstoque());
    }
}
