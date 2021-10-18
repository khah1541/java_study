package polymorphism;

public class App {

	public static void main(String[] args) {

		// ��ü�� ��ӹ��� CatŸ������ ����
		Cat hcat = new HouseCat();
		hcat.vocal();
		hcat.hunt();

		Cat rcat = new RoadCat();
		rcat.vocal();
		rcat.hunt();

		Cat tcat = new Tiger();
		tcat.vocal();
		tcat.hunt();
		
		Cat[]cats = { new HouseCat(), new RoadCat(), new Tiger()};
		//cats[0] = new HouseCat()
		//cats[1] = new RoadCat()
		//cats[2] = new Tiger()
		
		for(int i=0;i<cats.length;i++) {
			System.out.println(cats[i]);
		}
	}

}
