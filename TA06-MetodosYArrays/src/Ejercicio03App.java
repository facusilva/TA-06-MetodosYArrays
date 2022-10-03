import javax.swing.JOptionPane;

public class Ejercicio03App {

	public static void main(String[] args) {
		//Le pido al usuario que introduzca un número entero
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número y te diré si es primo o no "));
		//compruebo si es primo con la función esPrimo, dependiendo si es primo o no lo és mostraré un mensaje u otro
		if(esPrimo(num)) {
			System.out.println("El número "+num+" es primo");
		}else {
			System.out.println("El número "+num+" NO es primo");
		}
	
	}
	
	//recibo por parámetros el número a comprobar, si es primo devuelvo true y si no lo és devuelvo false;
	public static boolean esPrimo(int num) {
		//Asumimos que el número es primo
		boolean retorno = true;
		//si el número es 1, no es primo por tanto devuelvo false
		if(num == 1) {
			retorno = false;
		}else {
			//si no es 1 ,hago un bucle que divida el número por todos los números que le preceden (excepto el 1)
			for(int i=2;i<num;i++) {
				//si alguna de estas divisiones da 0 como resto, significa que no es primo
				if(num%i == 0) {
					retorno = false;
				}
			}
		}
		return retorno;
	}

}
