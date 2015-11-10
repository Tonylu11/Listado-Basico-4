import utiles.*;
/**
* Define la clase MediaPositivos que calcule la media de una serie de números positivos, introducidos por teclado. Dejará de leer cuando el usuario introduzca el 0. Utiliza métodos.
* @author Antonio Luque Bravo
* @version 1.0
*/
public class MediaPositivos{
	public static void main(String[] args){
		double entero;
		double resultado=0;
		int i=0;
		System.out.println("Introduce numeros positivos, cuando introduzcas un 0 te dire la media.");
		while (true){
			entero=getNumero();
			if (entero!=0){
				i++;
				resultado=resultado+entero;
			}
			else
				break;
		}
		System.out.println("Has introducido " + i + " valores y su media es: " + (resultado/i));
	}
	/**
	* @return devuelve un double que es el numero que introducimos nosotros por consola.
	*/
	static double getNumero(){
		double entero;
		while (true){
		entero=Teclado.leerEntero("Introduce un numero positivo (inserta 0 para salir del programa): ");
		if (entero<0)
			System.out.println("ERROR, has introducido un numero negativo.");
		else
			return entero;
		}
	}
}