/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Lexico extends Biblioteca{


//static String reconhecedor = "program, var, integer, real, boolean, procedure, begin, end, if, then, else, while, do, not ";


  public static void main(String[] args) {

                Path caminho = Paths.get("c:/pascal.txt");
      
      try{
           List<String> letra = new ArrayList<>();
           letra.add("a");
           letra.add("b");
           letra.add("c");
           letra.add("d");
           letra.add("e");
           letra.add("f");
           letra.add("g");
           letra.add("h");
           letra.add("i");
           letra.add("j");
           letra.add("k");
           letra.add("l");
           letra.add("m");
           letra.add("n");
           letra.add("o");
           letra.add("p");
           letra.add("q");
           letra.add("r");
           letra.add("s");
           letra.add("t");
           letra.add("u");
           letra.add("v");
           letra.add("w");
           letra.add("x");
           letra.add("y");
           letra.add("z");
           
           List<String> numero = new ArrayList<>();
           numero.add("0");
           numero.add("1");
           numero.add("2");
           numero.add("3");
           numero.add("4");
           numero.add("5");
           numero.add("6");
           numero.add("7");
           numero.add("8");
           numero.add("9");
             
            List<String> delimitador = new ArrayList<>();
            delimitador.add(";");
            delimitador.add(":");
            delimitador.add(".");
            delimitador.add(",");
            delimitador.add("(");
            delimitador.add(")");
            delimitador.add(";");
            
            List<String> comentario = new ArrayList<>();
            delimitador.add("{");
            delimitador.add("}");
            
            List<String> atribuir = new ArrayList<>();
            atribuir.add(":=");
            
            List<String> relacional = new ArrayList<>();
            relacional.add("=");
            relacional.add("<");
            relacional.add(">");
            relacional.add("<=");
            relacional.add(">=");
            relacional.add("<>");
            
            List<String> aditivo = new ArrayList<>();
            aditivo.add("+");
            aditivo.add("-");
            aditivo.add("or");
            
            List<String> multiplicativo = new ArrayList<>();
            multiplicativo.add("*");
            multiplicativo.add("/");
            multiplicativo.add("and");
            
            List<String> reservadas = new ArrayList<>();
            reservadas.add("program");
            reservadas.add("var");
            reservadas.add("integer");
            reservadas.add("real");
            reservadas.add("boolean");
            reservadas.add("procedure");
            reservadas.add("begin");
            reservadas.add("end");
            reservadas.add("if");
            reservadas.add("then");
            reservadas.add("else");
            reservadas.add("while");
            reservadas.add("do");
            reservadas.add("not");
          
          
          FileInputStream arquivo = new FileInputStream("c:/pascal.txt");
          InputStreamReader input = new InputStreamReader(arquivo);
          BufferedReader br = new BufferedReader(input);
          String linha;
          do{
              linha = br.readLine();
              if(linha != null){
                  String[] palavras = linha.split(" ");
                  System.out.println("linha: ");
                  for(int i = 0; i < palavras.length; i++){
                      System.out.println("Palavra lida: " + palavras[i]);
                      
                  }
                  
              }
              
          
          } while (linha != null);
          
       
      

      }catch(IOException ioe){
         ioe.printStackTrace();
      }

                
           
            
            

                /*
                for(String captura : reservadas){
                    System.out.println(captura);
 
                   if(captura.contains(teste)){

                       System.out.println(teste);
                   }
                  */
              
                
              
    
	
}

}

