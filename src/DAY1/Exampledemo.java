package DAY1;
class Example{
	private int x;
	private int y;
	
	public Example(){
		int x=0;
		int y=0;
	}
	public Example(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void display(){
		System.out.println("x = "+x);
		System.out.println("y = "+y);

	}
	public void sum(){
		System.out.println("sum = "+ (x+y));
	}

}

public class Exampledemo {

	public static void main(String[] args) {
		Example obj=new Example(30,20);
		obj.display();
		obj.sum();

		Example obj1=new Example(10,20);
		obj1.display();
		obj1.sum();

		Example obj2=new Example();
		obj2.display();
		obj2.sum();

		
	}

}
