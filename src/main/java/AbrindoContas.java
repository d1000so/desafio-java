package src.main.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AbrindoContas {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta

        System.out.print("Nome do Titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        //DONE:
        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");
        //DONE:
        System.out.println("Conta: " + contaBancaria.getNumero());
        System.out.println("Titular: " + contaBancaria.getTitular());
        System.out.println("Saldo: R$ " + contaBancaria.getSaldo());
    }
}
