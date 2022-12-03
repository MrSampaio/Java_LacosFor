import javax.swing.JOptionPane;
public class triangulo_for {
	public static void main(String[] args) {
		
		
		for(int limite = 0; limite<=9; limite++){

		double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado A: "));
		double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado B: "));
		double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado C: "));
		
		if (A==B && B==C){
			JOptionPane.showMessageDialog(null, "O triângulo é equilátero.");}
		else if (A==B && B!=C){
			JOptionPane.showMessageDialog(null, "O triângulo é isósceles.");}
		else if (A!=B && B!=C){
			JOptionPane.showMessageDialog(null, "O triângulo é escaleno.");}
		
		
		}

	}

}
