import java.util.Scanner;

public class LittleAlphaPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char alpha = sc.next().charAt(0);
		
		for(int i = alpha - 'a'; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				System.out.print((char)('a' + j));
			}
			System.out.println();
		}
		
		sc.close();
	}

}
