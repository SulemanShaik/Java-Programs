package PART_26_Java_Programe_CountOccurencesofaCharacterInString;

public class CountOccurencesString {

	public static void main(String[] args) {
        
		String str="Java programming java oops";
		
		int totcount=str.length();

		
		int totalcount_afterremove=str.replace("a", "").length();
		
		int count=totcount-totalcount_afterremove;
		System.out.println(count);
		
		
	}

}
