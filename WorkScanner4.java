package WorkExample;

import java.util.Scanner;

public class WorkScanner4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է�>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int midSize = a > b ? (a < c ? a : (b > c ? b : c)) : (b < c ? b : (a > c ? a : c));
		System.out.print("�߰� ���� " + midSize);
		
		sc.close();
	}

}
