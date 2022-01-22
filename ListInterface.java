import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class ListInterface {

	public static void main(String[] args) throws SocketException {
		Enumeration<NetworkInterface> interfaces =  NetworkInterface.getNetworkInterfaces();
		while(interfaces.hasMoreElements()) {
			NetworkInterface ni = interfaces.nextElement();
			System.out.println(ni);
		}
	}

}