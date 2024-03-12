
public class MyString {
	private char[] characters;

	public MyString(String str) {
		this.characters = str.toCharArray();
	}

	public void print() {
		System.out.println(new String(characters));
	}

	public int indexOf(char c) {
		for (int i = 0; i < characters.length; i++) {
			if (characters[i] == c) {
				return i;
			}
		}
		return -1; //it wasnt found 
	}

	public int length() {
		return characters.length;
	}
}
