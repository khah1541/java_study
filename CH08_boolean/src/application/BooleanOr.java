package application;

public class BooleanOr {

	public static void main(String[] args) {
		// || or논리 연산자

		boolean isRaining = true; // 비가 오는가?
		boolean mightRain = false; //비가 올수도 있는가?
		
		boolean takeUmbrella = false; // 우산은 쓰나?

		takeUmbrella = isRaining || mightRain;  //하나라도 참이면 참

		System.out.println(takeUmbrella);

	}

}
