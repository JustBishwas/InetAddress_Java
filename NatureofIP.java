/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author wilso
 */

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NatureofIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnknownHostException {
        // TODO code application logic here
        String host; 
		Scanner input = new Scanner(System.in); 
		System.out.print("\n Enter the ip address: "); 
		host = input.nextLine(); 
                
                InetAddress ip = InetAddress.getByName(host);
	        
	        System.out.println(ip.isAnyLocalAddress());
	        System.out.println(ip.isLoopbackAddress());
	        System.out.println(ip.isLinkLocalAddress());
	        System.out.println(ip.isSiteLocalAddress());
	        System.out.println(ip.isMulticastAddress()); //true
	        System.out.println(ip.isMCGlobal()); //false
	        System.out.println(ip.isMCOrgLocal());//false
	        System.out.println(ip.isMCSiteLocal()); //true
	        System.out.println(ip.isMCLinkLocal());
	        System.out.println(ip.isMCNodeLocal());
    }
}
