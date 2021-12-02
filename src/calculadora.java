import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = Integer.parseInt(sc.nextLine());
		int n2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Suma :" + Suma(n1,n2));
		System.out.println("Resta :" + Resta(n1,n2));
		sc.close();
	}
	public static int Suma(int n1, int n2) {
		int resultado = n1 + n2;
		return resultado;
	}
	public static int Resta(int n1, int n2) {
		int resultado = n1 - n2;
		return resultado;
	}
}
