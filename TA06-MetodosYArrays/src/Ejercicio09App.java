import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio09App {

	public static void main(String[] args) {
		// El usuario introduce un entero
		int size = Integer.parseInt(JOptionPane.showInputDialog("Indica el tamaño que tendrá el array")); 
		// Declaro el array con el tamaño que ha elegido el usuario
		int[] numeros = new int[size];
		int total = rellenarAleatorios(numeros);
		visualizarArray(numeros);
		System.out.println("Suma total de los valores del array = "+total);
	}
	
	//recorro y relleno el array con números aleatorios entre el 0 y el 9 y sumo el total de los valores que voy introduciendo
	public static int rellenarAleatorios(int[] numeros) {
		Random aleatorio = new Random();
		int total = 0;
		for(int i = 0;i<numeros.length;i++) {
			numeros[i] = aleatorio.nextInt(10);
			total = total+numeros[i];
		}
		return total;
	}
	
	//recorro el array y muestro todos los valores almacenados en ella y su indice correspondiente
	public static void visualizarArray(int[] numeros) {
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("En la posición "+i+" tenemos el valor: "+numeros[i]);
		}
	}
	

}
