
package janelasjava1;

//@author vini
import java.util.Scanner;

public class JanelasJava1 {

    public static void main(String[] args) {
   
     float num1, num2, soma, div, sub, mult;
     String  nome;
     Scanner input = new Scanner(System.in);
     
     System.out.println("Digite seu nome: ");
     nome = input.nextLine();
             
     System.out.println("Digite o num1: ");
     num1= input.nextFloat();
     
     System.out.println("Digite o num2 ");
     num2=input.nextFloat();
     
     
     soma = num1 + num2;
     div = num1 / num2;
     sub = num1 - num2;
     mult = num1*num2;
             
       System.out.println("Soma: " +soma);
       System.out.println("nomee" +nome);
   
    }
}
