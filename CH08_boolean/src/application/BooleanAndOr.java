package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// AND OR ���ÿ� ���

		boolean isRaining = false; // �� ���°�?
		boolean mightRain = true; // �� �ü��� �ִ°�?
		boolean haveUmbrella = true; // ����� �ִ°�?

		if ((isRaining || mightRain) && haveUmbrella) {
			System.out.println("����� ����!");
		} else {
			System.out.println("����� ���� �ʴ´�~");

		}
		boolean rainCheck = isRaining || mightRain;
		if(rainCheck&&haveUmbrella) {
			System.out.println("����� ��!");
		}else {
			System.out.println("����� �Ⱦ�~");
		}

	}

}
