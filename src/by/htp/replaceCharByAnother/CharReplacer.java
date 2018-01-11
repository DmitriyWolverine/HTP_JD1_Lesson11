package by.htp.replaceCharByAnother;

public class CharReplacer {
	private int number;
	
	public CharReplacer( int number) {
		this.number = number;
	}
	
	public String changeLetter(String text, char newLetter) {
		String [] wordsArr = text.split(" ");
		for(int i = 0 ; i < wordsArr.length ; ++i) {
			if(endsWithPunctuationSigns(wordsArr[i]))
			{
				if(number <= wordsArr[i].length() -2) {
					wordsArr[i] = replaceLetter(wordsArr[i], number, newLetter);
				}
			}
			else {
				if(number <= wordsArr[i].length() -1) {
					wordsArr[i] = replaceLetter (wordsArr[i], number, newLetter);
				}
			}
		}
		String res = "";
		for(int i = 0 ; i < wordsArr.length ; ++i) {
			res+= wordsArr[i];
			res+=" ";
		}
		return res;
	}
	
	private boolean endsWithPunctuationSigns(String word) {
		char lastChar = word.charAt(word.length() - 1);
		if( Character.isAlphabetic(lastChar) ) {
			return false;
		}
		return true;
	}
	
	private String replaceLetter(String s, int index, char newChar) {
		String result = "";
		for(int i = 0 ; i < s.length() ; ++i) {
			if(i == index) {
				result+=newChar;
			}
			else {
			result+=s.charAt(i);
			}
		}
		return result;
	}
}