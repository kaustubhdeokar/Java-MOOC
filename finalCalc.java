package kaustubh.deokar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.script.*;
import javax.swing.*;

public class Model extends JFrame  {

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
    JButton b10=new JButton("sin");
    JButton b11=new JButton("cos");
    JButton b12=new JButton("tan");
    JButton b13=new JButton("cot");
    JButton b14=new JButton("sec");
    JButton b15=new JButton("csc");
    JButton b16=new JButton("mod");
    
    public Model() {
    	b7.setFont(new Font("Dialog", Font.PLAIN, 10));
    	b10.setFont(new Font("Dialog", Font.PLAIN, 10));
    	b11.setFont(new Font("Dialog", Font.PLAIN, 10));
    	b12.setFont(new Font("Dialog", Font.PLAIN, 10));
    	b13.setFont(new Font("Dialog", Font.PLAIN, 10));
    	b14.setFont(new Font("Dialog", Font.PLAIN, 10));
    	b15.setFont(new Font("Dialog", Font.PLAIN, 10));
    	b16.setFont(new Font("Dialog", Font.PLAIN, 7));
    	
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
        b1.setBounds(75, 75, 50, 50);
        pnl.add(b1);
        b2.setBounds(75, 130, 50, 50);
        pnl.add(b2);
        b3.setBounds(75, 185, 50, 50);
        pnl.add(b3);
        b4.setBounds(75, 240, 50, 50);
        pnl.add(b4);
        b5.setBounds(130, 75, 50, 50);
        pnl.add(b5);
        b6.setBounds(130, 130, 50, 50);
        pnl.add(b6);
        b7.setBounds(130, 185, 50, 50);
        pnl.add(b7);
        b8.setBounds(130, 240, 50, 50);
        pnl.add(b8);
        b9.setBounds(185, 75, 50, 50);
        pnl.add(b9);
        b10.setBounds(185, 130, 50, 50);
        pnl.add(b10);
        b11.setBounds(185, 185, 50, 50);
        pnl.add(b11);
        b12.setBounds(185, 240, 50, 50);
        pnl.add(b12);
        b13.setBounds(240, 75, 50, 50);
        pnl.add(b13);        
        b14.setBounds(240, 130, 50, 50);
        pnl.add(b14);
        b15.setBounds(240, 185, 50, 50);
        pnl.add(b15);
        b16.setBounds(240, 240, 50, 50);
        pnl.add(b16);
        t1.setText("0");
     
        ActionListener pl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				double num1=Double.parseDouble(t2.getText());
				double value=Math.abs(num1);
				String s=Double.toString(value);
				t1.setText(s);
	}
		};
		b16.addActionListener(pl);

        ActionListener ol=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				double num1=Double.parseDouble(t1.getText());
				double value=Math.toRadians(num1);
				String s=Double.toString(1/Math.sin(value));
				t1.setText(s);
	}
		};
		b15.addActionListener(ol);

        ActionListener nl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				double num1=Double.parseDouble(t1.getText());
				double value=Math.toRadians(num1);
				String s=Double.toString(1/Math.cos(value));
				t1.setText(s);
				
	}
		};
		b14.addActionListener(nl);

        ActionListener ml=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				double num1=Double.parseDouble(t1.getText());
				double value=Math.toRadians(num1);
				String s=Double.toString(1/Math.tan(value));
				t1.setText(s);
				
	}
		};
		b13.addActionListener(ml);

        
        ActionListener ll=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				double num1=Double.parseDouble(t1.getText());
				double value=Math.toRadians(num1);
				String s=Double.toString(Math.tan(value));
				t1.setText(s);
				
	}
		};
		b12.addActionListener(ll);

        
        ActionListener kl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				double num1=Double.parseDouble(t1.getText());
				double value=Math.toRadians(num1);
				String s=Double.toString(Math.cos(value));
				t1.setText(s);		
			}
		};
		
		b11.addActionListener(kl);

        ActionListener jl=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				double num1=Double.parseDouble(t1.getText());
				double value=Math.toRadians(num1);
				String s=Double.toString(Math.sin(value));
				t1.setText(s);
			}
		};
		b10.addActionListener(jl);
        
        
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
				double num1=Double.parseDouble(t2.getText());
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
