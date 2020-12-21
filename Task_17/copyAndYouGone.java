package Task_17;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class copyAndYouGone {

	public static void main(String[] args) {
		String[] words = { "ABC", "CDE", "FGA", "CDE", "GAE", "ABC", "ABO" };
		
		List<String> wordsLean = Arrays.asList(words).stream().distinct().collect(Collectors.toList());
			
		System.out.println(wordsLean);
	}

}
