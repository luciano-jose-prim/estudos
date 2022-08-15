/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava8;

import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class ExercicioJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe quantas mercadorias serão calculadas: ");
        int m = entrada.nextInt();

        int contMenorDez = 0, contEntre = 0, contMaiorVinte = 0;
        float compra, venda, lucro, totalCompra = 0, totalVenda = 0, totalLucro = 0;

        for (int i = 0; i < m; i++) {

            System.out.print("Informe o nome da mercadoria: ");
            String nomeMerc = entrada.next();
            System.out.print("Informe o valor de compra: ");
            compra = entrada.nextFloat();
            System.out.print("Informe o valor de venda: ");
            venda = entrada.nextFloat();

            lucro = venda - compra;
            float percentualLucro = lucro / compra * 100;

            if (percentualLucro < 10) {
                contMenorDez++;
            } else if (percentualLucro <= 20) {
                contEntre++;
            } else {
                contMaiorVinte++;
            }
            System.out.println("Nome da mercadoria: " + nomeMerc);
            System.out.println("Valor de compra: " + compra);
            System.out.println("Valor de venda: " + venda);
            System.out.println("O lucro é de: " + lucro);
            System.out.println("O percentual de lucro é de: " + percentualLucro + " %");

            totalCompra = totalCompra + compra;
            totalVenda = totalVenda + venda;
            totalLucro = totalLucro + lucro;
        }

        System.out.println("Total de mercadorias com lucro menor que 10 %: " + contMenorDez);
        System.out.println("Total de mercadorias com lucro entre 10% e 20 %: " + contEntre);
        System.out.println("Total de mercadorias com lucro maior que 20 %: " + contMaiorVinte);
        System.out.println("O valor total da compra das mercadorias foi de: " + totalCompra);
        System.out.println("O valor total da venda das mercadorias foi de: " + totalVenda);
        System.out.println("O valor total do lucro das mercadorias foi de: " + totalLucro);
    }

}
