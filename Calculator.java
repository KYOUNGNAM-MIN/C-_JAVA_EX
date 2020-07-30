package WorkExample;

import java.util.Scanner;

class Add{
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a + b;
	}
}
class Sub{
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a-b;
	}
}
class Mul{
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a*b;
	}
}
class Div{
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a/b;
	}
}


public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		int result = 0;
		switch(c) {
		case '+':
			Add t1 = new Add();
			t1.setValue(a, b);
			result = t1.calculate();
			break;
		case '-':
			Sub t2 = new Sub();
			t2.setValue(a, b);
			result = t2.calculate();
			break;
		case '*':
			Mul t3 = new Mul();
			t3.setValue(a, b);
			result = t3.calculate();
			break;
		case '/':
			Div t4 = new Div();
			t4.setValue(a, b);
			result = t4.calculate();
			break;
		}
		System.out.println(result);
		sc.close();
	}

}
