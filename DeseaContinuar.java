import utiles.*;
/**
* Define la clase DeseaContinuar que realice la siguiente pregunta: Desea continuar? (s/n).
* En caso de que el usuario indique una s (minúscula o mayúscula) el programa 
* seguirá preguntando. En otro caso, que se salga del programa.
* Para ello implementa el método continuar que devuelva true en caso de introducir una s, y false en caso contrario.
* Documéntalo correctamente (@return)
* @author Antonio Luque Bravo
* @version 1.0
*/
public class DeseaContinuar{
	public static void main(String[] args) {
		while(deseaContinuar()){}
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