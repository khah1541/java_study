package method;

public class App {

	public static void main(String[] args) {
		person p1 = new person();
		
		System.out.println(p1.name);	// ���� �ڷ��� String�� null���� �ʱⰪ
		System.out.println(p1.age);		// int�� 0�� �ʱⰪ

		p1.sayhello(); //�޼ҵ� ȣ��
		
		p1.name = "���";
		p1.age = 7;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
	
		p1.sayhello();
		
		person p2 = new person();
		p2.name = "�浿";
		person p3 = new person();
		p3.name = "���̾�";
		
		p2.sayhello();
		p3.sayhello();
	}

}
