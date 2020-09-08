package map;

public class HashFunction {

	public static void main(String[] args) {
		System.out.println(getHash("CAT"));

	}
	public static int getHash(String s) {
		int hash=0;
		for(int i=0;i<s.length();i++) {
			hash =hash+s.charAt(i);
		}
		return hash;
	}

}
