package method;

public class Pork {



	public static void main(String[] args) {
		double weight = 180;
		double pork = 3;
		//1 변수를 생성하시오
		//2 메소드를 통한 칼로리를 계산
		double result= kcal(weight, pork);
		//3 결과 출력
	
		System.out.printf("돼지고기:ㄴ %.2f Kcal", result);

	}
	private static double kcal(double weight, double pork) {
		return weight * pork * 5.179;
	}



}
