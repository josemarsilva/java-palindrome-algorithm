package josemarsilva.com.br.palindrome_algorithm;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test 00 .. 100
     */
    
    public void testApp()
    {
    	String[] strArrayPhrase = new String[] {
    			"af�",
    			"aia",
    			"aibofobia",
    			"ala",
    			"ama",
    			"an�",
    			"anilina",
    			"ata",
    			"arara",
    			"asa",
    			"ele",
    			"esse",
    			"mamam",
    			"matam",
    			"metem",
    			"mirim",
    			"oco",
    			"omiss�ssimo",
    			"osso",
    			"ovo",
    			"radar",
    			"raiar",
    			"ralar",
    			"rapar",
    			"rasar",
    			"reger",
    			"reler",
    			"reter",
    			"rever",
    			"reviver",
    			"rir",
    			"sacas",
    			"saias",
    			"salas",
    			"socos",
    			"sopapos",
    			"s�s",
    			"A base do teto desaba.",
    			"A cara rajada da jararaca.",
    			"Acuda cadela da Leda caduca.",
    			"A dama admirou o rim da amada.",
    			"A Daniela ama a lei? Nada!",
    			"Adias a data da sa�da.",
    			"A diva em Argel alegra-me a vida.",
    			"A droga do dote � todo da gorda.",
    			"A gorda ama a droga.",
    			"A grama � amarga.",
    			"A�, Lima falou: \"Ol�, fam�lia!\".",
    			"Ajudem Edu, j�!",
    			"A lupa pula.",
    			"A m�e te ama.",
    			"A mala nada na lama.",
    			"Ame o poema.",
    			"A miss � p�ssima!",
    			"Amo Om�. Se Roma me tem amores, amo Om�!",
    			"Anotaram a data da maratona.",
    			"A pateta ama at� tapa.",
    			"Ap�s a sopa.",
    			"Arara rara.",
    			"� Rita, s�tira!",
    			"A Rita, sobre vov�, versos atira.",
    			"A rua Laura.",
    			"Assim a aia ia � missa.",
    			"Ato idiota.",
    			"A torre da derrota.",
    			"E at� o Papa poeta �.",
    			"Irene ri.",
    			"La�o bacana para panaca bo�al.",
    			"L� vou eu em meu eu oval.",
    			"Luza Rocelina, a namorada do Manuel, leu na moda da romana: \"anil � cor azul\".",
    			"Luz azul.",
    			"Mega bobagem.",
    			"Me v� se a panela da mo�a � de a�o, Madalena Paes, e vem.",
    			"Missa � assim.",
    			"O c�u sueco.",
    			"O galo ama o lago.",
    			"Ol�, galo!",
    			"Ol�! Maracuj�, caju, caramelo.",
    			"O lobo ama o bolo.",
    			"O romano acata amores a damas amadas e Roma ataca o namoro.",
    			"O teu dueto.",
    			"�timo, s� eu, que os omito.",
    			"Oto come mocot�.",
    			"O trote torto.",
    			"Rir, o breve verbo rir.",
    			"Roma � amor.",
    			"Roma me tem amor.",
    			"Sa�ram o tio e oito Marias.",
    			"Seco de raiva, coloco no colo caviar e doces.",
    			"Socorram-me, subi no �nibus em Marrocos.",
    			"Z� de Lima, Rua Laura, mil e dez."
    		};
    	PalindromeAlgorithm palindromeAlgorithm = new PalindromeAlgorithm();  
    	boolean bTrueExpected = true;
    	System.out.println("List of phrases checked with true expected:");
    	for (int i=0;i<strArrayPhrase.length;i++) {
    		System.out.print(i + ": '" + strArrayPhrase[i] + "'");
    		if (!palindromeAlgorithm.isPalindrome(strArrayPhrase[i])) {
    			bTrueExpected = false;
    			System.out.println(" - False"
    					+ "\n     * " + palindromeAlgorithm.getStrAdjustedPhrase()
    					+ "\n     * " + palindromeAlgorithm.reverse(palindromeAlgorithm.getStrAdjustedPhrase())
    			);
    		} else {
    			System.out.println(" - True");
    		}
    	}
    	assertTrue(bTrueExpected);
    }
    

}
