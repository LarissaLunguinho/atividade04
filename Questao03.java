import javax.swing.JOptionPane;

public class Questão03 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
		int dif = 0;
		if (n1 > n2)
		
		{ 	dif = n1-n2;
		for (int i = 1; i < dif; i++)
		{	int valor = n2+i;
		JOptionPane.showMessageDialog(null,"Os números entre " +n1+ " e " +n2+ " são:" +valor); }
		}
		
		else if (n2 > n1)
		{  dif = n2 - n1;
		
		for (int i = 1; i < dif; i++)
		{ 	int valor = n1 + i;
		JOptionPane.showMessageDialog(null,"Os números entre " +n2+ " e " +n1+ " são:" +valor); 	}
	}  
	
	{	
	if (n2 == n1) 
		JOptionPane.showMessageDialog(null,"Você digitou número iguais"); 
		}
	
	} }



//Saída > "Os números entre ? e ? são: ?, ?, ?, ? "