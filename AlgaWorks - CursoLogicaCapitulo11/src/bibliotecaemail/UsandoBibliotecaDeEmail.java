package bibliotecaemail;

import org.apache.commons.mail.EmailException;


public class UsandoBibliotecaDeEmail {
    /**
     * <h1> AlgaWorks - Lógica de Programação com Java para Iniciantes </h1><br><br>
     * 11.3. Utilizando uma biblioteca de terceiro para envio de e-mails<br><br>
     * Alteração no envio de E-mails<br>
     * Em maio de 2022, o Google removeu o suporte da autenticação via usuário e senha do Gmail, através do SMTP. Sendo assim, não será mais possível realizar o envio de e-mail citado na aula via GMail.<br><br>
     *
     * Uma alternativa existente é, para realizar a aula, criar um e-mail da Microsoft. A Microsoft ainda permite esse tipo de acesso, porém, é necessário gerar uma senha de aplicativo, sendo a senha usada para envio de e-mail, que é diferente da sua senha de acesso, além de configurações adicionais no código.<br><br>
     *
     * Nova dependência a ser colocada no projeto<br>
     * A partir da versão 11 do Java, é necessário acrescentar uma dependência que não foi citada na aula, chamada Activation, na versão 1.1.1. Essa dependência por ser encontrada aqui<br><br>
     *
     * Versões das dependências citadas na aula<br>
     * Para realizar o envio de e-mail, certifique-se de estar utilizando as versões a seguir das dependências citadas na aula:<br><br>
     *
     * javax.mail - 1.6.2<br>
     * commons-email - 1.5<br>
     * Configurações alteradas de porta e host<br>
     * O método enviar da classe Carteiro deve ficar como segue:<br><br>
     *
     * 	static void enviar(String para, String assunto, String msg) throws EmailException {<br>
     * 		String username = "seu-email@outlook.com";<br>
     * 		String password = "senha de aplicativo";<br><br>
     *
     * 		Email email = new SimpleEmail();<br>
     * 		email.setHostName("smtp-mail.outlook.com");<br>
     * 		email.setSmtpPort(587);<br>
     * 		email.setAuthenticator(new DefaultAuthenticator(username, password));<br>
     * 		email.setFrom(username);<br>
     * 		email.setSubject(assunto);<br>
     * 		email.setMsg(msg);<br>
     * 		email.addTo(para);<br>
     * 		email.setStartTLSEnabled(true);<br>
     * 		email.send();<br>
     * 	    }<br>
     * Logo no início existem duas variáveis, uma para username e outra para password. Você deve alterar o valor delas para que sejam seus respectivos e-mail e a "senha de aplicativo" criados com o provedor da Microsoft.<br>
     * Passo a passo de geração de senha para envio no Outlook<br>
     * Vídeo<p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 29/11/2024
     */
    public static void main(String[] args) throws EmailException {
        Carteiro.enviar("alexandre.afonso@algaworks.com",
                "Envio de email com Commons email",
                "Se estiver vendo esse email é porque o nosso envio funcionou!");
        System.out.println("Fim...");
    }
}
