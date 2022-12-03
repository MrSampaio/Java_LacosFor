import javax.swing.JOptionPane;
public class esfera_for {
	public static void main(String[] args) {
		
		String volumes = "";
		int num = 0;
		double r = 0;
		
		for(int limite = 0; limite<=9; limite++){
			++num;
		r = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do raio da esfera em cm: "));
		double V = 4*3.14*((r*r)*r)/3;
		
		volumes += + num + "- " + V + " cm3" + "\n";
		
		JOptionPane.showMessageDialog(null, volumes);
		
	}

	}
}
	


