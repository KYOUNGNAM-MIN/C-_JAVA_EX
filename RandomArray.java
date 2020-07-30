import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
		System.out.print("정수 몇개?");
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		boolean check = false;
		int tmp;
		
		for(int i=0; i<arrSize; i++) {
			tmp = (int)(Math.random()*100 + 1);
			check = false;
			for(int j=0; j<arrSize; j++) {
				if(tmp == arr[j]) {
					check = true;
					break;
				}
			}
			if(check == true) {
				i--;
				continue;
			}
			arr[i] = tmp;
		}
		
		for(int i=0; i<arrSize; i++) {
			if(i != 0 && i%10 == 0)
				System.out.println();
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
