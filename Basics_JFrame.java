import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class Basics_JFrame {
	
	public static void main(String[] args){
		
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setLocation(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//or both the above can we merged together//setBounds(setLocation-x,setLocation-y,setsize-x,setsize-y) 
		frame.setTitle("Calc");
		ImageIcon obj=new ImageIcon("/icons/icons1.jpg");
		frame.setIconImage(obj.getImage());
		
		Container c=frame.getContentPane();
		c.setBackground(Color.BLUE);
	}
	
}
