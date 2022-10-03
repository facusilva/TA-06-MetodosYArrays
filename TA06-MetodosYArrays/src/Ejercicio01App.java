import javax.swing.JOptionPane;

public class Ejercicio01App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tipo = JOptionPane.showInputDialog("Introduce el tipo de figura (cuadrado/círculo/triángulo): ");
		//compruebo el input del usuario y si coincide con una de las tres opciones le pido los datos necesarios y los paso a la función
		//que relizará el cálculo
		switch(tipo.toLowerCase()) {
		case "cuadrado":
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));
			JOptionPane.showMessageDialog(null,calcularAreaCuadrado(lado));
			break;
		case "círculo":
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));
			JOptionPane.showMessageDialog(null,calcularAreaCirculo(radio));
			break;
		case "triángulo":
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
			JOptionPane.showMessageDialog(null,calcularAreaTriangulo(base, altura));
			break;
		}
	}
	
	//calculo el área del cuadrado con el argumento que me llega y devuelvo el resultado como un íntegro
	public static int calcularAreaCuadrado(int lado) {
		return lado*lado;
	}
	//calculo el área del círculo con el argumento que me llega y devuelvo el resultado como un double
	public static double calcularAreaCirculo(int radio) {
		return Math.pow(radio, 2)*Math.PI;
	}
	//calculo el área del triángulo con los argumentos que me llegan y devuelvo el resultado como un double
	public static double calcularAreaTriangulo(int base, int altura) {		
		return ((double)base*altura)/2;
	}

}
