package teste;

import javax.swing.*;

public class Teste {

//	public static void main(String[] args) {
//		
//		String nome = JOptionPane.showInputDialog("Digite o operação que deseja realizar:  ");
//		
//		nome = nome.toUpperCase();
//		
//		double operacao ;
//		double numero1;
//		double numero2;
//		
//		switch (nome) {
//		
//		case "+" : 
//			
//			numero: JOptionPane.showInputDialog("Teste: ");
//		
//		}
//		
//			
//		
//		
//		
//		

	public static void main(String[] args) {
	      JTextField xField = new JTextField(5);
	      JTextField yField = new JTextField(5);

	      JPanel myPanel = new JPanel();
	      myPanel.add(new JLabel("X"));
	      myPanel.add(xField);
	      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	      myPanel.add(new JLabel("+"));
	      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	      myPanel.add(yField);
	      myPanel.add(new JLabel("Y"));
	      
	      String valorX = xField.getText();
	      String valorY = yField.getText();
	     

	      int result = JOptionPane.showConfirmDialog(null, myPanel, 
	               "Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
	      if (result == JOptionPane.OK_OPTION) {
	    	  
	         JOptionPane.showMessageDialog(null,"O Resultado é: " + (valorX + valorY));
	         
	      }
	   }
	
	

}
