import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {
		// El usuario introduce un entero
		int size = Integer.parseInt(JOptionPane.showInputDialog("Indica el tamaño que tendrá el array")); 
		// Declaro el array con el tamaño que ha elegido el usuario
		int[] numeros = new int[size];
		int mayor = rellenarAleatorios(numeros);
		visualizarArray(numeros);
		System.out.println("El número más grande entre ellos es: "+mayor);
	}
	
	//recorro y relleno el array con números aleatorios entre el 0 y el 9 y guardo el que sea más grande
	public static int  rellenarAleatorios(int[] numeros) {
		Random aleatorio = new Random();
		int i = 0;
		int mayor = 0;
		while(i<numeros.length) {
			int num = aleatorio.nextInt(999);
			if(esPrimo(num)) {
				numeros[i] = num;
				i++;
				if(num>mayor) {
					mayor = num;
				}
			}
		}
		return mayor;
	}
		
	//compruebo si un número es primo, comprobando el residuo de todas las divisiones desde el 1 hasta el valor del propio número
	public static boolean esPrimo(int num) {
		boolean retorno = true;
		if(num == 1) {
			retorno = false;
		}else {
			for(int i=2;i<num;i++) {
				if(num%i == 0) {
					retorno = false;
				}
			}
		}
		return retorno;
	}
	
	//recorro el array y muestro todos los valores almacenados en ella y su indice correspondiente
	public static void visualizarArray(int[] numeros) {
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("En la posición "+i+" tenemos el valor: "+numeros[i]);
		}
	}

}
