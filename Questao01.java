import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
				
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
		int notaFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota final:"));
		
		if (notaFinal < 4) {
			JOptionPane.showMessageDialog(null,"O aluno " +nome+ " com a nota " +notaFinal+ " , est� reprovado!");
			
		}
		if (notaFinal >= 7) {
			JOptionPane.showMessageDialog(null,"O aluno " +nome+ " com a nota " +notaFinal+ " , est� aprovado!");
			
		}
		if (notaFinal != 4 && notaFinal != 7 ) {
			JOptionPane.showMessageDialog(null,"O aluno " +nome+ " com a nota " +notaFinal+ " , est� de recuper��o!");
			
		}
				
		}
}
