/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava3;

import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class ExercicioJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta = "sim";
        String opcao;

        do {
            System.out.print("Informe o primeiro número: ");
            int A = entrada.nextInt();
            System.out.print("Informe o segundo número: ");
            int B = entrada.nextInt();
            System.out.print("Informe o terceiro número: ");
            int C = entrada.nextInt();

            if (A < B + C && B < C + A && C < A + B) {
                if (A == B && A == C) {
                    System.out.println("É um triangulo equilátero");
                } else if (A == B || A == C || B == C) {
                    System.out.println("É um triangulo isosceles");
                } else {
                    System.out.println("É um triangulo escaleno");
                }
            } else {
                System.out.println("Não é um triangulo!!!");
            }
            System.out.print("Deseja avaliar outra medida?(sim/não): ");
            opcao = entrada.next();

        } while (opcao.equalsIgnoreCase(resposta));
    }

}
