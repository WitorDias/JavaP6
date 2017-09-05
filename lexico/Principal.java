/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;
import java.io.*; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author WALBER
 */

public class Principal {
 
   public static void main (String[]args){
      /*try{
         BufferedReader br = new BufferedReader(new FileReader("c:/pascal.txt"));
         while(br.ready()){
            String linha = br.readLine();
            
         }
         br.close();
      }catch(IOException ioe){
         ioe.printStackTrace();
      }*/
      Path caminho = Paths.get("c:/pascal.txt");
      
      try{
          byte[] texto = Files.readAllBytes(caminho);
          String leitura = new String(texto);
          JOptionPane.showMessageDialog(null, leitura);
          
      }
      catch(Exception e){
          
      }
   

/*
public static void main(String args[]) {

int diaDaSemana = 1;

switch (diaDaSemana) {

        case 1:
        System.out.println("Domingo");
        break;
        case 2:
        System.out.println("Segunda-feira");
        break;
        default:
            System.out.println("Este não é um dia válido!");

}

}

}
}
*//*
     public static void main(String args[]) {
      String s = "123456789";
      char result = s.charAt(8);
      System.out.println(result);
   }
*/
}
    }