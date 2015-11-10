import utiles.*;
/**
* Define la clase Multiplica que realice de forma repetitiva multiplicaciones y las
* muestre, siempre y cuando el usuario responda afirmativamente a la pregunta: 
* ¿Desea continuar? (s/n). Para ello utiliza un método continuar (ejercicio anterior) e
* implementa también el método multiplicar con los dos argumentos que sean los 
* factores. Ha de devolver su producto. Documéntalo correctamente (@param y @return).
* @author Antonio Luque Bravo
* @version 1.0
*/
public class Multiplica{
	public static void main(String[] args) {
		long num1, num2;
		do{
			num1=Teclado.leerEntero("Introduce el primer numero: ");
			num2=Teclado.leerEntero("Introduce el segundo numero: ");
			System.out.println("El resultado de la multiplicacion es: "+ multiplicar(num1,num2));
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
	* @param num1 - el primer numero que multiplicar&aacute; con el otro numero introducido.
	* @param num2 - el segundo numero que multiplica.
	* @return devuelve un long.
	*/
	static long multiplicar(long num1, long num2){
		return (long)num1*num2;
	}
}