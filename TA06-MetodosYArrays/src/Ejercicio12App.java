import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// El usuario introduce un entero
		int size = 0;
		do {
			size = Integer.parseInt(JOptionPane.showInputDialog("Indica el tamaño que tendrá el array")); 
		}while(size<=0);
		// Declaro un array con el tamaño que ha elegido el usuario
		int[] numeros = new int[size];
		rellenarAleatorios(numeros);
		int num = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Indica el dígito en el que deben acabar los numeros a mostrar")); 
		}while(num<=0);
		
		int[] nuevoArray = guardarCoincidencias(numeros, num);
		//primero muestro el array original
		System.out.println("Array original : ");
		visualizarArray(numeros);
		//ahora muestro el nuevo array creado con las coincidencias
		System.out.println("Nuevo array con números que acaban en "+num);
		visualizarArray(nuevoArray);
		
	}

	//recorro y relleno el array con números aleatorios entre el 1 y el 300
	public static void  rellenarAleatorios(int[] numeros) {
		Random aleatorio = new Random();
		int i = 0;
		while(i<numeros.length) {
			numeros[i] = 1+ aleatorio.nextInt(300);
			i++;
		}
	}
		
	//recorro el array y muestro todos los valores almacenados en ella y su índice correspondiente
	public static int[] guardarCoincidencias(int[] numeros, int num) {
		int[] retorno = new int[numeros.length];
		int j = 0;
		for(int i = 0;i<numeros.length;i++) {
			if(numeros[i]%10 == num) {
				//si coinciden lo añado al nuevo array
				retorno[j] = numeros[i];
				//aumento el contador en 1 para que la siguiente coincidencia se asigne a la siguiente posición
				j++;
			}
		}
		return retorno;
	}
	
	//recorro el array y muestro todos los valores almacenados en ella mayores a 0 y su indice correspondiente
	public static void visualizarArray(int[] numeros) {
		for(int i = 0;i<numeros.length;i++) {
			if(numeros[i]>0) {
				System.out.println("En la posición "+i+" tenemos el valor: "+numeros[i]);
			}
		}
	}
}
