package application;

public class BooleanOr {

	public static void main(String[] args) {
		// || or�� ������

		boolean isRaining = true; // �� ���°�?
		boolean mightRain = false; //�� �ü��� �ִ°�?
		
		boolean takeUmbrella = false; // ����� ����?

		takeUmbrella = isRaining || mightRain;  //�ϳ��� ���̸� ��

		System.out.println(takeUmbrella);

	}

}
