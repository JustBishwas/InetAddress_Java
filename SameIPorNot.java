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

public class SameIPorNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnknownHostException{
        // TODO code application logic here
        
        InetAddress ip1 = InetAddress.getByName("www.fb.com");
        
        InetAddress ip2 = InetAddress.getByName("www.facebook.com");
        
        System.out.println(ip1.equals(ip2));
        
        if(ip1.hashCode()==ip2.hashCode()){
            System.out.println("they are same");
        }else{
            System.out.println("they are not same");
        }
        
        String s = ip1.toString();
        System.out.println(s);
    }
}
