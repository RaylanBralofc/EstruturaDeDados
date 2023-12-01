package atividade2;


java
import java.util.Scanner;
   public class atividade2 {
     public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contPar = 0;
        int contImpar = 0;
        Scanner scanner = new Scanner(System.in);
 
     for (int i = 0; i < numeros.length; i++) {
        System.out.print("Digite o número " + (i + 1) + ": ");
          numeros[i] = scanner.nextInt();
               if (numeros[i] % 2 == 0) {
             pares[contPar] = numeros[i];
        contPar++;
           } else {
 impares[contImpar] = numeros[i];
 contImpar++;
 }
 }
 
         System.out.println("Números digitados:");
        for (int i = 0; i < numeros.length; i++) {
         System.out.print(numeros[i] + " ");
 }
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < contPar; i++) {
         System.out.print(pares[i] + " ");
 }
           System.out.println("\nNúmeros ímpares:");
           for (int i = 0; i < contImpar; i++) {
           System.out.print(impares[i] + " ");
 }
 }
}