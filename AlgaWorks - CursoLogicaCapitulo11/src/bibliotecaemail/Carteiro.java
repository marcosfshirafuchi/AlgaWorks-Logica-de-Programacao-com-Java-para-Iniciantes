package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {
    static void enviar(String para, String assunto, String msg) throws EmailException {
        String username = "seu-email@outlook.com";
        String password = "senha de aplicativo";

        Email email = new SimpleEmail();
        email.setHostName("smtp-mail.outlook.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator(username, password));
        email.setFrom(username);
        email.setSubject(assunto);
        email.setMsg(msg);
        email.addTo(para);
        email.setStartTLSEnabled(true);
        email.send();

    }
}
