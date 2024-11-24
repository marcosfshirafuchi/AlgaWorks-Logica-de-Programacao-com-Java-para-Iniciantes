package encapsulamento;

public class Encapsulamento {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 9.6. Encapsulamento<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 24/11/2024
     */
    public static void main(String[] args) {
//        Cliente cliente = new Cliente();
//
//        cliente.nome = "Alexandre Afonso";
//        cliente.telefone = "34922334455";
//
//        System.out.println("Nome cliente: " + cliente.nome);
        Cliente cliente = new Cliente();
        cliente.setNome("Alexandre Afonso");
        cliente.setTelefone("34922334455");

        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("Último nome: " + cliente.getUltimoNome());
    }
}
