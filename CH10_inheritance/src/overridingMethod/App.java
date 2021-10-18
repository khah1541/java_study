package overridingMethod;

public class App {

	public static void main(String[] args) {
		HouseCat hcat = new HouseCat();
		hcat.vocal();
		hcat.hunt();
		
		RoadCat rcat = new RoadCat();
		rcat.vocal();
		rcat.hunt();
		
		Tiger tg = new Tiger();
		tg.vocal();
		tg.hunt();

	}

}
