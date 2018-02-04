
public class ParamDelivery {

	static int x = 6,y = 7;
	public static void main(String[] args){
		
	 ParamDelivery pd = new ParamDelivery();
	 //将x的值传递给go()中的形参y1
	 pd.go(x);
	 System.out.println("y = " + y);
	}
	
	 void go(int y1) { 
		 //在方法中改变y1的值
		 // y1=9;
		  System.out.println("y1 = " + y1);
	 }
}
