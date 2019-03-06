package Unisex_Names;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//These are the names that could either be male or female. It is all based on preference.

public class BothNames {
	
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
	            String[] names = {"Maven","Torryn","Ferryn","Aylin","Karalea","Perceval","rune","Kyan",
	            		"Rain"};
	           

	            int random = (int) (Math.random()*names.length);
	           

	            label.setText( names[random] );

	        }
	    }

}
