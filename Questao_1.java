// Questão 01: As maçãs custam R$ 0,30 cada se foram compradas menos do que uma dúzia,
// e R$ 0,25 se foram compradas pelo menos doze. Escreva um programa que leia o
// número de maças compradas, calcule e escreva o valor total da compra.

import java.util.Scanner;

public class Questao_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int numMacas = leitor.nextInt();

        double precoPorMaca;
        if (numMacas >= 12) {
            precoPorMaca = 0.25;
        } else {
            precoPorMaca = 0.30;
        }
        double total = numMacas * precoPorMaca;

        System.out.print("O valor total da compra é R$: " + total);

    }
}

