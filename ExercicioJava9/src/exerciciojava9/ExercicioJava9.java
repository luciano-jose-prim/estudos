/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava9;

import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class ExercicioJava9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        String resposta;
        float maiorAltura = 0;
        float segMaiorAltura = 0;

        do {
            System.out.print("Digite o nome da moça: ");
            nome = entrada.next();
            System.out.print("Digite a altura: ");
            float altura = entrada.nextFloat();

            if (altura > maiorAltura) {
                segMaiorAltura = maiorAltura;
                maiorAltura = altura;

            } else if (altura > segMaiorAltura && altura < maiorAltura) {
                segMaiorAltura = altura;
            }

            System.out.println("Informar outra candidata?(s/n): ");
            resposta = entrada.next();
        } while ("sim".equals(resposta));

        System.out.println("A maior altura é: " + maiorAltura);
        System.out.println("A segunda maior altura é: " + segMaiorAltura);

        nome = "FIM";
        System.out.println(nome);
    }

}
