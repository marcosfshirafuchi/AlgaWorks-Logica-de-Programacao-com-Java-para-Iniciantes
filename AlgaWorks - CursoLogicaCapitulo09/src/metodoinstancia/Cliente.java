package metodoinstancia;

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

public class Cliente {
    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;

    String obterNomeCompleto(){
        String nomeCompleto = primeiroNome + " " + ultimoNome;

        return nomeCompleto;
    }
    String obterDDD(){
        String ddd = telefone.substring(0,2);
        return ddd;
    }
}
