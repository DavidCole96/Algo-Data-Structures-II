
import java.util.Scanner;

import java.io.*; 
import java.util.*;

public class Anagrams {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s = new ArrayList<String>(); 
		Scanner scan = null; 
		try{ 
			scan = new Scanner(new File("C:\\Users\\David\\Documents\\Junior Spring\\Algo Data Structures\\dictionary.txt")); 
			while(scan.hasNextLine()) { 
				s.add(scan.nextLine());
		} } 
		catch(FileNotFoundException e) {
			System.out.println("File not found"); 
			}
		System.out.println("Please enter a word to test:");
		Scanner scan1 = new Scanner(System.in);
		String word = scan1.next(); 
		List<String> wordsSet = new ArrayList<String>();
		List<String> origSet = new ArrayList<String>();
		origSet = anagrams(word);
		for(int i = 0;i<origSet.size();i++){
			if(s.contains(origSet.get(i)))
				wordsSet.add(origSet.get(i));
			
	}
		System.out.println(wordsSet);
	}
	
	static List <String> anagrams (String s){
		List<String> set = new ArrayList<String>();
		String word = s;
		int len = word.length();
		if(len == 0){System.out.print("word has no length");}
			Character z = word.charAt(0);
		if(word.length() > 1){
			for(int n = 0; n<len;n++){
				z = word.charAt(n);
				String remaining = word.substring(0,n)+word.substring(n+1);
				List<String> anaSet = anagrams(remaining);
					for(int j =0;j<anaSet.size();j++){
							set.add(z+anaSet.get(j));
			}
		}
	}
	else{
		set.add(z + "");
	}
	return set;
	}

}
	

