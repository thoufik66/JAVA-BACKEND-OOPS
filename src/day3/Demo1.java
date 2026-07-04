package day3;

public class Demo1 {
  public void m1(){
	  System.out.println("PUBLIC METHOD");
  }
  
  private void m2(){
	  System.out.println("PRIVATE METHOD");
  }

  protected void m3(){
	  System.out.println("PROTECTED METHOD");
  }

   void m4(){
	  System.out.println("DEFAULT METHOD");
  }

 
	  public static void main(String[] args) {
		  Demo1 obj=new Demo1();
		  obj.m1();
		  obj.m2();
		  obj.m3();
		  obj.m4();

  }
	  

	}


