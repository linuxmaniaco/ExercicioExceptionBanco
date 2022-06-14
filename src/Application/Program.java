package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Type your information to create a new account: ");
		System.out.print("Type number of account");
		Integer number = sc.nextInt(); sc.nextLine();
		System.out.print("Type the name: ");
		String holder = sc.nextLine();
		double balance = 0;
		double withdrawLimit = 300;
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Congractulation, you have a new account.");
		System.out.print("Seu saldo é: " + balance);
		System.out.println("");
		
		int end = 0;
		while(end == 0) {
			try {
			
				System.out.println(" \n Deposit type: 1 / Withdraw type: 2 / Change WithdrawLimit type: 3 / See Balance: 4 / to finish type 9 ");
				int key = sc.nextInt();
				switch (key) {
				case 1:
					System.out.print("deposit: ");
					double deposito = sc.nextDouble();
					acc.deposit(deposito);
					
					break;
				
				case 2:
					System.out.println("Withdraw: ");
					double saque = sc.nextDouble();
					acc.Withdraw(saque);
					
					break;
					
				case 3:
					System.out.println("WithdrawLimit");
					double WDL = sc.nextDouble();
					acc.setWithdrawLimit(WDL);
					
					break;
					
				case 4:
					System.out.println("Your balance is: " + acc.getBalance());
					
					
					break;
					
				default:
					System.out.println("Do you wish ending the program? 1=Sim / 0=Não");
					end = sc.nextInt();
					System.out.println("Closing menu");
					break;
				}
			
			}
			catch (Exception e) {
				System.out.println("Error on withdraw: " + e.getMessage());
			}
			
						
		}
		
		System.out.println("Thanks, bye!");
		
		

	}

}
