import javax.swing.JOptionPane;
public class natacao_for {
	public static void main (String [] args){


		int num = 0;
		String classe = "";
		String tabela = "";
		
		for(int limite = 0; limite<=9; limite++){
			
			num++;
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do nadador: "));
		
		if (idade<5){
			tabela += num + "- " + "Nadador muito novo!" + "\n";}
		
		else if(idade>=5 && idade<=7){
			classe = "Infantil A";
			tabela += num + "- " + "A classe do(a) nadador(a) é: " + classe + "\n";}
		
		else if (idade>=8 && idade<=10){
			classe = "Infantil B";
			tabela += num + "- " + "A classe do(a) nadador(a) é: " + classe + "\n";}
		
		else if (idade>=11 && idade<=13){
			classe = "Juvenil A";
			tabela += num + "- " + "A classe do(a) nadador(a) é: " + classe + "\n";}
		
		else if (idade>=14 && idade<=17){
			classe = "Juvenil B";
			tabela += num + "- " + "A classe do(a) nadador(a) é: " + classe + "\n";}
		
		else if (idade>=18){
			classe = "Sênior";
			tabela += num + "- " + "A classe do(a) nadador(a) é: " + classe + "\n";}
		
		JOptionPane.showMessageDialog(null, tabela);
		
		
		
		}
		
		
		
		
	}
}
