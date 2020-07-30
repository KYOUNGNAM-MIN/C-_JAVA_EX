import java.util.Scanner;

class Dictionary{
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public Dictionary() {}
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
	}
}

public class DictionaryProgram extends Dictionary{
	Scanner sc;
	private String searchWord;
	public DictionaryProgram() {
		sc = new Scanner(System.in);
	}
	public void run() {
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			searchWord = sc.next();
			if(searchWord.equals("그만")) break;
			String findWord = kor2Eng(searchWord);
			if(findWord==null)
				System.out.println(searchWord + "은(는) 저의 사전에 없습니다.");
			else
				System.out.println(searchWord + "은(는) " + findWord);
		}
		sc.close();
	}
	public static void main(String[] args) {
		new DictionaryProgram().run();
	}

}
