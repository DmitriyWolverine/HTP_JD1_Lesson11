package by.htp.excludeLongestSubstring;

import java.util.HashMap;

public class LongStringsExcluder {
	private String text;
	public LongStringsExcluder(String str) {
		text = str;
	}
	
	private String findLongestSubstring() {
		HashMap<Character,Integer> mapInRightOrder = new HashMap<>();
		for(int i = 0 ; i < text.length() ; ++i) {
			for(int j = text.length() - 1 ; j>=i; j--) {
				if(text.charAt(i) == text.charAt(j) && !mapInRightOrder.containsKey(text.charAt(i)) ) {
					mapInRightOrder.put(
							text.charAt(i), text.lastIndexOf(text.charAt(j)) - text.indexOf(text.charAt(i)) );
					break;
				}
			}
		}
		int maxLength = 0;
		char maxlengthSymbol = '~';
		for(HashMap.Entry<Character, Integer> pair: mapInRightOrder.entrySet()) {
			if(pair.getValue() > maxLength) {
				maxLength = pair.getValue();
				maxlengthSymbol = pair.getKey();
			}
		}
		return text.substring(text.indexOf(maxlengthSymbol), text.lastIndexOf(maxlengthSymbol) +1);
	}
	
	public String cutString() {
		return text.replaceAll(findLongestSubstring(), "");
	}
	
}
