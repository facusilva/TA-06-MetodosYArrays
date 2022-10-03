import javax.swing.JOptionPane;

public class Ejercicio08App {

	public static void main(String[] args) {
		// declaro el array numeros y llamo al método rellenarArray() para asignarle valores
		int numeros[] = rellenarArray();;
		mostrarValores(numeros);
	}
	
	//recorro el array numeros y asigno a cada posición el valor que introduzca el usuario por teclado
	public static int[] rellenarArray() {
		int numeros[] = new int[10];
		for(int i = 0;i<numeros.length;i++) {
			numeros[i]= Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para la posición "+i)); 
		}
		return numeros;
	}
	
	//recorro el array numeros y muestro su contenido
	public static void mostrarValores(int[] numeros) {
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("En la posición "+i+" tenemos el valor :"+ numeros[i]);
		}
	}

}
