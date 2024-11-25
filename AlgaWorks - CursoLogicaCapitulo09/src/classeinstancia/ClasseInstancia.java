package classeinstancia;

public class ClasseInstancia {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 9.8. Diferença entre classe e instância<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 25/11/2024
     */
    public static void main(String[] args) {
        System.out.println("Quantidade Mínima estoque: " + Produto.quantidadeMinimaEstoque);
        Produto produto = new Produto();
//        Produto.quantidadeMinimaEstoque = 10;
        produto.nome = "Caneca";

//        Produto.quantidadeMinimaEstoque = 11;
//        System.out.println("Quantidade Mínima estoque: " + Produto.quantidadeMinimaEstoque);

        System.out.println("Quantidade Mínima estoque: " + Produto.quantidadeMinimaEstoque);
        Produto produto2 = new Produto();
        produto2.nome = "Carteira";



//        System.out.println("Produto 1: " + produto.nome);
//        System.out.println("Produto 2: " + produto2.nome);

        Impressao.informacao("Produto 1: " + produto.nome);
        Impressao.informacao("Produto 2: " + produto2.nome);
    }
}
