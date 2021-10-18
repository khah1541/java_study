package polymorphism;

public class App {

	public static void main(String[] args) {

		// 객체를 상속받은 Cat타입으로 선언
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

	}

}
