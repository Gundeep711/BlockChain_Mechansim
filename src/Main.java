import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data for initial Block : ");
		String data = sc.nextLine();

		NonenseCoinChain nc = new NonenseCoinChain(data);
		nc.userInput();
	}
}
