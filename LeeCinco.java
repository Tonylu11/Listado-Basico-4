import utiles.*;
/**
* Define  la  clase  LeeCinco  que  lea  cinco  valores  numéricos  y  calcule  su  producto.
* Se  le preguntará  al  usuario  si  quiere  repetir el  programa.
* Utiliza  métodos  (deseaContinuar, leerCincoNumeros,System.out.println(El producto es:  + calcularResultado()...)
* @author Antonio Luque Bravo
* @version 1.0
*/
public class LeeCinco{
	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		do{
			num1 = leerCincoNumeros("Primer numero..");
			num2 = leerCincoNumeros("Segundo numero..");
			num3 = leerCincoNumeros("Tercer numero..");
			num4 = leerCincoNumeros("Cuarto numero..");
			num5 = leerCincoNumeros("Quinto numero..");
			System.out.println("El producto es: " + calcularResultado(num1, num2, num3, num4, num5));
		}while(deseaContinuar());
	}
	/**
	* @return devuelve un entero que son los n&uacute;meros introducidos por teclado.
	*/
	static int leerCincoNumeros(String msj){
		return Teclado.leerEntero(msj);
	}
	/**
	* @param num1 - Primer n&uacute;mero introducido.
	* @param num2 - Segundo n&uacute;mero introducido.
	* @param num3 - Tercer n&uacute;mero introducido.
	* @param num4 - Cuarto n&uacute;mero introducido.
	* @param num5 - Quinto n&uacute;mero introducido.
	* @return Devuelve el producto de todos esos n&uacute;meros.
	*/
	static long calcularResultado(int num1, int num2, int num3, int num4, int num5){
		return num1*num2*num3*num4*num5;
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