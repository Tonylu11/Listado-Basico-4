import utiles.*;
/**
* Define la clase Sumar que realice una suma y la muestre. 
* Para ello implementa el método sumar que devuelva la suma de dos números,
* solicitados por teclado(sin argumentos) . Documéntalo correctamente (@return)
* @author Antonio Luque Bravo
* @version 1.0
*/
public class Sumar{
	public static void main(String[] args) {
		int resultado = sumar();
		System.out.println("El resultado de la suma es: " + resultado);
	}
	/**
	* M&eacute;todo que pide al usuario inicializar dos variables y hace un c&aacute;lculo con las mismas.
	* @return Devuelve una suma de las dos variables que se inicializaron.
	*/
	static int sumar(){
		int sumando1= Teclado.leerEntero("Dame el primer sumando..");
		int sumando2= Teclado.leerEntero("Dame el segundo sumando..");
		return sumando1 + sumando2;
	}
}