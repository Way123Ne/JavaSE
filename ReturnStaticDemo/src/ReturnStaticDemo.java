public class ReturnStaticDemo {

	static int c;

	public static void main(String[] args) {

		ReturnStaticDemo rd = new ReturnStaticDemo();
		rd.test1();
		rd.test2(4, 5);
		System.out.println("c = " + c);
		
		//ReturnDemo.what();
		rd.what();
	}

	public static void what() {
		// TODO Auto-generated method stub
		System.out.println("c = " + c);
	}

	public void test1() {
		// TODO Auto-generated method stub

		System.out.println("---�޷���ֵ���͵�return���");
		for (int i = 1; i < 5; i++) {
			if (i == 4)
				return;
			System.out.println("i = " + i);
		}
	}

	public int test2(int a, int b) {

		// TODO Auto-generated method stub
		System.out.println("---�з���ֵ���͵�return���");
		return c = a + b;

	}
}
