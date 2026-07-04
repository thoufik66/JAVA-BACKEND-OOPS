package DAY1;
class Example7{
	private int data;
	public void setData(int data){
		this.data=data;
	}
	public int getData(){
		return data;
	}
}
public class demo7 {

	public static void main(String[] args) {
     Example7 obj=new Example7();
     obj.setData(225);
     System.out.println(obj.getData());
     
	}

}
