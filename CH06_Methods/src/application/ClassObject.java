package application;

class person {
	String name;
}

public class ClassObject {

	public static void main(String[] args) {
		// Ŭ������ ���赵�� ���� ��밡���� ��ü�� ������
		person p1 = new person();
		p1.name = "���";
		
		person p2 = new person();	// ���� ��ü�� ����
		p2.name = "�浿";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
	}

}
