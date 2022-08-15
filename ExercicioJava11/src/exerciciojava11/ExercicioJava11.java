/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava11;

import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class ExercicioJava11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); {
        
        float  maiorConsumo = 0, menorConsumo = 0, mediaGeral = 0,
              residencialT = 0, comercialT = 0, industrialT = 0;
        String residencial = "r", comercial = "c", industrial = "i";
        
        System.out.print("Informe a quantidade de consumidores: ");
        int q = entrada.nextInt();
        
        for(int i = 0;i < q;i ++) {
        System.out.print("Informe o número do consumidor: ");
        int numConsumidor = entrada.nextInt();
        System.out.print("Informe o Preço do KWh consumido: ");
        float precoCon = entrada.nextInt();
        System.out.print("Informe a Quantidade de KWh consumidos durante o mês: ");
        float quantMes = entrada.nextInt();
        System.out.print("Informe o Código do tipo de consumidor (r = residencial, c = comercial, i = industrial): ");
        String opcao = entrada.next();
        
        if(i == 0) {
            maiorConsumo = quantMes;
            menorConsumo = quantMes;
        }else {
            if(quantMes > maiorConsumo) {
            maiorConsumo = quantMes;
            }
            if(quantMes < menorConsumo) {
            menorConsumo = quantMes;
        }
        }
        
        if(opcao.equalsIgnoreCase(residencial)) {
            quantMes = precoCon * quantMes;
            residencialT = quantMes + residencialT;
        }else if (opcao.equalsIgnoreCase(comercial)) {
            quantMes = precoCon * quantMes;
            comercialT = quantMes + comercialT;
        }else if (opcao.equalsIgnoreCase(industrial)) {
            quantMes = precoCon * quantMes;
            industrialT = quantMes + industrialT;
        }else{
            System.out.println("O código digitado é inválido");
        }
        
            mediaGeral = (residencialT + comercialT + industrialT) / q;
            
            System.out.println("O número do consumidor é: " + numConsumidor);
            System.out.println("O total a pagar de cada consumidor é: " + quantMes);
            System.out.println("O maior consumo é: " + maiorConsumo);
            System.out.println("O menor consumo é: " + menorConsumo);
            
        }
            System.out.println("O maior consumo é: " + maiorConsumo);
            System.out.println("O menor consumo é: " + menorConsumo);
            System.out.println("O total de consumo para residencial é: " + residencialT);
            System.out.println("O total de consumo para comercial é: " + comercialT);
            System.out.println("O total de consumo para industrial é: " + industrialT);
            System.out.println("A média geral é de: " + mediaGeral);
    }
    }  
}
//11. Deseja-se fazer uma pesquisa a respeito do consumo mensal de energia elétrica em uma determinada
//cidade. Para isso, são fornecidos os seguintes dados:
//• Preço do KWh consumido;
//• Número do consumidor;
//• Quantidade de KWh consumidos durante o mês;
//• Código do tipo de consumidor (residencial, comercial, industrial).
//Fazer um programa que:
//• Leia os dados descritos acima;
//• Calcule:
//❖ Para cada consumidor, o total a pagar;
//❖ O maior consumo verificado;
//❖ O menor consumo verificado;
//❖ O total de consumo para cada um dos três tipos de consumidores;
//❖ A média geral de consumo
//• Escreva:
//❖ Para cada consumidor, o seu número e o total a pagar
//❖ O que foi calculado nos itens anteriores.