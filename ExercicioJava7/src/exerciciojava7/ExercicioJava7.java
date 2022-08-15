/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava7;

import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class ExercicioJava7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe quantos empregados são: ");
        int x = entrada.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print("Informe o nome do empregado: ");
            String nome = entrada.next();
            System.out.print("Forneça o número de horas trabalhadas: ");
            float horasTra = entrada.nextFloat();
            System.out.print("Informe o salário-hora do empregado: ");
            float salHora = entrada.nextFloat();

            float salBruto;
            float horaExtra = 0;
            float salAdicional = 0;

            if (horasTra <= 40) {
                salBruto = salHora * horasTra;

            } else {
                horaExtra = horasTra - 40;
                salAdicional = (float) (horaExtra * 0.5) * salHora;
                salBruto = (salHora * horasTra) + salAdicional;

            }
            System.out.println("Funcionário: " + nome);
            System.out.println("Horas trabalhadas: " + horasTra);
            System.out.println("Sálario-hora: " + salHora);
            System.out.println("Hora(s) Extra: " + horaExtra);
            System.out.println("A gratificação pelas horas extras foi de: " + salAdicional);
            System.out.println("Salário bruto: " + salBruto);
        }
    }

}
