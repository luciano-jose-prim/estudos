/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava14;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class ExercicioJava14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        do {
            float totalPagar, valorTresDez = 0;
            int x = 0;
            System.out.println("\n" + "1 - A vista com 10% de desconto");
            System.out.println("2 - Em duas vezes (preço da etiqueta)");
            System.out.println("3 - de 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$100,00)");
            System.out.print("Opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor total gasto pelo cliente na loja: ");
                    totalPagar = entrada.nextFloat();
                    float valorVista = calcularAVista(totalPagar);
                    System.out.println("O valor a vista é de: R$ " + valorVista);
                    break;
                case 2:
                    System.out.print("Informe o valor total gasto pelo cliente na loja: ");
                    totalPagar = entrada.nextFloat();
                    float valorDuas = calcularDuasParcelas(totalPagar);
                    System.out.println("O valor de cada parcela é de: R$ " + valorDuas);
                    break;
                case 3:
                    System.out.print("Informe o valor total gasto pelo cliente na loja: ");
                    totalPagar = entrada.nextFloat();
                    if (totalPagar > 100.0) {
                        System.out.print("Informe o número de parcelas: ");
                        x = entrada.nextInt();
                        if (x >= 3 && x <= 10) {
                            valorTresDez = calcularTresADezParcelas(totalPagar, x);
                        } else {
                            System.out.println("O número de parcelas deve ser de 3 até 10 vezes");
                        }
                    } else {
                        System.out.println("Parcelamento disponível apenas para compras acima de R$100,00");
                    }
                    if (x >= 3 && x <= 10) {
                        System.out.println("O valor de cada parcela é de: R$ " + valorTresDez);
                    }

                    break;
                case 0:
                    System.out.println("O sistema de pagamento está sendo cancelado...");
                    break;
                default:
                    System.out.println("Opcao inválida!!! escolha um item disponível 1,2ou 3!");
            }
        } while (opcao != 0);

    }

    public static float calcularAVista(float totalPagar) {
        float valorFinal = (float) (totalPagar - (totalPagar * 0.1));
        return valorFinal;
    }

    public static float calcularDuasParcelas(float totalPagar) {
        float valorParcela = totalPagar / 2;
        return valorParcela;
    }

    public static float calcularTresADezParcelas(float totalPagar, int x) {
        float valorEmVezes = (float) ((totalPagar / x + (totalPagar * 0.03)));
        return valorEmVezes;
    }

}
