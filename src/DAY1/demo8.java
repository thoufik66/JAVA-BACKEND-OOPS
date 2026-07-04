package DAY1;
class Example8{
	int a;
	char b;
	float c;
	long d;
	double e;
	String f;
	boolean g;
	byte h;
	short i;
	public Example8(){
		a=10;
		h=1;
		c=45;
	}
	public void display(){
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
		System.out.println("d = "+d);
		System.out.println("e = "+e);
		System.out.println("f = "+f);
		System.out.println("g = "+g);
		System.out.println("h = "+h);
		System.out.println("i = "+i);


	}
	
}

public class demo8 {

	public static void main(String[] args) {
		
	 Example8 obj =new Example8();
	 obj.display();
        
	}

}
