
public class ParamDelivery {

	static int x = 6,y = 7;
	public static void main(String[] args){
		
	 ParamDelivery pd = new ParamDelivery();
	 //��x��ֵ���ݸ�go()�е��β�y1
	 pd.go(x);
	 System.out.println("y = " + y);
	}
	
	 void go(int y1) { 
		 //�ڷ����иı�y1��ֵ
		 // y1=9;
		  System.out.println("y1 = " + y1);
	 }
}
