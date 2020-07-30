import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	
	public Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	public Phone() {}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
}

public class PhoneBook extends Phone{
	Phone[] phone;
	Scanner sc;
	private int peopleNum;
	public PhoneBook() {
		sc = new Scanner(System.in);
	}
	public void input() {
		System.out.print("인원수>>");
		peopleNum = sc.nextInt();
		if(peopleNum<=0) {
			System.out.println("저장된 사람이 없습니다...");
			System.out.println("시스템을 종료합니다...");
			return;
		}
		phone = new Phone[peopleNum];
		
		for(int i=0; i<peopleNum; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}
	public String search(String searchName) {
		for(int i=0; i<phone.length; i++) {
			if(searchName.equals(phone[i].getName())){
				return phone[i].getTel();
			}
		}
		return null;
	}
	public void run() {
		input();
		if(peopleNum <= 0) return;
		while(true) {
			System.out.print("검색할 이름>>");
			String searchName = sc.next();
			if(searchName.equals("그만")) {
				break;
			}
			String getSearchTel = search(searchName);
			if(getSearchTel == null)
				System.out.println(searchName + "이 없습니다.");
			else
				System.out.println(searchName + "의 번호는 " + getSearchTel + "입니다.");
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		new PhoneBook().run();
	}

}
