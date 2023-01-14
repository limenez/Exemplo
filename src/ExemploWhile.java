import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		int N;
		double valor,soma,media,maior;
		String resp="SIM";
		N =0;
		soma=0;
		maior=99999;
		while(resp.equalsIgnoreCase ("SIM")) {
			valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor:","Dado",JOptionPane.INFORMATION_MESSAGE));
			soma += valor;
			N++;
			if(valor>maior);
			maior = valor;
			resp = JOptionPane.showInputDialog(null , "Deseja digitar outro valor (Sim/Não)?", "Outro", JOptionPane.INFORMATION_MESSAGE);
        	media = soma / N;
	        JOptionPane.showMessageDialog(null , "A média dos valores digitados é " + soma/N, "Média", JOptionPane.INFORMATION_MESSAGE);
	        JOptionPane.showMessageDialog(null , "O maior dos valores digitados é " + maior, "Maior", JOptionPane.INFORMATION_MESSAGE);
		
		}
		
	}

}
