package method;

public class Walking {

	public static void main(String[] args) {
		//1 칼로리 계산을 위해 메소드를 호출하시오
		double result= calculateCalory(5000);
		//3 결과를 출력하시오
		System.out.println("소모 칼로리: "+result+"kcal");
	}
	//2. 칼로리 계싼 메소드를 정의하시오
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}

}
