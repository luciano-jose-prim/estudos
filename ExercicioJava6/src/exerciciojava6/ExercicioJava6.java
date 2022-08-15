/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava6;

import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class ExercicioJava6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de tanques cheio: ");
        int x = entrada.nextInt();

        for (int contador = 0; contador < x; contador++) {

            System.out.print("Quilômetros dirigidos: ");
            int quilometros = entrada.nextInt();
            System.out.print("Litros de gasolina consumidos: ");
            int litros = entrada.nextInt();

            float media = quilometros / litros;

            System.out.println("O consumo foi de: " + media + " km/l");
        }
    }

}
