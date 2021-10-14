package method;

public class App {

	public static void main(String[] args) {
		person p1 = new person();
		
		System.out.println(p1.name);	// 참조 자료형 String은 null값이 초기값
		System.out.println(p1.age);		// int는 0이 초기값

		p1.sayhello(); //메소드 호출
		
		p1.name = "펭수";
		p1.age = 7;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
	
		p1.sayhello();
		
		person p2 = new person();
		p2.name = "길동";
		person p3 = new person();
		p3.name = "라이언";
		
		p2.sayhello();
		p3.sayhello();
	}

}
