import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
		
	if (n1 > n2) {
		JOptionPane.showMessageDialog(null, "O maior número é " +n1++); }
	
	if (n1 < n2) {
		JOptionPane.showMessageDialog(null, "O maior número é " +n2++); }
	if (n1 == n2) {
		JOptionPane.showMessageDialog(null, "Números iguais");	}
	}

}
