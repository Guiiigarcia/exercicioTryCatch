package aplication;

import model.entities.Conta;
import model.exception.DomainException;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Entre com o número da conta ");
            System.out.print("Número: ");
            int numeroDaConta = sc.nextInt();
            System.out.print("Nome do titular: ");
            sc.nextLine();
            String nomeDaConta = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double limiteSaque = sc.nextDouble();

            Conta conta = new Conta(numeroDaConta, nomeDaConta, saldo, limiteSaque);

            System.out.print("Quantos de dinheiro vai sacar: ");
            double saque = sc.nextDouble();
            conta.saque(saque);

            System.out.println("Saldo atual: R$" + String.format("%.2f", conta.getSaldo()));
        }catch (DomainException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
