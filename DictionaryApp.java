
abstract class PairMap{
	protected String[] keyArray;
	protected String[] valueArray;
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap{
	private int s;
	
	public Dictionary(int x) {
		keyArray = new String[x];
		valueArray = new String[x];
		this.s = 0;
	}
	@Override
	String get(String key) {
		for(int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		for(int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value;
				return;
			}
		}
		keyArray[s] = key;
		valueArray[s] = value;
		s++;
	}

	@Override
	String delete(String key) {
		String delValue = null;
		for(int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				keyArray[i] = null;
				delValue = valueArray[i];
				valueArray[i] = null;
				s--;
			}
		}
		return delValue;
	}

	@Override
	int length() {
		return s;
	}
	
}

public class DictionaryApp {
	
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은  " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
	
}
