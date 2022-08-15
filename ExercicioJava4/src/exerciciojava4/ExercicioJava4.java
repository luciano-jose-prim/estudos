/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava4;

import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class ExercicioJava4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta = "sim";
        String opcao;

        do {
            System.out.print("Informe o índice de poluição: ");
            float indice = entrada.nextFloat();

            if (indice >= 0) {
                if (indice == 0 || indice <= 0.25) {
                    System.out.println("Índice de poluição aceitavél!");
                } else if (indice <= 0.30) {
                    System.out.println("As indústrias do 1º grupo são intimadas a suspenderem suas atividades!");
                } else if (indice < 0.41) {
                    System.out.println("As indústrias do 1º e 2º grupo são intimadas a suspenderem suas atividades!");
                } else {
                    System.out.println(" todos os grupos devem ser notificados a paralisarem suas atividades!");
                }
            } else {
                System.out.println("Dado inválido");
            }
            System.out.print("Deseja avaliar outro indíce?(sim/não): ");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase(resposta));
    }

}
