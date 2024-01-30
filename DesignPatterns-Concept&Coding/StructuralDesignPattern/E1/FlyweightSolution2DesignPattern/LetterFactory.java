package E1.FlyweightSolution2DesignPattern;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
	static Map<Character,ILetter> cachedMemory=new HashMap();
	
	public static ILetter createLetter(char c) {
		if(cachedMemory.containsKey(c)) {
			return cachedMemory.get(c);
		}else {
			ILetter letter=new DocumentCharacter(c, 10, "Arial");
			cachedMemory.put(c, letter);
			return cachedMemory.get(c);
		}
	}

}
