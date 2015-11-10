import utiles.*;
/**
* Define la clase Aleatorios que de forma repetitiva muestre un número aleatorio entre 
* un mínimo y un máximo. Define el método generarAleatorio(min, max).
* @author Antonio Luque Bravo
* @version 1.0
*/
public class Aleatorios{
	public static void main(String[] args) {
		do{
			double min = Teclado.leerEntero("Dame un minimo.");
			double max = Teclado.leerEntero("Dame un maximo.");
			if(min>max){
				System.out.println("No puede ser el minimo mayor que el maximo..");
			}else{
				System.out.println("El numero generado es: " + generarAleatorio(min,max));
			}
		}while(deseaContinuar());
	}
	/**
	* M&eacute;todo para generar un n&uacute;mero aleatorio entre un m&iacute;nimo y un m&aacute;ximo.
	* @param min M&iacute;nimo.
	* @param max M&aacute;ximo.
	* @return Devuelve el n&uacute;mero aleatorio generado.
	*/
	static double generarAleatorio(double min, double max){
		return Math.random()*(min - max) + max;
	}
	/**
	* @return devuelve un boolean, dependiendo de si se cumple la condici&oacute;n o no devolver&aacute; true o, en su defecto, false.
	*/
	static boolean deseaContinuar(){
		char caracter;
		caracter = Teclado.leerCaracter("¿Desea continuar?(s/n)");
		if((caracter=='s') || (caracter=='S')){
			return true;
		}else{
			return false;
		}
	}
}