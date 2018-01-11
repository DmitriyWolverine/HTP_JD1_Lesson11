package by.htp.source;

import java.util.HashMap;

import by.htp.countFrequencyOfWords.FrequencyCounter;
import by.htp.excludeLongestSubstring.LongStringsExcluder;
import by.htp.insertionOfSubstring.SubstringInsert;
import by.htp.replaceCharByAnother.CharReplacer;
import by.htp.updatesComparator.SpeedCounter;

public class Run {

	public static void main(String[] args) {
		/*Blinov Romanchik page 195. 
		 In brackets we put requirements which class we have to use
				 	A 1 (solve by string)
					A 4 (solve by StringBuilder)
					A 9 (solve by String)
					C 2 (Anyway)
					C 11(Anyway)
		*/

		/* A 1 (solve by string)
		 * Task is to replace letter number 'k'
		 * in every word by new character
		 */
		String s = "Life is a waterfall, We're one in the river And one again after the fall";
		CharReplacer replacer = new CharReplacer(9);
		String firstTaskRes = replacer.changeLetter(s, 'q');
		System.out.println(s);
		System.out.println(firstTaskRes);
		System.out.println("");
		/* A 4 (StringBuilder)
		 *  Task is insert some substring after symbol number 'k'
		 */
		SubstringInsert insertion = new SubstringInsert(6);
		String secondTaskRes =  insertion.insertionOfSubstring(s, "SOAD RULES");
		System.out.println(secondTaskRes);
		System.out.println("");
		/* 	A 9 (String)
		 * Task is to count how many time we can see every word in text
		 */
		FrequencyCounter counter = new FrequencyCounter(s);
		
		for(HashMap.Entry<String, Integer> pair: counter.countWordsFrequency().entrySet() ) {
			System.out.println( pair.getKey()+" - "+ pair.getValue());
		}
		System.out.println("");
		/*	C 2 (Anyway)
		 * Task is exclude from text
		 * substring starts and ends with the same character
		 * and this substring should be the longest among others
		 */
		LongStringsExcluder excluder = new LongStringsExcluder(s);
		String fourthTaskResult =  excluder.cutString();
		System.out.println(fourthTaskResult);
		System.out.println("");
		/*	C 11 (Anyway)
		 * Task is to show which of the ways of appending string
		 * is faster:  String using operation "concat" or
		 * StringBuilder using  "append"
		 */
		System.out.println("String appender time in miliseconds: " + SpeedCounter.getStringAppendTime(1_000_000));
		System.out.println("StringBuilder appender time in miliseconds: " + SpeedCounter.getStringBuilderAppendTime(1_000_000));
	}
}