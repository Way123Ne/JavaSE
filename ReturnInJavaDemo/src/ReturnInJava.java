public class ReturnInJava {

	private static int j, l;

	public static void main(String[] args) {
		// �з���ֵreturn demo
		hasReturn();
		System.out.println("j = " + j);

		// �޷���ֵreturn demo
		noReturn();

		// �޷���ֵreturn demo2
		noReturn2();
		System.out.println("l = " + l);

	}

	// �з���ֵreturn demo
	private static int hasReturn() {
		// TODO Auto-generated method stub

		System.out.println("-------�з���ֵ���͵�return������--------");
		for (j = 0; j < 10; j++) {
			if (j == 5) {
				return j;
			}
			System.out.println("j = " + j);
		}
		return j;
	}

	// �޷���ֵreturn demo
	private static void noReturn() {
		// TODO Auto-generated method stub
		System.out.println("-------�޷���ֵ���͵�return������--------");
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
		System.out.println("-------�޷���ֵ���͵�return������2--------");

		for (l = 0; l < 20; l++) {
			if (l == 10) {

				return;
			}
			System.out.println("l = " + l);
		}
		return;
	}
}
