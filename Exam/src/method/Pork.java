package method;

public class Pork {



	public static void main(String[] args) {
		double weight = 180;
		double pork = 3;
		//1 ������ �����Ͻÿ�
		//2 �޼ҵ带 ���� Į�θ��� ���
		double result= kcal(weight, pork);
		//3 ��� ���
	
		System.out.printf("�������:�� %.2f Kcal", result);

	}
	private static double kcal(double weight, double pork) {
		return weight * pork * 5.179;
	}



}
