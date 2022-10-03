import javax.swing.JOptionPane;

public class Ejercicio06App {

	public static void main(String[] args) {
		// Pido al usuario un número entero
		int num;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero positivo y te diré cuantas cifras tiene "));
		}while(num<=0);
		System.out.println("El número "+num+" tiene "+contarCifras(num)+" cifras");
	}
	
	//convierto el número a un string, de esta manera si uso el método length me dirá el largo de la cadena de texto, equivalente al
	//número de cifras que tiene el número original
	public static int contarCifras(int num) {
		String numero = Integer.toString(num);
		return numero.length();
	}

}
