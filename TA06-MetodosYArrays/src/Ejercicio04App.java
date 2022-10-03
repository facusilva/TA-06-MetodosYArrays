import javax.swing.JOptionPane;

public class Ejercicio04App {

	public static void main(String[] args) {
		// pido al usuario el número del cual calcularemos el factorial
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para calcular su factorial "));
		System.out.println("El factorial de "+num+" és: "+calcularFactorial(num));
	}
	
	//Esta función calcula el factorial haciendo un búcle descendente que va del propio número que recibe hasta el 1, multiplicando sucesivamente
	//todos los números que le preceden
	public static int calcularFactorial(int num) {
		int resultado = 1;
		for(int i = num;i>1;i--) {
			resultado = resultado * i;
		}
		return resultado;
	}

}
