package Programan;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit ? (y/n) ");
		char response = sc.next().charAt(0);
		//Todas as vareáveis acima são temporárias pelo fato dos atributos serem privados(PRIVATE).
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
			//A instanciação precisa ser feita fora do "IF" ou ela se limitará só ao "IF".
		}
		else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.print("Account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		/*O objeto 'account' precisa ser chamado para que o deposito seja feito, usar como argumento a variavel 'depositValue' 
		 * para que o valor pedido pelo usuario seja compativel com o objeto.
		 */
		System.out.println();
		System.out.print("Update data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.whithdraw(withdrawValue);
		System.out.println();
		System.out.print("Update data: ");
		System.out.println(account);
		
		
		sc.close();
	}

}
