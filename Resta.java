import utiles.*;
/**
* Define la clase Resta que realice de forma repetitiva restas y las muestre, siempre y cuando el usuario responda afirmativamente a la pregunta: ¿Desea continuar? (s/n).
* Para ello utiliza un método continuar (ejercicio anterior) e implementa también el método restar con los dos argumentos que sean los operandos.
* Ha de devolver su diferencia. Documéntalo correctamente (@param y @return)
* @author Antonio Luque Bravo
* @version 1.0
*/
public class Resta{
	public static void main(String[] args) {
		int num1, num2;
		do{
			num1=Teclado.leerEntero("Introduce el primer numero: ");
			num2=Teclado.leerEntero("Introduce el segundo numero: ");
			System.out.println("El resultado de la resta es: "+ restar(num1,num2));
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
	* @param num1 Primer numero introducido
	* @param num2 Segundo numero introducido
    * @return Resultado de la resta en un entero
	*/
	static int restar(int num1, int num2){
		return num1 - num2;
	}

}