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

public class InetAddress_Localmachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        try{
            InetAddress ip = InetAddress.getLocalHost("localhost;");
            System.out.println(ip);  
        }
        catch(Exception err){
            System.out.println(err);
        }
    }
}
