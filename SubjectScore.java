import java.util.Scanner;

public class SubjectScore {

	public static void main(String[] args) {
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			boolean check = false;
			System.out.print("과목 이름>>");
			String subject = sc.nextLine();
			if(subject.equals("그만")) {
				break;
			}
			else {
				for(int i=0; i<course.length; i++) {
					if(course[i].equals(subject)) {
						check = true;
						System.out.println(subject + "의 점수는 " + score[i]);
						break;
					}
				}
				if(check == false) System.out.println("없는 과목입니다.");
			}
		}
		sc.close();
	}

}
