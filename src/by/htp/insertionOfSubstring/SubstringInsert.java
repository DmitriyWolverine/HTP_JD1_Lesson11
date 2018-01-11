package by.htp.insertionOfSubstring;

public class SubstringInsert {
	private int number;
	public SubstringInsert(int number) {
		this.number = number;
	}
	
	public String insertionOfSubstring(String text, String substringToInsert) {
		if(number < text.length()){
			StringBuilder sb = new StringBuilder(text);
			sb.insert(number, substringToInsert);
			return sb.toString();
		}
		else {
			return text;
		}
	}
}