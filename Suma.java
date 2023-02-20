import javax.swing.JOptionPane;

public class Suma{

    public static void main(String[]args){
        JOptionPane.showMessageDialog(null,"Bievenido a este programa de sumas");
        int num= Integer.parseInt(JOptionPane.showInputDialog("Pon el primer numero:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Pon el segundo numero: "));
        int a = num+num2;
        JOptionPane.showMessageDialog(null,"El resultado de tu suma es: " +a);
        JOptionPane.showMessageDialog(null,"Gracias por usar este programa");
    }

}