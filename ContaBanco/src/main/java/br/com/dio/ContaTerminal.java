package br.com.dio;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scan.nextLine();
        System.out.println("Por favor, digite o número da Conta: ");
        String numero = scan.nextLine();
        System.out.println("Por favor, digite seu Nome: ");
        String nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite seu Saldo: ");
        BigDecimal saldo = scan.nextBigDecimal();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");


    }
}