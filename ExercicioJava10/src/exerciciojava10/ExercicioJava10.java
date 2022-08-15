/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava10;

import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class ExercicioJava10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        {

            int maiorCodigo = 0, codigo;
            float maiorCandiVaga = 0;

            System.out.print("Informe a quantidade de cursos: ");
            int q = entrada.nextInt();

            for (int i = 0; i < q; i++) {
                System.out.print("Informe o código do curso: ");
                codigo = entrada.nextInt();
                System.out.print("Informe o número de vagas: ");
                int vagas = entrada.nextInt();
                System.out.print("Informe o número de candidatos do sexo masculino: ");
                int numM = entrada.nextInt();
                System.out.print("Informe o número de candidatos do sexo feminino: ");
                int numF = entrada.nextInt();

                int totalCandi = numM + numF;
                float candiPorVaga = (float) totalCandi / vagas;
                float porcenF = (float) 100 * numF / totalCandi;

                if (candiPorVaga > maiorCandiVaga) {
                    maiorCandiVaga = candiPorVaga;
                    maiorCodigo = codigo;
                }

                System.out.println("Código do curso: " + codigo);
                System.out.println("Número de candidatos: " + candiPorVaga);
                System.out.println("Porcentagem de candidatos do sexo feminino: " + porcenF + "%");
                System.out.println("O total de candidatos é de: " + totalCandi);
            }
            System.out.println("O maior número de candidatos por vaga é de: " + maiorCandiVaga
                    + " e o código do curso é: " + maiorCodigo);
        }

    }

}
