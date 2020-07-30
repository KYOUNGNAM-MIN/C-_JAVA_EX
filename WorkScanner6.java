package WorkExample;

import java.util.Scanner;

public class WorkScanner6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = sc.nextInt();
		int cnt = 0;
		while(num>0) {
			int tmp = num%10;
			if(tmp%3==0)
				cnt++;
			num = num/10;
		}
		if(cnt==1)
			System.out.print("박수짝");
		else if(cnt==2)
			System.out.print("박수짝짝");
		
		sc.close();
	}

}
