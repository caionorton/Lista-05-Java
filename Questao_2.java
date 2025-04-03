// Questão 02: Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234.
// Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO CASO
// a senha seja inválida.

import java.util.Scanner;

public class Questao_2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = leitor.nextInt();

        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }

    }
}

