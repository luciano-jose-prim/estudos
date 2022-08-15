/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava13;

import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class ExercicioJava13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respostaS = "sim";
        String opcao;
        String cliente;
        float taxaCobrada;
        do {

            System.out.print("Informe o nome do cliente: ");
            cliente = entrada.next();
            System.out.print("Informe a quantidade de horas inteiras que o carro ficou estacionado"
                    + "OBS(se passar de meia hora, considerar uma hora inteira.)(MAX = 24h) : ");
            int hora = entrada.nextInt();

            taxaCobrada = calcularTaxa(hora);
            if (taxaCobrada > 10) {
                taxaCobrada = 10;
            }

            if (taxaCobrada > 0 && taxaCobrada <= 24) {
                System.out.println("Cliente: " + cliente);
                System.out.println("Taxa cobrada: " + "R$" + taxaCobrada);
            } else {
                System.out.println("Calculo de taxa inválido!!!O tempo de estacionamento deve ser maior que 0h e menor que 24h");
            }
            System.out.println("Calcular o tempo de estacionamento de outro cliente? (sim/não): ");
            opcao = entrada.next();

        } while (opcao.equalsIgnoreCase(respostaS));

        System.out.println("Cliente: " + cliente);
        System.out.println("Taxa cobrada: " + "R$" + taxaCobrada);
    }

    public static float calcularTaxa(int hora) {
        float taxa;
        if (hora > 0 && hora <= 3) {
            taxa = 2;
            return taxa;
        } else if (hora > 3 && hora <= 24) {
            taxa = (float) (2 + ((hora - 3) * 0.50));
            return taxa;
        } else {
            taxa = 0;
            return taxa;
        }
    }

}
