/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava2;

import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class ExercicioJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe um valor para o raio: ");
        float raio = entrada.nextFloat();
        
        float diametro = 2 * raio;
        float circunferencia =  2 * (float) Math.PI * raio;
        float area = (float) Math.PI * (float) Math.pow(raio, 2);
        
        System.out.println("O diametro é: " + diametro);
        System.out.println("O valor de pi é: " + Math.PI);
        System.out.println("A circunferência é: " + circunferencia);
        System.out.println("A área é: " + area);
    }
    
}
