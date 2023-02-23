package arrayEnteroRepetido;
import java.util.Scanner;

public class ArrayEnteroRepetido {

	public static void main(String[] args) {
		
		int[] arrayEntero;
		arrayEntero = new int[10];
		int max = 0;
		int aux = 0;
		int cont;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese diez numeros enteros: ");
		for (int i = 0; i < arrayEntero.length; i++) {
			arrayEntero[i] = scanner.nextInt();
			cont = 0;
			for (int j = 0; j < arrayEntero.length; j++) {
				if (arrayEntero[i] == arrayEntero[j]) {
					cont++;
					if(cont > max) {
						max = cont;
						aux = arrayEntero[i];
					}
				}
			}
		}
		System.out.println("El numero que mas se repite es " + aux + ", " + max + " veces.");	
	}
}