package primeiraclasse;

public class PrimeiraClasse {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 9.2. Criando a primeira classe<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 14/11/2024
     */
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Smartphone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 15;

        exibirQuantidadeEmEstoque(produto);
    }
    static void exibirQuantidadeEmEstoque(Produto produto){
        System.out.println("Quantidade em estoque do produto " + produto.nome + " é de " + produto.quantidade + " unidade(s).");
    }
}
