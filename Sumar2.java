import utiles.*;
/**
* Define la clase Sumar2 que realice una sumay la muestre. 
* Para ello implementa el método sumar con los dos argumentos que sean los sumandos.
* Ha de devolver su suma. Documéntalo correctamente (@param y @return).
* @author Antonio Luque Bravo
* @version 1.0
*/
public class Sumar2{
	public static void main(String[] args) {
		int sumando1= Teclado.leerEntero("Dame el primer sumando..");
		int sumando2= Teclado.leerEntero("Dame el segundo sumando..");
		System.out.println("El resultado de la suma es: " + sumar(sumando1, sumando2));
	}
	/**
	* M&eacute;todo que hace un c&aacute;lculo con dos variables.
	* @param sum1 Variable de tipo entero para el c&aacute;lculo de la operaci&oacute;n.
	* @param sum2 Variable de tipo entero para el c&aacute;lculo de la operaci&oacute;n.
	* @return Devuelve una suma de las dos variables que se le pasaron por par&aacute;metro.
	*/
	static int sumar(int sum1, int sum2){
		return sum1 + sum2;
	}
}