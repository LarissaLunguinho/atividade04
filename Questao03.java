import javax.swing.JOptionPane;

public class Quest�o03 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero:"));
		int dif = 0;
		if (n1 > n2)
		
		{ 	dif = n1-n2;
		for (int i = 1; i < dif; i++)
		{	int valor = n2+i;
		JOptionPane.showMessageDialog(null,"Os n�meros entre " +n1+ " e " +n2+ " s�o:" +valor); }
		}
		
		else if (n2 > n1)
		{  dif = n2 - n1;
		
		for (int i = 1; i < dif; i++)
		{ 	int valor = n1 + i;
		JOptionPane.showMessageDialog(null,"Os n�meros entre " +n2+ " e " +n1+ " s�o:" +valor); 	}
	}  
	
	{	
	if (n2 == n1) 
		JOptionPane.showMessageDialog(null,"Voc� digitou n�mero iguais"); 
		}
	
	} }



//Sa�da > "Os n�meros entre ? e ? s�o: ?, ?, ?, ? "