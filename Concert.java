import java.util.Scanner;

class Seat{
	private String[] S = new String[10];
	private String[] A = new String[10];
	private String[] B = new String[10];
	public Seat() {
		for(int i=0; i<10; i++) {
			S[i] = " --- ";
			A[i] = " --- ";
			B[i] = " --- ";
		}
	}
	public void seatShow(int gradeSeat) {
		switch(gradeSeat) {
		case 1:
			System.out.print("S>>");
			for(int i=0; i<10; i++) {
				System.out.print(S[i]);
			}
			System.out.println();
			break;
		case 2:
			System.out.print("A>>");
			for(int i=0; i<10; i++) {
				System.out.print(A[i]);
			}
			System.out.println();
			break;
		case 3:
			System.out.print("B>>");
			for(int i=0; i<10; i++) {
				System.out.print(B[i]);
			}
			System.out.println();
			break;
		default:
			System.out.print("없는 번호입니다.");
			break;
		}
	}
	public void seatSet(int gradeSeat, String name, int seatNum) {
		switch(gradeSeat) {
		case 1:
			S[seatNum-1] = name;
			break;
		case 2:
			A[seatNum-1] = name;
			break;
		case 3:
			B[seatNum-1] = name;
			break;
		default:
			System.out.print("없는 번호입니다.");
			break;
		}
	}
	public void seatCancel(int gradeSeat, String name) {
		boolean checkCancelName = false;
		switch(gradeSeat) {
		case 1:
			for(int i=0; i<10; i++) {
				if(S[i].equals(name)) {
					S[i] = " --- ";
					checkCancelName = true;
					break;
				}
			}
			if(checkCancelName == false) System.out.println("취소할 예약자의 이름이 없습니다.");
			break;
		case 2:
			for(int i=0; i<10; i++) {
				if(A[i].equals(name)) {
					A[i] = " --- ";
					checkCancelName = true;
					break;
				}
			}
			if(checkCancelName == false) System.out.println("취소할 예약자의 이름이 없습니다.");
			break;
		case 3:
			for(int i=0; i<10; i++) {
				if(B[i].equals(name)) {
					B[i] = " --- ";
					checkCancelName = true;
					break;
				}
			}
			if(checkCancelName == false) System.out.println("취소할 예약자의 이름이 없습니다.");
			break;
		}
	}
}

class ReservationSystem extends Seat{
	Scanner sc;
	
	public ReservationSystem() {
		sc = new Scanner(System.in);
	}
	
	public void run() {
		int menu;
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				reserve();
				break;
			case 2:
				check();
				break;
			case 3:
				cancel();
				break;
			case 4:
				sc.close();
				return;
			default:
				System.out.println("없는 메뉴입니다. 다시 입력해주세요");
				break;
			}
		}
	}
	public void reserve() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int gradeSeat = sc.nextInt();
		seatShow(gradeSeat);
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("번호>>");
		int seatNum = sc.nextInt();
		seatSet(gradeSeat, name, seatNum);
	}
	public void check() {
		seatShow(1);
		seatShow(2);
		seatShow(3);
		System.out.println("<<<조희를 완료하였습니다.>>>");
	}
	public void cancel() {
		System.out.print("좌석 S:1, A:2, B:3>>");
		int cancelNum = sc.nextInt();
		seatShow(cancelNum);
		System.out.print("이름>>");
		String cancelName = sc.next();
		seatCancel(cancelNum, cancelName);
		System.out.println("<<<취소를 완료하였습니다.>>>");
	}
}

public class Concert {

	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		ReservationSystem rs = new ReservationSystem();
		rs.run();
	}

}
