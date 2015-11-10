import utiles.*;
/**
* Define la clase OrdenaTres que ordene tres números enteros introducidos por teclado 
* y los muestre por pantalla de forma decreciente. Se le preguntará al usuario si quiere repetir el programa.
* Utiliza métodos (deseaContinuar, leerTresEnteros, mostrarResultados...).
* @author Antonio Luque Bravo
* @version 1.0
*/
public class OrdenaTres{
	public static void main(String[] args) {
		int num1, num2, num3;
		System.out.println("Dame 3 numeros y te los ordenare decrecientemente.");
		do{
			num1 = leerTresEnteros("Introduce el primer numero..");
			num2 = leerTresEnteros("Introduce el segundo numero..");
			num3 = leerTresEnteros("Introduce el tercer numero..");
			mostrarResultados(num1, num2, num3);
		}while(deseaContinuar());
	}
	/**
	* @return devuelve un entero que son los n&uacute;meros introducidos por teclado.
	*/
	static int leerTresEnteros(String msj){
		return Teclado.leerEntero(msj);
	}
	/**
	* M&eacute;todo que muestra los n&uacute;meros ordenados decrecientemente.
	* @param num1 - primer numero que introducimos.
	* @param num2 - segundo numero que introducimos.
	* @param num3 - tercer numero que introducimos.
	*/
	static void mostrarResultados(int num1, int num2, int num3){
		if (num2<num1 && num3<num1){
			if (num3<num2)
				System.out.println(num1+">"+num2+">"+num3);
			else
				System.out.println(num1+">"+num3+">"+num2);
		}else if (num1<num2 && num3<num2){
			if (num3<num1)
				System.out.println(num2+">"+num1+">"+num3);
			else
				System.out.println(num2+">"+num3+">"+num1);
		}else if (num1<num3 && num2<num3){
			if (num2<num1)
				System.out.println(num3+">"+num1+">"+num2);
			else
				System.out.println(num3+">"+num2+">"+num1);
		}
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