package Male_Names;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//These are the more masculine names.

public class Male_Names {
	
	private static JLabel label;
	public static void main (String[] args){

	    JFrame frame = new JFrame("OC NAME GENERATOR");
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,350);
	    frame.setLocation(600,300);
	    JPanel panel = new JPanel ();
	    frame.add(panel);
	    JButton button = new JButton("Generate!");
	    panel.add(button);  
	    label = new JLabel();
	    panel.add(label);
	    button.addActionListener(new Action());

	}
	    static class Action implements ActionListener{

	        public void actionPerformed (ActionEvent e){
	            String[] names = {"Maven","Torryn","Arden","Zillah","Larken","Ferryn",
	            		"Malakai","Aylin","Renly","Perceval","rune","Donovan","Arkyn","Killian",
	            		"Aksel","Esca","Lowen","Zeno","Ever","Osmond","Kyan","Rain","Torben",
	            		"Lazu"};
	           

	            int random = (int) (Math.random()*names.length);
	           

	            label.setText( names[random] );

	        }
	    }
}




