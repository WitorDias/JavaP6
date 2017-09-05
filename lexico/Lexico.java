/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Lexico {

//static String reconhecedor = "program, var, integer, real, boolean, procedure, begin, end, if, then, else, while, do, not ";

  public static void main(String[] args) {
		int i = 0;
                Path caminho = Paths.get("c:/pascal.txt");
      
      try{
          byte[] texto = Files.readAllBytes(caminho);
          String leitura = new String(texto);
          JOptionPane.showMessageDialog(null, leitura);
          
      }
      catch(Exception e){
          
      }
                
                List<String> letra = new ArrayList<>();
                letra.add("QWERTYUIOPÇLKJHGFDSAZXCVBNM");
                
                
                List<String> numero = new ArrayList<>();
                numero.add("123456789");
                List<String> simbolo = new ArrayList<>();
                simbolo.add("!@#$%¨&*()-+=");

                List<String> reservadas = new ArrayList<>();
                reservadas.add("program, var, integer, real, boolean, procedure, "
                        + "begin, end, if, then, else, while, do, not ");
                
                //System.out.println(reserva);
                String analisador = "integer";
                
               
                for(String captura : reservadas){
                   // System.out.println(captura.contains("integer"));
                   if(captura.contains(analisador)){
                       System.out.println("Filtro funciona");
                   }
                
                }
              
                
                /*
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite um texto:");
                
		while(leitor.hasNext()){
                    
			i++;
                        int recebe = i;
                        System.out.println("Token numero:"+recebe);
			System.out.println("Token: "+leitor.next());
              
                        
		}
                
                        
		leitor.close();
           */
    
	
}
}
