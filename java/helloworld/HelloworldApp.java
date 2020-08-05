public class HelloworldApp {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!!");
		System.out.println("six");
		System.out.println(6);
		System.out.println(6*6);
		System.out.println("asdasdasd".length());
		System.out.println(Math.PI);
		
		System.out.println("Hello, qwe ...bye".replace("qwe","123"));  // 생활코딩에선 [[[]]] 썼지만 굳이 그럴필요는없음
		
		int a = 1;
		double b = 1.4;
		String c = "apple";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Hello, "+c);
		
		int d = (int) 1.1; // double써야되지만 int를 앞에 붙이면서 변환해서 정수형태로 만듬, 1출력됨
		System.out.println(d);
		
		String e = Integer.toString(3);  // 3 to String, 3 정수를 문자로 바꿈
		System.out.println(e.getClass());
	}
	
}