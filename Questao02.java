import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero:"));
		
	if (n1 > n2) {
		JOptionPane.showMessageDialog(null, "O maior n�mero � " +n1++); }
	
	if (n1 < n2) {
		JOptionPane.showMessageDialog(null, "O maior n�mero � " +n2++); }
	if (n1 == n2) {
		JOptionPane.showMessageDialog(null, "N�meros iguais");	}
	}

}
