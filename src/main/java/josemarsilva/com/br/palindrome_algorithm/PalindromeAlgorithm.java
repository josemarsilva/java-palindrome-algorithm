package josemarsilva.com.br.palindrome_algorithm;

import java.text.Normalizer;

public class PalindromeAlgorithm {

	/*
	 * Properties
	 */
	private String strOriginalPhrase;
	private String strAdjustedPhrase;


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
				
		boolean bRet = true;

		// Save original and adjusted phrase
		this.setStrOriginalPhrase(str);
		String strCleaned = cleanString(str);
		this.setStrAdjustedPhrase(strCleaned);
		
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
	
	/*
	 * Reverse
	 */
	public String reverse(String str) {
		String strReturn = new String("");
		for (int i=str.length()-1; i>=0; i--) {
			strReturn = strReturn.concat( str.substring(i, i+1) );
		}
		return strReturn;
	}
	
	/*
	 * Getter's and Setter's
	 */
	public String getStrOriginalPhrase() {
		return strOriginalPhrase;
	}

	public void setStrOriginalPhrase(String strOriginalPhrase) {
		this.strOriginalPhrase = strOriginalPhrase;
	}

	public String getStrAdjustedPhrase() {
		return strAdjustedPhrase;
	}

	public void setStrAdjustedPhrase(String strAdjustedPhrase) {
		this.strAdjustedPhrase = strAdjustedPhrase;
	}


}
