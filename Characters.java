// name: Min Kyoung Nam, id: 20162564, class: GongTong
import java.io.InputStream;
import java.util.Scanner;

public class Characters {
	char[][] chars;
	
	Characters(char[][] chars) {
		this.chars = chars;
	}
	
	void print() {
		for(int i=0; i<chars.length; i++) {
			for(int j=0; j<chars[i].length; j++) {
				System.out.print(chars[i][j]);
			}
			System.out.println();
		}
	}
	
	int getLineCount() {
		return chars.length;
	}
	
	int getCharCountAt(int lineIndex) {
		return chars[lineIndex].length;
	}
	
	char getCharAt(int rowIndex, int columnIndex) {
		return chars[rowIndex][columnIndex];
	}
	
	int compareLines(int lineIndex1, int lineIndex2) {
		return chars[lineIndex1][0] < chars[lineIndex2][0] ? -1 : 0;
	}
	
	void sortLines() {
		for(int i=0; i<chars.length; i++) {
			for(int j=0; j<chars[i].length-1; j++) {
				if(chars[i][j] > chars[i][j+1]) {
					char tmp = chars[i][j];
					chars[i][j] = chars[i][j+1];
					chars[i][j+1] = tmp;
				}
			}
		}
	}
	
	int getCharCount() {
		int count = 0;
		for(int i=0; i<chars.length; i++) {
			for(int j=0; j<chars[i].length; j++) {
				count += 1;
			}
		}
		return count;
	}
	
	char[] to1DArray() {
		char[] array = new char[getCharCount()];
		for(int i=0; i<chars.length; i++) {
			for(int j=0; j<chars[i].length; j++) {
				array[i] = chars[i][j];
			}
		}
		
		return array;
	}
	
	int getTokenCount(char delimiter) {
		int token=1;
		for(int i=0; i<chars.length; i++) {
			for(int j=0; j<chars[i].length; j++) {
				if(chars[i][j] == delimiter) {
					token += 1;
				}
			}
		}
		return token;
	}
	
	char[][] split(char delimiter) {
		int count = 0;
		char[][] splitChars = new char[chars.length][];
		for(int i=0; i<chars.length; i++) {
			for(int j=0; j<chars[i].length; j++) {
				count += 1;
				if(chars[i][j] == delimiter) {
					splitChars[i] = new char[count];
					System.out.println();
				}
			}
		}
		return splitChars;
	}
	
	static Scanner getScanner(InputStream source) {
		Scanner scanner = new Scanner(source);
		return scanner;
	}
	
	static char[][] addRow(char[][] array) {
		int n = array.length;
		char[][] arrNew = new char[n+1][];
		for(int i=0; i<n; i++) {
			for(int j=0; j<array[i].length; j++) {
				arrNew[i] = new char[array[i].length];
				arrNew[i][j] = array[i][j];
			}
		}
		return arrNew;
	}
	
	static char[][] scanLines(Scanner scanner) {
		char[][] chars = new char[0][];
		String s;
		int count = 0;
		while(true) {
			s = scanner.nextLine();
			if(scanner.equals("^Z")) break;
			if(count>0)
				chars = addRow(chars);
			chars[count] = new char[s.length()];
			for(int i=0; i<s.length(); i++) {
				chars[count][i] = s.charAt(i);
			}
			count++;
		}
		return chars;
	}
	
	static void closeScanner(Scanner scanner) {
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println("Input multiple lines:");
		
		Scanner scanner = getScanner(System.in);
		
		char[][] input = scanLines(scanner);
		
		closeScanner(scanner);
		
		System.out.println("*** the input's finished ***");
		
		Characters lines = new Characters(input);
		
		System.out.println("*** print the only field chars of this class ***");
		lines.print();
		System.out.println("*** print the only field chars of this class ***");
		
		System.out.println("*** line count ***");
		System.out.println(lines.getLineCount());
		System.out.println("*** line count ***");
		
		System.out.println("*** the number of characters in the 1st line ***");
		System.out.println(lines.getCharCountAt(0));
		System.out.println("*** the number of characters in the 1st line ***");
		
		System.out.println("*** get the total number of characters ***");
		System.out.println(lines.getCharCount());
		System.out.println("*** get the total number of characters ***");
		
		System.out.println("*** get the 1st char in the 1st line ***");
		System.out.println(lines.getCharAt(0, 0));
		System.out.println("*** get the 1st char in the 1st line ***");
		
		System.out.println("*** get the 1D array created from the field chars ***");
		System.out.println(lines.to1DArray());
		System.out.println("*** get the 1D array created from the field chars ***");
		
		System.out.println("*** compare the 1st line and 2nd line ***");
		System.out.println("*** when the 1st line > the 2nd line, print 1 ***");
		System.out.println("*** when the 1st line = the 2nd line, print 0 ***");
		System.out.println("*** when the 1st line < the 2nd line, print -1 ***");
		System.out.println(lines.compareLines(0, 1));
		System.out.println("*** compare the 1st line and 2nd line ***");
		
		System.out.println("*** sort lines and print***");
		lines.sortLines();
		lines.print();
		System.out.println("*** sort lines and print***");
		
		System.out.println("*** get token count split with delimiter 's' ***");
		System.out.println(lines.getTokenCount('s'));
		System.out.println("*** get token count split with delimiter 's' ***");
		
		System.out.println("*** split the field chars with delimiter 's' ***");
		char[][] tokens = lines.split('s');
		
		Characters split = new Characters(tokens);
		split.print();
		System.out.println("*** split the field chars with delimiter 's' ***");
	}

}
