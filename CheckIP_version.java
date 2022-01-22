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
public class CheckIP_version {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnknownHostException {
        // TODO code application logic here
        
        String myip = "20.234.227.222";
        InetAddress ip2 = InetAddress.getByName(myip);
        
        if(ip2.getAddress().length==4){
            System.out.println("IPv4");
        }else if(ip2.getAddress().length==16){
            System.out.println("IPv6");
        }
    }
}
