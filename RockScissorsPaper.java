import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = {"가위", "바위", "보"};
		String user, com;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			int tmp = (int)(Math.random()*3);
			com = str[tmp];
			user = sc.next();
			
			if(user.equals("그만")) {
				System.out.print("게임을 종료합니다...");
				break;
			}
			
			if(user.equals(com)) {
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " , " +"비겼습니다.");
			}
			else if(user.equals("가위")) {
				if(com.equals("바위"))
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " , " +"컴퓨터가 이겼습니다.");
				else
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " , " +"사용자가 이겼습니다.");
			}
			else if(user.equals("바위")) {
				if(com.equals("보"))
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " , " +"컴퓨터가 이겼습니다.");
				else
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " , " +"사용자가 이겼습니다.");
			}
			else if(user.equals("보")) {
				if(com.equals("가위"))
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " , " +"컴퓨터가 이겼습니다.");
				else
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " , " +"사용자가 이겼습니다.");
			}
		}
		sc.close();
	}

}
