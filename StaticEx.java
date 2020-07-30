package WorkExample;

class ArrayUtil{
	public static int[] concat(int[] a, int[] b) {
		int[] tmp = new int[a.length+b.length];
		for(int i=0; i<a.length; i++) {
			tmp[i] = a[i];
		}
		for(int j=0; j<b.length; j++) {
			tmp[a.length+j] = b[j];
		}
		return tmp;
	}
	public static void print(int[] a){
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}

public class StaticEx {

	public static void main(String[] args) {
		int[] array1 = {1, 5, 7, 9};
	    int[] array2 = {3, 6, -1, 100, 77};
	    int[] array3 = ArrayUtil.concat(array1, array2);
	    ArrayUtil.print(array3);
	}

}
