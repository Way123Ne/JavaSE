public class ReturnInJava {

	private static int j, l;

	public static void main(String[] args) {
		// 有返回值return demo
		hasReturn();
		System.out.println("j = " + j);

		// 无返回值return demo
		noReturn();

		// 无返回值return demo2
		noReturn2();
		System.out.println("l = " + l);

	}

	// 有返回值return demo
	private static int hasReturn() {
		// TODO Auto-generated method stub

		System.out.println("-------有返回值类型的return语句测试--------");
		for (j = 0; j < 10; j++) {
			if (j == 5) {
				return j;
			}
			System.out.println("j = " + j);
		}
		return j;
	}

	// 无返回值return demo
	private static void noReturn() {
		// TODO Auto-generated method stub
		System.out.println("-------无返回值类型的return语句测试--------");
		int k;
		for (k = 0; k < 20; k++) {
			if (k == 10) {
				System.out.println("k = " + k);
				return;
			}
			System.out.println("k = " + k);
		}
		return;
	}

	private static void noReturn2() {
		// TODO Auto-generated method stub
		System.out.println("-------无返回值类型的return语句测试2--------");

		for (l = 0; l < 20; l++) {
			if (l == 10) {

				return;
			}
			System.out.println("l = " + l);
		}
		return;
	}
}
