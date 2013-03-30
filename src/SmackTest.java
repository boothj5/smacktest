import org.jivesoftware.smack.BOSHConfiguration;
import org.jivesoftware.smack.BOSHConnection;
import org.jivesoftware.smack.ConnectionListener;
import org.jivesoftware.smack.XMPPException;



public class SmackTest {

    /**
     * @param args
     * @throws XMPPException 
     */
    public static void main(String[] args) throws XMPPException {
        BOSHConfiguration conf = new BOSHConfiguration(false, "localhost", 5280, "/http-bind", "panesar");
        BOSHConnection connection = new BOSHConnection(conf);
        connection.connect();
        System.out.println(connection.getConnectionID());
        connection.login("bosh1@panesar", "panesar", "java");
        ConnectionListener = 
        connection.addConnectionListener(connectionListener)
        System.out.println(connection.getConnectionID());
    }

}
