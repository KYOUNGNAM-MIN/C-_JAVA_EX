
public class FourByFourRandArray {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		
		for(int i=0; i<10; i++) {
			int tmpX = (int)(Math.random()*4);
			int tmpY = (int)(Math.random()*4);
			if(arr[tmpX][tmpY] == 0) {
				arr[tmpX][tmpY] = (int)(Math.random()*10 + 1);
			}
			else {
				i--;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
	}

}
