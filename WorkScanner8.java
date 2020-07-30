package WorkExample;

import java.util.Scanner;

public class WorkScanner8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� (x1,y1), (x2,y2)�� ��ǥ�� �Է��ϼ���>>");
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		boolean r1 = inRect(x1,y1,100,100,200,200);
		boolean r2 = inRect(x1,y2,100,100,200,200);
		boolean r3 = inRect(x2,y1,100,100,200,200);
		boolean r4 = inRect(x2,y2,100,100,200,200);
		// �������� ��ġ�� ��� or ���� ���簢���� �� ū ���
		if(r1 || r2 || r3 || r4)
			System.out.println("�� ���簢���� �浹�մϴ�.");
		else if(inRect(100,100,x1,y1,x2,y2) &&
				inRect(100,200,x1,y1,x2,y2) &&
				inRect(200,100,x1,y1,x2,y2) &&
				inRect(200,200,x1,y1,x2,y2))
			System.out.println("�� ���簢���� �浹�մϴ�.");
		else
			System.out.println("�� ���簢���� �浹���� �ʽ��ϴ�.");
		
		sc.close();
	}
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2,int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}
	
}
