import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FirstGUI {
	public static void main(String[] args) {
		Abc obj=new Abc();
	}
}

class Abc extends JFrame{
	
	public Abc(){
		setLayout(new FlowLayout()); 
		JLabel l=new JLabel("Hello World");
		add(l);
		setVisible(true);
		setLocation(100, 100);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}