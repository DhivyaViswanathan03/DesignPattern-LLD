import E1.FlyweightSolution2DesignPattern.DocumentCharacter;
import E1.FlyweightSolution2DesignPattern.ILetter;
import E1.FlyweightSolution2DesignPattern.LetterFactory;

public class Main {

	public static void main(String[] args) {
		
	ILetter letter1=LetterFactory.createLetter('t');
	letter1.display(0, 4);
	
	ILetter letter2=LetterFactory.createLetter('t');
	letter2.display(0, 6);

	}

}
