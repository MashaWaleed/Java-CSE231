
public class MyStringBuffer {
	private char[] characters;

	public MyStringBuffer(String str) {
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

	public void erase(int index, int length) {
		if (index < 0 || index >= characters.length || length <= 0) { // implausable
			return;
		}
		if (index + length > characters.length) {
			length = characters.length - index;
		}
		// making a temporary array erasing and then assigning it back
		
		System.arraycopy(characters, index + length, characters, index, characters.length - index - length);
		char[] temp = new char[characters.length - length];
		System.arraycopy(characters, 0, temp, 0, characters.length - length);
		characters = temp;
	}

	public void insert(int index, String str) {
		if (index < 0 || index > characters.length) {
			return;
		}
		
		// same logic here 
		
		char[] newChars = new char[characters.length + str.length()];
		System.arraycopy(characters, 0, newChars, 0, index);
		System.arraycopy(str.toCharArray(), 0, newChars, index, str.length());
		System.arraycopy(characters, index, newChars, index + str.length(), characters.length - index);
		characters = newChars;
	}
}
