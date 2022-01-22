/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author wilso
 */

import java.io.*;  
import java.net.*;  
public class InetDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        try{
            InetAddress ip = InetAddress.getByName("www.kbc.edu.np");
            
            System.out.println("Hostname : " +ip.getHostName());
            System.out.println("Hostname : " +ip.getHostAddress());
        }
        catch(Exception err){ 
            System.out.println(err);
        }
        
    }
}
