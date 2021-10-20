import java.util.Scanner;


public class Hello {

	public static void main(String[] args) {
		System.out.print("Enter name: ");
		Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
		System.out.println(s+","+" " + "Welcome to the App!");
		System.out.println(":)");
	}

}
