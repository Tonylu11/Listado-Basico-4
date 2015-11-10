import utiles.*;
/**
* Define la clase Potencia que calcule y visualice la potencia de un número dada la base 
* y  el  exponente.  Se le  preguntará  al  usuario  si  quiere  repetir  el  programa.
* Utiliza métodos (deseaContinuar, mostrarInstrucciones...)
* @author Antonio Luque Bravo
* @version 1.0
*/
public class Potencia{
	public static void main(String[] args) {
		int base = Teclado.leerEntero("Introduce la base de la potencia..");
		int exponente = Teclado.leerEntero("Introduce el exponente de la potencia..");
		do{
			if (exponente==0){
				base=1;
				System.out.println("Pontencia de base " + base + " elevada a " + exponente + " es: " + mostrarInstrucciones(base, exponente));
			}else{
				System.out.println("Pontencia de base " + base + " elevada a " + exponente + " es: " + mostrarInstrucciones(base, exponente));
			}
		}while(deseaContinuar());
	}
	/**
	* @return devuelve un long que es la soluci&oacute;n de elevar la base al exponente que introducimos.
	* @param base - es el n&uacute;mero que representa a la base de la potencia.
	* @param exp - representa al n&uacute;mero al que se eleva la base de la potencia.
	*/
	static long mostrarInstrucciones(int base, int exponente){
		long resultado=1;
		for (int i=0;i<exponente;i++)
			resultado*=base;
		return resultado;
	}
	/**
	* @return devuelve un boolean, dependiendo de si se cumple la condici&oacute;n o no devolver&aacute; true o, en su defecto, false.
	*/
	static boolean deseaContinuar(){
		char caracter;
		System.out.println("¿Desea continuar? (s/n)");
		caracter = Teclado.leerCaracter();
		if((caracter=='s') || (caracter=='S')){
			return true;
		}else{
			return false;
		}
	}
}