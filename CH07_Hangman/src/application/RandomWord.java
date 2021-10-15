package application;

import java.util.Random;

public class RandomWord {
	private String books = "leadership efficiency election assistance signature relation confusion government pollution enthusiasm conversation importance childhood judgment refrigerator preference attitude departure consequence apartment";
	private String[] words = books.split(" ");
	
	private String selectWord;	// 선택한 단어
	private Random rand = new Random();	// 랜덤 객체를 생성
	
	public RandomWord() {
		selectWord = words[rand.nextInt(words.length)];	// 랜덤으로 단어를 선택
	}
	
	public String toSting() {
		return selectWord;
	}
	
	public void getWords() {
		for(String w : words) {
			System.out.println(w);
		}
	}
}
