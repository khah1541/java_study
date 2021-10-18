package staticMethod;

public class Cat {
	private String name; // ����� �̸� (�ν��Ͻ� ����)
	private int id; //����� ���̵�
	public static final String FOOD = "����̻��";
	// static ������ ��ü���� ��������
	private static int count = 0; // ������ ������� ����

	public Cat(String name) { // 1)�����ڴ� ���� Ÿ���� ����(<->�Ϲ� �޼ҵ�)
		this.name = name; // 2)Ŭ���� �̸��� ����
		//���⿡ �ڵ� �߰��� 0����
		count++;
		id = count; //���⿡ �ڵ� �߰��� 1����
	}

	@Override
	public String toString() { // toString �޼ҵ� �ڵ�����
		return "����� [���̵�: " + id + " �̸�: " + name + "]";
	}

	public static int getCount() { // static ��ҵ�
//		String n = name; static�޼ҵ忡�� �ν��Ͻ�(��ü) ������ ����� �� ����
		return count;
	}
}
