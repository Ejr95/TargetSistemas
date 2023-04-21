import java.util.Scanner;

/**
 * 
 */

/**
 * @author elizeu
 *
 */
public class InverteString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra = scan.next();
		String palavraInvertida = "";
		for(int i =palavra.length() - 1 ; i >= 0; i--) {
			char caracter = palavra.charAt(i);
			palavraInvertida +=caracter;			
		}
		System.out.println("Palavra Invertida : "+ palavraInvertida);
	}

}
