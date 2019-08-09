import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data for Genesis Block : ");
		String data = sc.nextLine();

		NonenseCoinChain nc = new NonenseCoinChain(data);

		
		Scanner input = new Scanner(System.in);
		System.out.println("1. View Chain \n2.Mining \n3.Validate");

		if (input.nextInt() == 1) {
			
			nc.view();

		} 
		
		else if(input.nextInt()==2) {
			nc.mineNewCoin();

		}
		
		else
		{
			
			
		}
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter data for Genesis Block : ");
		String data = sc.nextLine();

		NonenseCoinChain nc = new NonenseCoinChain(data);

		while (true) {
			boolean flag = nc.mineNewCoin();
			nc.view();
			if (flag) {
				Thread.sleep(10000);
			}
		}*/

		

	}
}
