import java.util.Scanner;

public class OverlapCircle {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("첫번째 원의 중심과 반지름 입력>>");
		 int x1 = sc.nextInt();
		 int y1 = sc.nextInt();
		 double r1 = sc.nextDouble();
		 
		 System.out.print("두번째 원의 중심과 반지름 입력>>");
		 int x2 = sc.nextInt();
		 int y2 = sc.nextInt();
		 double r2 = sc.nextDouble();

		 double distance = Math.sqrt(Math.abs(x1-x2)*Math.abs(x1-x2) + Math.abs(y1-y2) * Math.abs(y1-y2));
		 
		 if(distance <= (r1 + r2))
			 System.out.print("두 원은 서로 겹친다.");
		 else
			 System.out.print("두 원은 서로 겹치지 않는다.");
		 
		 sc.close();
	}

}
