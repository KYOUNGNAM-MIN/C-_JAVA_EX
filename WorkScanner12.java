package WorkExample;

import java.util.Scanner;

public class WorkScanner12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����>>");
		double a = sc.nextDouble();
		String op = sc.next();
		double b = sc.nextDouble();
		double result = 0;
		
		/*switch(op) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			if(b==0) System.out.print("0���� ���� �� �����ϴ�.");
			else result = a / b;
			break;
		}*/
		
		if(op.equals("+"))
			result = a + b;
		else if(op.equals("-"))
			result = a - b;
		else if(op.equals("*"))
			result = a * b;
		else if(op.equals("/")) {
			if(b == 0){
				System.out.print("0���� ���� �� �����ϴ�.");
				sc.close();
				return;
			}
			else
				result = a / b;
		}
		
		System.out.print(a + op + b + "�� ��� ����� " + result);
		sc.close();
	}

}
