public class HelloworldApp {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!!");
		System.out.println("six");
		System.out.println(6);
		System.out.println(6*6);
		System.out.println("asdasdasd".length());
		System.out.println(Math.PI);
		
		System.out.println("Hello, qwe ...bye".replace("qwe","123"));  // ��Ȱ�ڵ����� [[[]]] ������ ���� �׷��ʿ�¾���
		
		int a = 1;
		double b = 1.4;
		String c = "apple";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Hello, "+c);
		
		int d = (int) 1.1; // double��ߵ����� int�� �տ� ���̸鼭 ��ȯ�ؼ� �������·� ����, 1��µ�
		System.out.println(d);
		
		String e = Integer.toString(3);  // 3 to String, 3 ������ ���ڷ� �ٲ�
		System.out.println(e.getClass());
	}
	
}