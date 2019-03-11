package kaustubh.deokar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.*;
import javax.swing.*;

public class Model extends JFrame {

    JPanel pnl = new JPanel();
    JTextField t1,t2;
	JLabel l1=new JLabel("Result:"),l2=new JLabel("Input:");
	JLabel l3=new JLabel("Equal to sign supports arithmetic + bool functions");
    JButton btnAddFlight = new JButton("Add Flight");
    JButton b1=new JButton("+");
    JButton b2=new JButton("-");
    JButton b3=new JButton("*");
    JButton b4=new JButton("/");
    JButton b5=new JButton("%");
    JButton b6=new JButton("C");
    JButton b7=new JButton("1/x");
    JButton b8=new JButton("\u221A");
    JButton b9=new JButton("=");
    
    
    public Model() {
    	b7.setFont(new Font("Dialog", Font.PLAIN, 10));
    	pnl.setLayout(null);
        setSize(400, 400);
        add(pnl);
        pnl.setBounds(800, 800, 200, 100);
        setBackground(Color.BLACK);
        setTitle("Calculator");
        l1.setBounds(40,-5,50,50);
        l2.setBounds(40,30,50,50);
        l3.setBounds(10,300,400,80);
        pnl.add(l1);
        pnl.add(l2);
        pnl.add(l3);
        t1=new JTextField(30);
		t2=new JTextField(30);
		t1.setBounds(100, 5, 200, 30);
		t2.setBounds(100, 40, 200, 30);
		pnl.add(t1);
        pnl.add(t2);
        b1.setBounds(100, 75, 50, 50);
        pnl.add(b1);
        b2.setBounds(100, 130, 50, 50);
        pnl.add(b2);
        b3.setBounds(100, 185, 50, 50);
        pnl.add(b3);
        b4.setBounds(100, 240, 50, 50);
        pnl.add(b4);
        b5.setBounds(155, 75, 50, 50);
        pnl.add(b5);
        b6.setBounds(155, 130, 50, 50);
        pnl.add(b6);
        b7.setBounds(155, 185, 50, 50);
        pnl.add(b7);
        b8.setBounds(155, 240, 50, 50);
        pnl.add(b8);
        b9.setBounds(210, 75, 50, 50);
        pnl.add(b9);
        
        t1.setText("0");

        ActionListener il=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
		 ScriptEngineManager mgr = new ScriptEngineManager();
		 ScriptEngine jsEngine = mgr.getEngineByName("JavaScript");
		 try
	    {
		Object k=jsEngine.eval(t2.getText());  
		int ol=(Integer) k;
		t1.setText(Integer.toString(ol));
	    }
	    catch (Exception ex)
	    {
	        ex.printStackTrace();
	    }
	}
		};
		b9.addActionListener(il);

        
        ActionListener hl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				double num1=Double.parseDouble(t1.getText());
				double value=Math.sqrt(num1);
				String s=Double.toString(value);
				t1.setText(s);
			}
		};
		b8.addActionListener(hl);

        ActionListener gl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				double num1=Double.parseDouble(t1.getText());
				double value=1/num1;
				String s=Double.toString(value);
				t1.setText(s);
			}
		};
		b7.addActionListener(gl);

        
        ActionListener fl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				t1.setText("0");
				t2.setText("0");
			}
		};
		b6.addActionListener(fl);

        ActionListener el=new ActionListener(){
    			public void actionPerformed(ActionEvent ae){
    				double num1=Double.parseDouble(t1.getText());
    				double value=num1/100;
    				String s=Double.toString(value);
    				t1.setText(s);
    			}
    		};
     b5.addActionListener(el);

        ActionListener al=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try{
				double num1=Double.parseDouble(t1.getText());
				double num2=Double.parseDouble(t2.getText());
				double value=num1+num2;
				String s=Double.toString(value);
				t1.setText(s);
				}
				catch(Exception e){
					System.out.println(e);
					double num2=Double.parseDouble(t2.getText());
					double value=num2;
					String s=Double.toString(value);
					t1.setText(s);
				}
				
			}

		};
		b1.addActionListener(al);
		ActionListener bl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try{
				double num1=Double.parseDouble(t1.getText());
				double num2=Double.parseDouble(t2.getText());
				double value=num1-num2;
				String s=Double.toString(value);
				t1.setText(s);
				}
				catch(Exception e){
					System.out.println(e);
					double num2=Double.parseDouble(t2.getText());
					double value=-num2;
					String s=Double.toString(value);
					t1.setText(s);
				}
			}

		};
		b2.addActionListener(bl);
		ActionListener cl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try
				{	double num1=Double.parseDouble(t1.getText());
				double num2=Double.parseDouble(t2.getText());
				double value=num1*num2;
				String s1=Double.toString(value);
				t1.setText(s1);
				}
				catch(Exception e){
					System.out.println(e);
					double num2=Double.parseDouble(t2.getText());
					double value=num2;
					String s=Double.toString(value);
					t1.setText(Integer.toString(0));
				}
			}

		};
		b3.addActionListener(cl);
		ActionListener dl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
			try
			{
				double num1=Double.parseDouble(t1.getText());
				double num2=Double.parseDouble(t2.getText());
				double value=num1/num2;
				String s=Double.toString(value);
				t1.setText(s);
			}
				catch(Exception e){
				System.out.println(e);
				double num2=Double.parseDouble(t2.getText());
				double value=Double.POSITIVE_INFINITY;
				String s=Double.toString(value);
				t1.setText(s);
			}
			}

		};
		b4.addActionListener(dl);
		
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Model();
    }
}
