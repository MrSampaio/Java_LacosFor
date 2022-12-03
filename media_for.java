import javax.swing.JOptionPane;
public class media_for {
	public static void main(String[] args) {
		
		int num = 0;
		
		for(int limite = 0; limite<=29;limite++){
			num++;
		double n1 = Double.parseDouble (JOptionPane.showInputDialog(null,"Digite a primeira nota: "));
		double n2 = Double.parseDouble (JOptionPane.showInputDialog(null,"Digite a segunda nota: "));
		double n3 = Double.parseDouble (JOptionPane.showInputDialog(null,"Digite a terceira nota: "));
		double n4 = Double.parseDouble (JOptionPane.showInputDialog(null,"Digite a quarta nota: "));
		
	
		double media = (n1+n2+n3+n4)/4;
		String conceito = null;
		boolean teste = false;
		String situacao = null;
		
		if (n1>10.0 || n2>10.0 || n3>10.0 || n4>10.0){
			JOptionPane.showMessageDialog(null, "Valores inválidos. Por favor, digite notas menores que 10.0");
			System.exit(0);}// teste val notas
		
		
		if (media>9.0 && media<=10){
			conceito = "A";
			teste = true;}
		
		else if(media>=7.0 && media<=9.0){
			conceito = "B";
			teste = true;}
		
		else if(media>=5.0 && media<7.0){
			conceito = "C";
			teste = true;}
		
		else if(media>=2.5 && media<5.0){
			conceito = "D";}
		
		else if(media<2.5){
			conceito = "E";}//fim testes conceitos
		
		if (teste==true){
			situacao = "APROVADO";}
		
		else if(teste==false){
			situacao = "REPROVADO";}// fim testes situação
		

		JOptionPane.showMessageDialog(null, + num + "- " + "As notas foram: " + n1 +", " + n2 +", " + n3 + ", " + n4 + "\nA média foi: " + media + "\nO conceito foi: " + conceito + "\nO aluno está " + situacao );
		
		}

		}

	}

		

	
