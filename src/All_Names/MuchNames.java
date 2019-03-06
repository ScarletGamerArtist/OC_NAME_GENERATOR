package All_Names;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * 3/6/2019
 * This should generate random names if it works properly. 
 * Will be updated as names are used.
 */

public class MuchNames {
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
	            String[] names = {"Navya","Ember","Aislinn","Maven","Torryn","Arden","Zillah","Larken","Ferryn",
	            		"Malakai","Aylin","Renly","Karalea","Perceval","Liri","rune","Reika","Donovan","Arkyn",
	            		"Killian","Zerenity","Xiomara","Aksel","Esca","Lowen","Kyan","Zeno","Ever",
	            		"Osmond","Kainda","Rain","Ione","Torben","Lazu"};
	           

	            int random = (int) (Math.random()*names.length);
	           

	            label.setText( names[random] );

	        }
	    }
}


