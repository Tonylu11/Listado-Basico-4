import utiles.*;
/**
* Define la clase Pares que de forma repetitiva indique si un número es par o impar. Define el método esPar(int)
* @author Antonio Luque Bravo
* @version 1.0
*/
public class Pares{
	public static void main(String[] args) {
		int num1;
		do{
			num1=Teclado.leerEntero("Introduce un numero y te dire si es par o impar:"); 
 			if(esPar(num1))
				System.out.println("El numero "+num1+" es par");
			else
				System.out.println("El numero "+num1+" es impar");
		}while(deseaContinuar());
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
	/**
	* @return devuelve un boolean que indica que si es par devuelva true, y si es impar que devuelva false.
	* @param num1 - es el numero que introducimos para averiguar si es par o impar.
	*/
	static boolean esPar(int num1){
		if (num1%2==0)
			return true;
		else
			return false;

	}

}