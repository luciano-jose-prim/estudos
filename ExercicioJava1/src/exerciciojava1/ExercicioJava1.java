/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava1;

import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class ExercicioJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int a = entrada.nextInt();
        System.out.print("Informe o segundo número:");
        int b = entrada.nextInt();
        System.out.print("Informe o terceiro número:");
        int c = entrada.nextInt();

        int soma = a + b + c;
        int media = (a + b + c) / 3;
        int produto = a * b * c;
        int maior = (a > b && a > c) ? a : ((b > c) ? b : c);
        int menor = (a < b && a < c) ? a : ((b < c) ? b : c);

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("A média é: " + media);
        System.out.println("O produto é :" + produto);
        System.out.println("O maior número informado é: " + maior);
        System.out.println("O menor número informado é: " + menor);
    }

}
