import javax.swing.*;
import java.awt.*;

public class ClassLabel {
	
	public static void main(String[] args){
		
		A obj =new A();
		A.B obj1=obj.new B();
		obj1.j=3;
		obj1.display();
	}
	
}


class A{
	
	int i;
	
	class B{
		int j;
			
		void display(){
			System.out.println(j);
		}
	}
}