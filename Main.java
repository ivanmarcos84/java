package palindromo;

import java.util.Scanner;

public class Main {
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		
		while(cadena.isEmpty()){
			System.out.println("Teclea tu palabra o frase y a continuación pulsa Enter:");
			cadena = sc.nextLine();
		}
		
		if (palindromo(cadena))
			System.out.print("Si es un palindromo.");
		else
			System.out.print("No es un palindromo.");
		sc.close();
	}
	
	
	/*
	 * Un palíndromo es una expresión que lees igual de izquierda a derecha 
	 * que de derecha a izquierda: Abccba, La ruta natural.
	 * Dada una cadena de caracteres:
	 * 1. eliminamos los espacios
	 * 2. calculamos la longitud de la cadena sin blancos
	 * 3. comprobamos si es palindromo
	 */
	static boolean palindromo(String s){
		
		boolean palindromo = true;
		int cb, i, l; //contador de blancos, indice, longitud
		String cadena, sinblancos;
		
		if (s.length()==1){
			palindromo = false;
		}else{
			cadena = s.toLowerCase();
			sinblancos = "";
			cb = 0;
			
			l= cadena.length();
			
			for(i= 0; i<l; i++){
				if (cadena.charAt(i)!=' ')
					sinblancos += cadena.charAt(i); 
				else
					cb++;
			}
			
			l= l - cb;
						
			for (i = 0; i<l/2; i++){
				System.out.println("Compara: "+sinblancos.charAt(i)+" "+sinblancos.charAt(l-1-i));
				if (sinblancos.charAt(i)!=sinblancos.charAt(l-1-i))
					palindromo = false;			
			}			
			
		}

		return palindromo;	
	}

}
