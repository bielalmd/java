package br.com.generation.atividades02;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, num2, num3;
        int maiorNum;

         System.out.println("Escreva o 1° numero: ");
         num1 = ler.nextInt();

         System.out.println("Escreva o 2° numero: ");
         num2 = ler.nextInt();

         System.out.println("Escreva o 3° numero: ");
         num3 = ler.nextInt();

         if((num1 > num2) && (num1 > num3)) {
             System.out.println("O maior numero é o numero: " + num1);
         }
         else if((num2 > num1) && (num2 > num3)) {
             System.out.println("O maior numero é o numero: " + num2);
         }

         else if((num3 > num1) && (num3 > num2)) {
             System.out.println("O maior numero é o numero: " + num3);
         }
         else if((num1 == num2) && (num2 == num3)) {
             System.out.println("Os numeros são iguais!");


         }
    }
}