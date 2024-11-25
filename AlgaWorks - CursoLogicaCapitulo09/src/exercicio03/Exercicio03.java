package exercicio03;

public class Exercicio03 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 9.7. Exercício 03: Exibindo os dados de um pedido<br><br>
     * Crie uma programa que vai, simplesmente, mostrar os dados de um pedido de vendas no console.<br><br>
     *
     * O conceito de pedido de vendas será abstraído em uma classe que você irá chamar de Pedido. Essa classe terá 4 atributos: código, subtotal, desconto e total.<br><br>
     *
     * No método main do programa você vai criar uma variável que poderá chamar de pedido, do tipo Pedido, e instanciar ela. Coloque os valores de cada atributo, da variável pedido, como achar melhor.<br><br>
     *
     * Feito isso, mostre todas essas propriedades no console. Não esqueça de encapsular cada propriedade antes de exibir os dados no console. Isso é para que você não use as variáveis diretamente e sim os métodos getters e setters.<br><br>
     *
     * Depois dessa primeira etapa, você fará o seguinte... Remova a propriedade total da classe Pedido.<br><br>
     *
     * Vai dar um erro nos métodos getTotal e setTotal. No método getTotal mude a implementação de forma que o retorno dele seja a subtração da propriedade subtotal pela propriedade desconto.<br><br>
     *
     * O método setTotal você pode, simplesmente, deixá-lo vazio, pois, não será mais útil. Em um caso real, ele seria removido de todo o programa aos poucos e sem a necessidade de urgência.<br><br>
     *
     * PS: O exercício é feito em dois passos para que você perceba a importância do encapsulamento.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 25/11/2024
     */
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.codigo = 1;
        pedido.subtotal = 7000.0;
        pedido.desconto = 10.0;

        System.out.println("Código: " + pedido.getCodigo() + ", Subtotal: " + pedido.getSubtotal() +
                ", Desconto: " + pedido.getDesconto() + ", Total: " + pedido.getTotal());
    }
}
