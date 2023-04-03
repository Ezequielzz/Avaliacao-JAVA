package Avaliacoes;

import java.util.Scanner;

class Atividades {
    Scanner sc = new Scanner(System.in);

    public void atividade1() {

        System.out.println("Informe o 1º Valor");
        double valor1 = sc.nextDouble();
        System.out.println("Informe o 2º Valor");
        double valor2 = sc.nextDouble();
        System.out.println("Escolha a Operção: 1 ~ + | 2 ~ - | 3 ~ * | 4 ~ /");
        int operacao = sc.nextInt();
        switch (operacao) {
            case 1: {
                double total = valor1 + valor2;
                System.out.println("O Valor da Operação é " + total);
                break;
            }
            case 2:
                double total = valor1 - valor2;
                System.out.println("O Valor da Operação é " + total);
                break;

            case 3: {
                total = valor1 * valor2;
                System.out.println("O Valor da Operação é " + total);
                break;
            }
            case 4:
                if (valor2 == 0) {
                    System.out.println("Não é Possível Dividir por 0");
                }
                total = valor1 / valor2;
                System.out.println("O Valor da Operação é " + total);
                break;

            default:
                System.out.println("O Valor é Incorreto");
                break;

        }

    }

    public void atividade2() {
        System.out.println("Digite Seu Nº de Matrícula");
        int matricula = sc.nextInt();
        int time = matricula % 4 + 1;
        if (time == 1) {
            System.out.println("Time do Chris");
        } else if (time == 2) {
            System.out.println("Time do Greg");
        } else if (time == 3) {
            System.out.println("Time do Caruso");
        } else {
            System.out.println("Time do Jerome");

        }
    }



    public void atividade3() {
        System.out.println("Informe a Quantidade de Morangos Adquiridos:");
        double morango = sc.nextDouble();
        double precoMorango = morango * 3.50;
        System.out.println("Informe a Quantidade de Maçãs Adquiridas:");
        double macas = sc.nextDouble();
        double precoMaca = macas * 2.30;
        System.out.println("Informe a Quantidade de Bananas Adquiridas:");
        double bananas = sc.nextDouble();
        double precoBanana = bananas * 1.80;

        double precoKg = precoBanana + precoMaca + precoMorango;
        double totalKg = bananas + macas + morango;
        if (totalKg > 15 || precoKg > 30) {
            double total = precoKg - precoKg * 0.1;
            System.out.println("O Valor Foi Descontado em 10%! o Preço final da Compra é R$" + total);
        }

     }
}