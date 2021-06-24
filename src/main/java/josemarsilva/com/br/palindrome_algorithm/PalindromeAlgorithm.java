package josemarsilva.com.br.palindrome_algorithm;

import java.text.Normalizer;

public class PalindromeAlgorithm {

	/*
	 * Properties
	 */
	private StringBuffer sbPhrase;


	/*
	 * Constructor
	 */
	public PalindromeAlgorithm() {
		super();
	}
	
	/*
	 * IsPalindrome() - return boolean if is or not palindrome
	 * returns: boolean
	 */
	public boolean isPalindrome(String str) {		
		
		// Test
		boolean bRet = true;
		
		String strCleaned = cleanString(str);		
        for (int i=0; i< strCleaned.length() / 2 ; i++ ) {
        	if ( strCleaned.charAt(i) != strCleaned.charAt(strCleaned.length()-1-i) ) {
        		bRet = false;
        		break;
        	}
        }
		
		// Return 
		return bRet;
	}
	
	
	/*
	 * cleanString - take accents off, convert UTF8, take spaces, points off
	 */
	private String cleanString(String str) {
		String strResult = new String( Normalizer.normalize( str.toLowerCase(), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "") );
    	return strResult.replaceAll("-", "").replaceAll(",", "").replaceAll("\\.", "").replaceAll("!", "").replaceAll(":", "").replaceAll("\\?", "" ).replaceAll("\\(", "" ).replaceAll("\\)", "" ).replaceAll(" ", "" );
	}



}
