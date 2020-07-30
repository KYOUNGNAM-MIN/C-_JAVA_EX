import java.util.Scanner;

public class ClashWithRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 점 (x1,y1), (x2,y2)를 공백을 기준으로 순서대로 입력하세요.>>");
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		// 새로 만든 직사각형이 기존 직사각형 안에 포함되거나 겹칠 때
		if(inRect(x1,y1,100,100,200,200) || inRect(x1,y2,100,100,200,200)|| inRect(x2,y1,100,100,200,200) ||
			inRect(x2,y2,100,100,200,200))
			System.out.println("두 직사각형이 충돌합니다.");
		// 기존 직사각형이 새로 만든 직사각형 안에 포함되거나 겹칠 때
		else if((inRect(100,100,x1,y1,x2,y2) ||
				inRect(200,200,x1,y1,x2,y2))) {
			System.out.println("두 직사각형이 충돌합니다.");
		}
		else
			System.out.println("두 직사각형이 충돌하지 않습니다.");
		
		sc.close();
	}
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2,int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}
}
