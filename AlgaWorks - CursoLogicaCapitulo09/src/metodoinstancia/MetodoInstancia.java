package metodoinstancia;

public class MetodoInstancia {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 9.4. Métodos de instância<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 21/11/2024
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Alexandre";
        cliente.ultimoNome = "Afonso";
        cliente.telefone = "3490000000";
        cliente.email = "alexandre.afonso@algowork.com";

        Cliente cliente2  = new Cliente();
        cliente2.primeiroNome = "João";
        cliente2.ultimoNome = "Silva";
        cliente2.telefone = "3489999999";

//        System.out.println("Nome cliente: " + cliente.obterNomeCompleto(cliente)); // Esse é o método estático

        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
        System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
    }

//    static String obterNomeCompletoCliente(Cliente cliente){
//        String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//
//        return nomeCompleto;
//    }
}
