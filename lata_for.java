import javax.swing.JOptionPane;
public class lata_for {
	public static void main (String [] args){
		
		
		int num = 0;
		String tabela = "";
		
		for(int limite=0; limite<=4; limite++){
			num++;
			double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do raio da lata: "));
			double alt = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da altura da lata: "));
			
			double ab = 3.14*(raio*raio);
			double al = 2*3.14*alt;
			double at = 2*ab+al;
		
			tabela += num + "- " + "A �rea externa da lata �: " + at + " cm2" + "\n";
			
			JOptionPane.showMessageDialog(null, tabela);
		
		
		}
		
		
		
	}

}
