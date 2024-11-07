public class IteracaoFor {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 6.2. Iterando com o “for”<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   07/11/2024
     */
    public static void main(String[] args) {
//        for(int i = 0; i <= 5; i++){
//            System.out.println(i + ": Uma frase qualquer.");
//        }
//        Double[] carrinhoDeCompras = new Double[]{50.0, 51.0, 52.0};
//        Double total = 0.0;
//        for(int i = 0; i < carrinhoDeCompras.length; i++){
//            System.out.println("Iteração: " + i + ", Total: " + total);
//            total = total + carrinhoDeCompras[i];
//        }
//        System.out.println("Total: " + total);
//        for(int i = 0; i < 10 ; i++){
//            if(i == 5){
//                System.out.println("Vai parar!");
//                break;
//            }
//            System.out.println("Iteração: " + i);
//        }
//        for(int i = 0; i < 10 ; i++){
//            if(i == 5){
//                System.out.println("Vai continuar!");
//                continue;
//            }
//            System.out.println("Iteração: " + i);
//        }
        Integer[] produtos = new Integer[]{100, 225, 300};
        for(int i = 0; i < produtos.length ; i++){
            Integer produto = produtos[i];
            System.out.println("Produto de código: " + produto);
            if (produto.equals(225)){
                System.out.println("Produto encontrado!");
                break;
            }
        }
    }
}
