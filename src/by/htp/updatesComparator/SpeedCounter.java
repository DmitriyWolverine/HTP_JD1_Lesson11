package by.htp.updatesComparator;

import java.util.Date;

public class SpeedCounter {
	
	public static long getStringAppendTime(int numberOfCharacters) {
		String str = "";
		Date startTime = new Date();
		for ( int i = 0 ; i < numberOfCharacters ; ++i) {
			str = str + 'a';
			if(i%1000 == 0 )
			{
				System.out.println(i);
			}
		}
		Date finishTime = new Date();
		return finishTime.getTime() - startTime.getTime();
	}
	
	public static long getStringBuilderAppendTime(int numberOfCharacters) {
		StringBuilder builder = new StringBuilder();
		Date startTime = new Date();
		for ( int i = 0 ; i < numberOfCharacters ; ++i) {
			builder.append('a');
			if(i%1000 == 0 )
			{
				System.out.println(i);
			}
		}
		Date finishTime = new Date();
		return finishTime.getTime() - startTime.getTime();
	}
}