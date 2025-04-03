// Questão 03: Faça um programa que dada a idade de uma pessoa, retorna uma das seguintes
// mensagens: "Não pode nem votar e nem dirigir" , "Pode votar, mas não pode dirigir" ,
// "Pode votar e dirigir".

import java.util.Scanner;

public class Questao_3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = leitor.nextInt();

        if (idade < 16) {
            System.out.println("Não pode nem votar e nem dirigir");
        } else if (idade < 18) {
            System.out.println("Pode votar, mas não pode dirigir");
        } else {
            System.out.println("Pode votar e dirigir");
        }

    }
}