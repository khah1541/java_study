package application;

class person {
	String name;
}

public class ClassObject {

	public static void main(String[] args) {
		// 클래스란 설계도로 실제 사용가능한 객체를 생성함
		person p1 = new person();
		p1.name = "펭수";
		
		person p2 = new person();	// 실제 객체를 생성
		p2.name = "길동";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
	}

}
