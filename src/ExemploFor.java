import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		int i, N;
		float valor, soma;
		N = Integer.parseInt(JOptionPane.showInputDialog(null , "Digite a quantidade de valores que serão processados: ", "Dado", JOptionPane.INFORMATION_MESSAGE ));
		soma=0;
		for(i=1; i<=N; i++);
		valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um valor: ", "Dado", JOptionPane.INFORMATION_MESSAGE));
		soma= soma + valor; JOptionPane.showMessageDialog(null , "A média dos valores digitados é " + soma/N, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}


