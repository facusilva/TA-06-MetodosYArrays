import javax.swing.JOptionPane;
import java.util.Random;

public class Ejercicio02App {

	public static void main(String[] args) {
		//le pido al usuario la cantidad de números aleatorios, y el rango en el que se comprenden los números que se generarán
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuántos números aleatorios quieres generar?: "));
		int iniciorango = Integer.parseInt(JOptionPane.showInputDialog("Indica el inicio del rango: "));
		int finalrango = Integer.parseInt(JOptionPane.showInputDialog("Indica el final del rango: "));
		numerosAleatorios(cantidad, iniciorango, finalrango);
	}
	
	public static void numerosAleatorios(int cantidad, int min, int max) {
		//hago un bucle con tantas iteraciones como números quiere el usuario
		for(int i = 0;i<cantidad;i++){
			Random aleatorio = new Random();
			//genero un número aleatorio en el rango que ha elegido el usuario y lo muestro por pantalla
			int N = aleatorio.nextInt(max - min + 1) + min ;
			System.out.println(N);
		}
	}

}
