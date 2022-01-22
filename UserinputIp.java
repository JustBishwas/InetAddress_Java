/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author wilso
 */
import java.net.*; 
import java.util.*; 
public class UserinputIp {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String host; 
		Scanner input = new Scanner(System.in); 
		System.out.print("\n Enter the ip address: "); 
		host = input.nextLine(); 
		try { 
			InetAddress address = InetAddress.getByName(host);
			System.out.println("IP address: " + address.getHostAddress());
			System.out.println("Host name : " + address.getHostName());  
			System.out.println("Host name and IP address: " + address.toString()); 

		} 
		catch (UnknownHostException ex) {
		     System.out.println("Could not find " + host); 
		}
	} 
    }
