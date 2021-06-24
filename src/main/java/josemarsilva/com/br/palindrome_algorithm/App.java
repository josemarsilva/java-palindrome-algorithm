package josemarsilva.com.br.palindrome_algorithm;

/**
 * App - Palindrome Algorithm
 *
 */
public class App 
{
	
	private static final String APP_NAME = new String("PalindromeAlgorithm");
	private static final String APP_VERSION = new String("2021.06.24.1100");
	private static final String MSG_WELLCOME = new String( APP_NAME + " -  " + APP_VERSION + "\n");
	private static final String MSG_USAGE = new String( "Usage: \n" +
			"  java -jar palindrome-algorithm\n"
	);
	private static final String MSG_SEEALSO = new String( "See also: \n" +
			"  https://www.todamateria.com.br/palindromo/\n" +
			"  https://github.com/josemarsilva/java-palindrome-algorithm"
	);
	private static final String MSG_RESULT = new String( "Palindrome evaluation for your original phrase '%strPhrase' is %strResult.");
	private static final String MSG_COMPARISON= new String( "  * %strAdjustedPhrase\n"
														+   "  * %strReversePhrase"
	);
	
    public static void main( String[] args )
    {        
        if ( args.length ==  0 ) {
        	
        	System.out.println(MSG_WELLCOME + MSG_USAGE + MSG_SEEALSO);
        	
        	// Exit fails 
        	System.exit( 1 );
        	
        } else {
            PalindromeAlgorithm palindromeAlgorithm = new PalindromeAlgorithm();
            
            // Argument
            String strPhrase = new String("");
            for (int i=0; i < args.length; i++ ) {
            	strPhrase = strPhrase.concat(args[i]);
            }
            
            // Result
            boolean bResult = true;
            String strResult = new String("True");
            if (!palindromeAlgorithm.isPalindrome(strPhrase)) {
            	bResult = false;
                strResult = new String("False");
            }
            System.out.println(MSG_RESULT.replace("%strPhrase", strPhrase).replaceFirst("%strResult", strResult));
            
            if (!bResult) {
                System.out.println(MSG_COMPARISON.replaceAll("%strAdjustedPhrase", palindromeAlgorithm.getStrAdjustedPhrase()).replaceAll("%strReversePhrase", palindromeAlgorithm.reverse(palindromeAlgorithm.getStrAdjustedPhrase())));
            }

        	// Exit success!

        }
        
    }
}
