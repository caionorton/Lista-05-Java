// Questão 05: Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais)
// e escrevê-los em ordem decrescente.

import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = leitor.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Valores inválidos: os números devem ser distintos.");
            return;
        }

        int maior, meio, menor;

        if (num1 > num2 && num1 > num3) {
            maior = num1;
            if (num2 > num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
            if (num1 > num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 > num2) {
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num1;
            }
        }

        System.out.println("Números em ordem decrescente: " + maior + ", " + meio + ", " + menor);
    }
}

