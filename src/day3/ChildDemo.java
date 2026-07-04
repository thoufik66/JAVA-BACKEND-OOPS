package day3;
class Parent {
	public void m1(){
	System.out.println("from parent class");
}
}
public class ChildDemo extends Parent {
	

	public static void main(String[] args) {
		ChildDemo obj=new ChildDemo();
		obj.m1();
		}

}
