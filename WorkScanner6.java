package WorkExample;

import java.util.Scanner;

public class WorkScanner6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = sc.nextInt();
		int cnt = 0;
		while(num>0) {
			int tmp = num%10;
			if(tmp%3==0)
				cnt++;
			num = num/10;
		}
		if(cnt==1)
			System.out.print("�ڼ�¦");
		else if(cnt==2)
			System.out.print("�ڼ�¦¦");
		
		sc.close();
	}

}
