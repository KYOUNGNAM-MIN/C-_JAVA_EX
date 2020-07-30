package WorkExample;

//import java.util.InputMismatchException;
import java.util.Scanner;

class Day{
	private String work; //하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
	   if(work == null) System.out.println("없습니다.");
	   else System.out.println(work+"입니다.");
	}
}
class MonthSchedule{
	private Day days[];
	private Scanner sc;
	MonthSchedule(int day){
		this.days = new Day[day];
		for(int i=0; i<days.length;i++)
			days[i] = new Day();
		sc = new Scanner(System.in);
	}
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>> ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				input(); break;
			case 2:
				view(); break;
			case 3:
				finish(); return;
			}
		}
	}
	public void input() {
		System.out.print("날짜(1~30)?");
		int choiceDay = sc.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = sc.next();
		days[choiceDay].set(work);
	}
	public void view() {
		System.out.print("날짜(1~30)?");
		int choiceDay = sc.nextInt();
		days[choiceDay].show();
	}
	public void finish() {
		System.out.print("프로그램을 종료합니다.");
		sc.close();
	}
}

public class work1 {	
	public static void main(String[] args) {
		// 문자열 비교는 .equals()
		// string to int >>> int a = Integer.parseInt("asdf");
		// int to string >>> String s = Integer.toString(1);
		// public enum Week {월,화,수,목,금,토,일}		
		//Scanner sc = new Scanner(System.in);
		
		MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
		april.run();
		
		//sc.close();
	}

}
