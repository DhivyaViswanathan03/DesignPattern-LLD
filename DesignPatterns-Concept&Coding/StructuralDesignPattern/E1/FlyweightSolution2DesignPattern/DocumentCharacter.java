package E1.FlyweightSolution2DesignPattern;

public class DocumentCharacter implements ILetter {
	char character;
	int size;
	String fontType;

	public DocumentCharacter(char character, int size, String fontType) {
		this.character = character;
		this.size = size;
		this.fontType = fontType;
	}

	public char getCharacter() {
		return character;
	}

	public int getSize() {
		return size;
	}

	public String getFontType() {
		return fontType;
	}

	@Override
	public void display(int row, int col) {
		System.out.println("DocumentCharacter.display() " + row + " " + col);
	}

}
