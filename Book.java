package WorkExample;

import java.util.Scanner;

public class Book {
	String title;
	String author;
	
	public Book() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	public Book(String title) {
		this(title,"작자미상");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void show() {
		System.out.println("(" + title + ", " +author + ")");
	}
	
	public static void main(String[] args) {
		/*Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();		
		loveStory.show();*/
		
		Scanner sc = new Scanner(System.in);
		Book[] arrayBook = new Book[2];
		for(int i=0; i<arrayBook.length; i++) {
			System.out.print("제목>>");
			String bTitle = sc.nextLine();
			System.out.print("저자>>");
			String bAuthor = sc.nextLine();
			arrayBook[i] = new Book(bTitle, bAuthor);
		}
		for(int i=0; i<arrayBook.length; i++) {
			arrayBook[i].show();
		}
	}

}
