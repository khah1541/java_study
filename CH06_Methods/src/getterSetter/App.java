package getterSetter;

public class App {

	public static void main(String[] args) {
		// ���������� private�� ���� Ŭ���������� ���ٰ���
		person p1 = new person();
		//p1.name = name
		//p1.age
		p1.setName("���");
		p1.setAge(7);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

	}

}
