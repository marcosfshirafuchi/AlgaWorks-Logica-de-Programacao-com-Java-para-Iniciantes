public class IteracaoWhile {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 6.4. Iterando com o “while”<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   07/11/2024
     */
    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++){
//            System.out.println("Um texto qualquer.");
//        }
//        int i = 0;
//        while (i < 10){
//            System.out.println("Um texto qualquer.");
//            i++;
//        }
//        int i = 0;
//        while (i < 10){
//            if (i == 5){
//                System.out.println("Vai parar!");
//                break;
//            }
//            System.out.println(i + ": Um texto qualquer.");
//            i++;
//        }
        int i = 0;
        while (i < 10){
            if (i == 5){
                System.out.println("Vai continuar...");
                i++;
                continue;
            }
            System.out.println(i + ": Um texto qualquer.");
            i++;
        }
    }
}
