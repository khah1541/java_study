package application;

public class Cat {
	private String name; // 고양이 이름 (인스턴스 변수)
	public static final String FOOD = "고양이사료";
	// static 변수는 객체에서 공유가능
	private static int count = 0; // 생성한 고양이의 숫자

	public Cat(String name) { // 1)생성자는 리턴 타입이 없음(<->일반 메소드)
		this.name = name; // 2)클래스 이름과 같음
		count++;
	}

	@Override
	public String toString() { // toString 메소드 자동생성
		return "고양이 [이름: " + name + "]";
	}

	public static int getCount() { // static 멘소드
//		String n = name; static메소드에서 인스턴스(객체) 변수를 사용할 수 없다
		return count;
	}
}
