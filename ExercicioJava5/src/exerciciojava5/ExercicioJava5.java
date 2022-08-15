/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava5;

import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class ExercicioJava5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = 1;
        while (opcao != 0) {

            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog("Escolha o produto\n"
                            + "1 - Alimento não-perecível\n2,3 ou 4 - alimento perecível\n5 ou 6 - vestuário\n"
                            + "7 - higiene pessoal\n8 até 15 - limpeza e utensílios domésticos"));
            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Selecionado: Alimento não-perecível");
                    break;
                case 2:
                case 3:
                case 4:
                    JOptionPane.showMessageDialog(null, "Selecionado: Alimento perecível");
                    break;
                case 5:
                case 6:
                    JOptionPane.showMessageDialog(null, "Selecionado: Vestuário");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Selecionado: Higiene pessoal");
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    JOptionPane.showMessageDialog(null, "Selecionado: Limpeza e Utensílios domésticos");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao inválida!!! Selecione uma opcão de 1 a 15");

            }
        }
    }

}
