package application;

public class Cat {
	private String name; // ����� �̸� (�ν��Ͻ� ����)
	public static final String FOOD = "����̻��";
	// static ������ ��ü���� ��������
	private static int count = 0; // ������ ������� ����

	public Cat(String name) { // 1)�����ڴ� ���� Ÿ���� ����(<->�Ϲ� �޼ҵ�)
		this.name = name; // 2)Ŭ���� �̸��� ����
		count++;
	}

	@Override
	public String toString() { // toString �޼ҵ� �ڵ�����
		return "����� [�̸�: " + name + "]";
	}

	public static int getCount() { // static ��ҵ�
//		String n = name; static�޼ҵ忡�� �ν��Ͻ�(��ü) ������ ����� �� ����
		return count;
	}
}
