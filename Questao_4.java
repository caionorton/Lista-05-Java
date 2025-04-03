// Questão 04: Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de
// Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11%
// do salário bruto, mas não é descontado (é a empresa que deposita). O salário líquido corresponde ao salário bruto
// menos os descontos. O programa deverá pedir ao usuário o valor de sua hora e a quantidade de horas trabalhadas no mês.

// a. Desconto do IR;
// b. Salário Bruto até R$ 900,00 (inclusive) - Isento;
// c. Salário Bruto de R$ 1500,00 (inclusive) - desconto de 5%;
// d. Salário Bruto até R$ 2500,00 (inclusive) - desconto de 10%;
// e. Salário Bruto acima de 2500 - Desconto de 20%

// Imprima na tela as informações, dispostas conforme o exemplo abaixo.
// No exemplo o valor da hora é 5 e a quantidade de hora é 220.
//
// Salário Bruto: (5 * 220) : R$ 1100,00
// (-) IR (5%)              : R$   55,00
// (-) INSS ( 10%)          : R$  110,00
// FGTS (11%)               : R$  121,00
// Total de descontos       : R$  165,00
// Salário Liquido          : R$  935,00

import java.util.Scanner;

public class Questao_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora: ");
        int valorHora = leitor.nextInt();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = leitor.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = salarioBruto * 0.10;
        double fgts = salarioBruto * 0.11;
        double ir = 0;

        if (salarioBruto > 2500) {
            ir = salarioBruto * 0.20;
        } else if (salarioBruto >= 1500) {
            ir = salarioBruto * 0.10;
        } else if (salarioBruto >= 900) {
            ir = salarioBruto * 0.05;
        }

        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto " + "(" + valorHora + "*" + horasTrabalhadas + ")" + ": R$ " + salarioBruto);
        System.out.println("(-) IR (5%): R$ " + ir);
        System.out.println("(-) INSS (10%): R$ " + inss);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

    }
}