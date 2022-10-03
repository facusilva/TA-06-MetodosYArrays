import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {
		// El usuario introduce un entero
		int size = Integer.parseInt(JOptionPane.showInputDialog("Indica el tamaño que tendrá el array")); 
		// Declaro los arrays con el tamaño que ha elegido el usuario
		int[] numeros1 = new int[size];
		int[] numeros2 = new int[size];
		rellenarAleatorios(numeros1);
		rellenarAleatorios(numeros2);
		int[] numeros3 = multiplicaValores(numeros1,numeros2);
		System.out.println("Primer array");
		visualizarArray(numeros1);
		System.out.println("Segundo array");
		visualizarArray(numeros2);
		System.out.println("Tercer array");
		visualizarArray(numeros3);
	}

	//recorro y relleno el array con números aleatorios entre el 0 y el 99
	public static void  rellenarAleatorios(int[] numeros) {
		Random aleatorio = new Random();
		int i = 0;
		while(i<numeros.length) {
			numeros[i] = aleatorio.nextInt(99);
			i++;
		}
	}
	
	//recorro el tercer array y asigno a cada posición el valor de los otros dos arrays en la misma posición multiplicados entre si
	public static int[] multiplicaValores( int[] numeros1, int[] numeros2) {
		int[] numeros3 = new int[numeros1.length];
		for(int i = 0;i<numeros3.length;i++) {
			numeros3[i] = numeros1[i] * numeros2[i];
		}
		return numeros3;
	}
	
	//recorro el array y muestro todos los valores almacenados en ella y su indice correspondiente
	public static void visualizarArray(int[] numeros) {
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("En la posición "+i+" tenemos el valor: "+numeros[i]);
		}
	}
}
