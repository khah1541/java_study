package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	private int remainTries = 7;
	private char lastGuess;

	public void run() {
		do {
			displayWord(); // ȭ�鿡 �ܾ�ǥ��
			getUserInput(); // �Է¹���
			checkUserInput(); // �´��� üũ �ٸ����� running = false
		} while (running);
	}

	public void close() {
		// ���� ����, ��ĳ�� �ݱ�
		scanner.close();
	}

	public void checkUserInput() {
		// ������ �ܾ� ö�ڸ� �ٸ������ üũ�ؼ� ������ ����
		// �������� Ȯ���ϴ� �޼ҵ� isCompleted�� �����
		boolean isCorrect = word.addGuess(lastGuess);
		
		if (word.isCompleted()) {
			System.out.println("�� ������!");
			System.out.println("������ : " + word.toString());
			running = false; // �ݺ��� ����
		}
//		System.out.println("üũ");

	}

	public void getUserInput() {
		// �������� �� ���� �Է� �䱸
		// �Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ� RandomWord ��ü�� ���� => addGuess(����) �޼ҵ�
		System.out.print("�� ���� �Է� : ");
		String guess = scanner.nextLine();
//		word.addGuess(guess.charAt(0));
		lastGuess = guess.charAt(0);

	}

	private void displayWord() {
		// ���� �ܾ� ���
		System.out.println(word.toString());
	}
}