public class Exercicio01 {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1>
     * 6.3. Exercício 01: Encontre os números divisíveis por 3<br><br>
     * Dada a lista de números abaixo:<br><br>
     *
     * Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };<br><br>
     *
     * ... Itere por essa lista e imprima todos os números que são divisíveis por 3.<br><br>
     *
     * Para descobrir se um número é divisível por 3, você pode utilizar o operador módulo. Toda vez que o módulo de um número por 3 for igual a zero, então esse número e divisível por 3.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   07/11/2024
     */
    public static void main(String[] args) {
        Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        for (int i = 0; i < numeros.length;i++){
            if (numeros[i] % 3 == 0){
                System.out.println(numeros[i] +" é divisível por 3!");
            }
        }
    }
}
