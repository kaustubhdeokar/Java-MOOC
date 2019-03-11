package kaustubh.deokar;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Controller {

	public static void main(String[] args) {
		
		Addition obj=new Addition();
	}
	
}

class Addition extends JFrame 

{
	
	JTextField t1,t2;
	JButton b4,b1,b2,b3;
	JLabel l;
	static double result=0;
	
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
				
	/*			double num1=Double.parseDouble(t1.getText());
				double num2=Double.parseDouble(t2.getText());
				double value=num1+num2;
				l.setText(value+"");
				String s=Double.toString(value);
				t1.setText(s);
*/
				double num1=Double.parseDouble(t1.getText());
				result=num1;
				t1.setText(Integer.toString(0));
				double num2=Double.parseDouble(t1.getText());
				result+=num2;
				l.setText(result+"");
				String s=Double.toString(result);
				t1.setText(s);
				
			}

		};
		
		ActionListener bl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				double num1=Double.parseDouble(t1.getText());
				double num2=Double.parseDouble(t2.getText());
				double value=num1-num2;
				l.setText(value+"");
				String s=Double.toString(value);
				t1.setText(s);

			}

		};
		
		ActionListener cl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				double num1=Double.parseDouble(t1.getText());
				double num2=Double.parseDouble(t2.getText());
				double value=num1*num2;
				l.setText(value+"");
				String s1=Double.toString(value);
				t1.setText(s1);
			}

		};
		
		ActionListener dl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				double num1=Double.parseDouble(t1.getText());
				double num2=Double.parseDouble(t2.getText());
				double value=num1/num2;
				l.setText(value+"");
				String s=Double.toString(value);
				t1.setText(s);

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