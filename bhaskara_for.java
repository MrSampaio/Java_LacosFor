import javax.swing.JOptionPane;
public class bhaskara_for {
	public static void main(String[] args) {
		
		
		int num = 0;
		String raizes = "";
		
		for(int limite = 0; limite <=4; limite++){
			
			++num;
		double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de A: "));
		
		if (A==0){
			JOptionPane.showMessageDialog(null, "A equa��o n�o � do segundo grau pois A n�o pode ser igual a 0.");
			raizes += num + "-" + "N�o � do segundo grau!" + "\n";}
		
		double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de B: "));
		double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de C: "));
		double x1 = 0;
		double x2 = 0;
		
		double delta = (B*B) - (4*A*C);
		
		if (delta<0){
			JOptionPane.showMessageDialog(null, "Delta possui valor negativo, portanto, a equa��o n�o possui valores reais.");
			raizes += + num + "-" + "Delta negativo!" + "\n";}
		
		else if (delta==0){
			x1=-(B)/2*A;
			raizes += num + "-" + "( " + x1 + " )"+ "\n";}
		
		else if(delta>0){
			double raiz = (Math.sqrt(delta));
			x1 = (-(B) + raiz)/2*A;
			x2 = (-(B) - raiz)/2*A;
			raizes += num + "-" + "( " + x1 + ", " + x2 + " )" + "\n";}
		
		JOptionPane.showMessageDialog(null, raizes );
		
		
		}
		
	}

	}
