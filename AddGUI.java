import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class AddGUI {

	public static void main(String[] args) {
		
		Addition obj=new Addition();
	}
	
}

class Addition extends JFrame 

{
	
	JTextField t1,t2;
	JButton b4,b1,b2,b3;
	JLabel l;
	
	public Addition(){
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");		
		l=new JLabel("Result");
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l);
		
		ActionListener al=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				int value=num1+num2;
				l.setText(value+"");
			}

		};
		
		ActionListener bl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				int value=num1-num2;
				l.setText(value+"");
			}

		};
		
		ActionListener cl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				int value=num1*num2;
				l.setText(value+"");
			}

		};
		
		ActionListener dl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				int value=num1/num2;
				l.setText(value+"");
			}

		};
		
		
		b1.addActionListener(al);
		b2.addActionListener(bl);
		b3.addActionListener(cl);
		b4.addActionListener(dl);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
}
