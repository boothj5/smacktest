import org.jivesoftware.smack.BOSHConfiguration;
import org.jivesoftware.smack.BOSHConnection;
import org.jivesoftware.smack.SASLAuthentication;
import org.jivesoftware.smack.XMPPException;

public class SmackTest {

    /**
     * @param args
     * @throws XMPPException 
     */
    public static void main(String[] args) throws XMPPException {
        BOSHConfiguration conf = new BOSHConfiguration(false, "localhost", 5280, "/http-bind/", "panesar");
        SASLAuthentication.supportSASLMechanism("SIMPLE", 0);
        BOSHConnection connection = new BOSHConnection(conf);
        connection.connect();
        connection.login(args[0], args[1]);
//        connection.disconnect();
    }

}
