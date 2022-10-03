import javax.swing.JOptionPane;

public class Ejercicio07App {

	public static void main(String[] args) {
		// Pido el usuario un número que representa una cantidad en euros y el nombre de la divisa a la que lo quiere convertir
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad en euros a convertir "));
		String divisa = JOptionPane.showInputDialog("Indica a qué divisa quieres convertir esta cantidad (Libras/Dólares/Yenes ");
		convertirDivisas(cantidad,divisa);
	}
	
	public static void convertirDivisas(int cantidad, String divisa) {
		//con un switch compruebo qué divisa quiere el usuario y hago el cálculo correspondiente y lo muestro por pantalla
		switch(divisa.toLowerCase()) {
		case "libras":
			System.out.println(cantidad+" euros al cambio són "+(cantidad*0.86)+" libras.");
			break;
		case "dólares":
			System.out.println(cantidad+" euros al cambio són "+(cantidad*1.28611)+" dólares.");
			break;
		case "yenes":
			System.out.println(cantidad+" euros al cambio són "+(cantidad*129.852)+" yenes.");
			break;
		}
	}

}
