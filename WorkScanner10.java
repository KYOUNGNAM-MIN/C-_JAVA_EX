package WorkExample;

import java.util.Scanner;

public class WorkScanner10 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		 int x1 = sc.nextInt();
		 int y1 = sc.nextInt();
		 double r1 = sc.nextDouble();
		 System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		 int x2 = sc.nextInt();
		 int y2 = sc.nextInt();
		 double r2 = sc.nextDouble();
		 // �� ���� �߽��� �Ÿ����� �� ���� �������� ���� �� ũ�� ��ģ��.
		 // �� �߽��� �Ÿ��� ��Ÿ��� ���� �̿�
		 double distance = Math.sqrt(Math.abs(x1-x2)*Math.abs(x1-x2) + Math.abs(y1-y2) * Math.abs(y1-y2));
		 
		 if(distance <= (r1 + r2))
			 System.out.print("�� ���� ���� ��ģ��.");
		 else
			 System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
		 
		 sc.close();
	}

}
