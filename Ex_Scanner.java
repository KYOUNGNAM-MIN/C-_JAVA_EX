import java.util.Scanner;

public class Ex_Scanner {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("�̸��� " + name + ",");
		
		String city = scanner.next();
		System.out.print("���ô� " + city + ",");
		
		int age = scanner.nextInt();
		System.out.print("���̴� " + age + ",");
		
		double weight = scanner.nextDouble();
		System.out.print("ü���� " + weight + ",");
		
		boolean single = scanner.nextBoolean();
		System.out.println("���� ���δ� " + single + "�Դϴ�.");
		
		scanner.nextLine();//enterġ�� nextLine �Է¹ޱ� ����
		String sc_line = scanner.nextLine();
		System.out.println(sc_line);
		
		scanner.close();
	}

}
