package method;

public class Walking {

	public static void main(String[] args) {
		//1 Į�θ� ����� ���� �޼ҵ带 ȣ���Ͻÿ�
		double result= calculateCalory(5000);
		//3 ����� ����Ͻÿ�
		System.out.println("�Ҹ� Į�θ�: "+result+"kcal");
	}
	//2. Į�θ� ��� �޼ҵ带 �����Ͻÿ�
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}

}
