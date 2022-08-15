/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava12;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class ExercicioJava12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;

        int opcao = 1;
        while (opcao != 0) {
            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog("Escolha a opcao\n"
                            + "1 - informarEntrada\n2 - Área do trapézio\n3 - Área do quadrado\n4 - Área do cubo\n5 - Sair"));
            switch (opcao) {
                case 1:
                    System.out.println("Informe 3 números inteiros: ");
                    a = informarEntrada();
                    b = informarEntrada();
                    c = informarEntrada();
                    break;
                case 2:
                    int areaTrapezio = calcularTrapezio(a, b, c);
                    System.out.println("A área do trapézio é de: " + areaTrapezio);
                    break;
                case 3:
                    int areaQuadrado = calcularQuadrado(b);
                    System.out.println("A área do quadrado é de: " + areaQuadrado);
                    break;
                case 4:
                    int areaCubo = calcularCubo(c);
                    System.out.println("A área do cubo é de: " + areaCubo);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Finalizado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao inválida!!! escolha um item disponível 1,2,3,4 ou 5");
            }
        }
    }

    public static int informarEntrada() {
        Scanner entrada = new Scanner(System.in);

        int x;
        x = entrada.nextInt();

        return x;

    }

    public static int calcularTrapezio(int a, int b, int c) {
        int calculoTrapezio = (a + b) * c / 2;
        return calculoTrapezio;
    }

    public static int calcularQuadrado(int b) {
        int calculoQuadrado = b * b;
        return calculoQuadrado;
    }

    public static int calcularCubo(int c) {
        int calculoCubo = 6 * (c * c);
        return calculoCubo;
    }

}
