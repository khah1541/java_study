package application;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// IF ��
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ����
		
		System.out.println("����� ������ ? ");
		int apples = scanner.nextInt();
		
		System.out.println("�ٳ����� ������ ? ");
		int bananas = scanner.nextInt();
		
		scanner.close();// ��ĳ�� ����� �ݱ�

		if(apples > bananas) {
			System.out.println("����� �ٳ������� ����");
		}	
		else {	// if���� ������ false�϶� ����
			System.out.println("�ٳ����� ������� ����");
	
		}
		System.out.println("���α׷� ����.");
	}

}