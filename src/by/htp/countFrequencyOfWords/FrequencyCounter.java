package by.htp.countFrequencyOfWords;

import java.util.HashMap;

public class FrequencyCounter {
	private String text;
	
	public FrequencyCounter(String str) {
		if(str!=null) {
			text = str;
		}
	}
	public HashMap<String, Integer> countWordsFrequency(){
		String [] textInWords = text.split("[,;:.!?\\s]+");
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0 ; i < textInWords.length; ++i) {
			if(map.containsKey(textInWords[i])) {
				map.put(textInWords[i],  map.get(textInWords[i]) + 1 );
			}
			else {
				map.put(textInWords[i],  1 );
			}
		}
		return map;
	}
	
}
