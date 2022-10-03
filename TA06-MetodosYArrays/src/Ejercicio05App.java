import javax.swing.JOptionPane;

public class Ejercicio05App {

	public static void main(String[] args) {
		// pido al usuario el número que será traducido a binario
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para pasarlo a binario "));
		System.out.println("El número "+num+" en binario és: "+toBinary(num));
	}

	//esta función pasa un número a binario, dividiéndolo tantas veces como es posible entre 2 y guardando el resto de la división
	//esta colección de restos de abajo a arriba forman el equivalente binario
	public static String toBinary(int num) {
		String retorno = "";
		while(num>0) {
			retorno = (num%2) + retorno;
			num = num/2;
		}
		return retorno;
	}
	
}
