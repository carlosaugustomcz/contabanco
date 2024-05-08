package com.conta.dio;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.print("Digite o número da Conta: ");
		numero = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Digite a Agencia: ");
		agencia = scanner.nextLine();
		
		System.out.print("Digite o nome do Cliente: ");
		nomeCliente = scanner.nextLine();
		
		System.out.print("Digite o Saldo Disponível: ");
		saldo = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia 
				+ ", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");	
		
		scanner.close();
		
	}

}
