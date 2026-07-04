package ContaBanco_dio;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int Numero = sc.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = sc.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", Conta " + Numero + " e se saldo é " + saldo + " Já está disponível para saque");
    }
}