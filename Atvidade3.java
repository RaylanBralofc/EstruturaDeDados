package atividade3;


public class Atividade3 {

    java
import java.util.Scanner;
       public class atividade3 {
      public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o número de linhas da matriz A: ");
         int linhasA = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz A: ");
       int colunasA = scanner.nextInt();
           System.out.print("Digite o número de linhas da matriz B: ");
       int linhasB = scanner.nextInt();
       System.out.print("Digite o número de colunas da matriz B: ");
       int colunasB = scanner.nextInt();
 
       if (colunasA != linhasB) {
       System.out.println("As matrizes não são compatíveis para multiplicação.");
       return;
 }
 
        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];
       System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < linhasA; i++) {
        for (int j = 0; j < colunasA; j++) {
        System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
         matrizA[i][j] = scanner.nextInt();
 }
 }
        System.out.println("Digite os elementos da matriz B:");
         for (int i = 0; i < linhasB; i++) {
         for (int j = 0; j < colunasB; j++) {
        System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
         matrizB[i][j] = scanner.nextInt();
 }
 }
 
         int[][] matrizC = new int[linhasA][colunasB];
         for (int i = 0; i < linhasA; i++) {
         for (int j = 0; j < colunasB; j++) {
           for (int k = 0; k < colunasA; k++) {
          matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
 }
 }
 }
 
         System.out.println("Matriz resultante C:");
           for (int i = 0; i < linhasA; i++) {
           for (int j = 0; j < colunasB; j++) {
         System.out.print(matrizC[i][j] + " ");
 }
         System.out.println();
 }
 }