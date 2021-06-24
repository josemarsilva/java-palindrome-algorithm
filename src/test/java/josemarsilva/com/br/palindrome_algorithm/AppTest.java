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
    			"afã",
    			"aia",
    			"aibofobia",
    			"ala",
    			"ama",
    			"anã",
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
    			"omissíssimo",
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
    			"sós",
    			"A base do teto desaba.",
    			"A cara rajada da jararaca.",
    			"Acuda cadela da Leda caduca.",
    			"A dama admirou o rim da amada.",
    			"A Daniela ama a lei? Nada!",
    			"Adias a data da saída.",
    			"A diva em Argel alegra-me a vida.",
    			"A droga do dote é todo da gorda.",
    			"A gorda ama a droga.",
    			"A grama é amarga.",
    			"Aí, Lima falou: “Olá, família!”.",
    			"Ajudem Edu, já!",
    			"A lupa pula.",
    			"A mãe te ama.",
    			"A mala nada na lama.",
    			"Ame o poema.",
    			"A miss é péssima!",
    			"Amo Omã. Se Roma me tem amores, amo Omã!",
    			"Anotaram a data da maratona.",
    			"A pateta ama até tapa.",
    			"Após a sopa.",
    			"Arara rara.",
    			"À Rita, sátira!",
    			"A Rita, sobre vovô, versos atira.",
    			"A rua Laura.",
    			"Assim a aia ia à missa.",
    			"Ato idiota.",
    			"A torre da derrota.",
    			"E até o Papa poeta é.",
    			"Irene ri.",
    			"Laço bacana para panaca boçal.",
    			"Lá vou eu em meu eu oval.",
    			"Luza Rocelina, a namorada do Manuel, leu na moda da romana: \"anil é cor azul\".",
    			"Luz azul.",
    			"Mega bobagem.",
    			"Me vê se a panela da moça é de aço, Madalena Paes, e vem.",
    			"Missa é assim.",
    			"O céu sueco.",
    			"O galo ama o lago.",
    			"Olá, galo!",
    			"Olé! Maracujá, caju, caramelo.",
    			"O lobo ama o bolo.",
    			"O romano acata amores a damas amadas e Roma ataca o namoro.",
    			"O teu dueto.",
    			"Ótimo, só eu, que os omito.",
    			"Oto come mocotó.",
    			"O trote torto.",
    			"Rir, o breve verbo rir.",
    			"Roma é amor.",
    			"Roma me tem amor.",
    			"Saíram o tio e oito Marias.",
    			"Seco de raiva, coloco no colo caviar e doces.",
    			"Socorram-me, subi no ônibus em Marrocos.",
    			"Zé de Lima, Rua Laura, mil e dez."
    		};
    	PalindromeAlgorithm palindromeAlgorithm = new PalindromeAlgorithm();  
    	boolean bTrueExpected = true;
    	System.out.println("List of phrases checked with true expected:");
    	for (int i=0;i<strArrayPhrase.length;i++) {
    		System.out.print(i + ": '" + strArrayPhrase[i] + "'");
    		if (!palindromeAlgorithm.isPalindrome(strArrayPhrase[i])) {
    			bTrueExpected = false;
    			System.out.print(" - False");
    		} else {
    			System.out.print(" - True");
    		}
    		System.out.println("");
    	}
    	assertTrue(bTrueExpected);
    }
    

}
