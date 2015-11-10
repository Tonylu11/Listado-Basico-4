import utiles.*;
/**
* Define la clase EcuacionSegundoGrado que muestre las soluciones de una ecuación de segundo grado ax2 + bx + c = 0.
* Se le preguntará al usuario si quiere repetir el programa. Utiliza métodos (deseaContinuar, leerCoeficientes, mostrarResultados…)
* @author Antonio Luque Bravo
* @version 1.0
*/
public class EcuacionSegundoGrado{
	public static void main(String[] args){
		double a, b, c;
		double solucion1, solucion2;
		System.out.println("Vamos a realizar una ecuacion de segundo grado, para ello necesito que me des los tres numeros de la ecuacion. (ax2 + bx + c = 0)");
		do{
			a = leerCoeficientes("introduce el primer numero: ");
			b = leerCoeficientes("introduce el segundo numero: ");
			c = leerCoeficientes("introduce el tercer numero: ");
			solucion1 = mostrarResultado1(a,b,c);
			solucion2 = mostrarResultado2(a,b,c);
			System.out.println("Las soluciones de la ecuacion de segundo grado son: "+ solucion1 +" y "+ solucion2);
		}while(deseaContinuar());
	}
	/**
	* Resuelve una soluci&oacute;n de las dos posibles.
	* @param a Primer numero.
	* @param b Segundo numero.
	* @param c Tercer numero.
	* @return Devuelve la resoluci&oacute;n de la ecuaci&oacute;n.
	*/
	static double mostrarResultado1(double a, double b, double c){
		return (-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
	}
	/**
	* Resuelve una soluci&oacute;n de las dos posibles.
	* @param a Primer numero.
	* @param b Segundo numero.
	* @param c Tercer numero.
	* @return Devuelve la resoluci&oacute;n de la ecuaci&oacute;n.
	*/
	static double mostrarResultado2(double a, double b, double c){
		return (-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
	}
	/**
	* Recibe un dato introducido por teclado.
	* @param msj Mensaje personalizado.
	* @return Devuelve un n&uacute;mero de tipo entero
	*/
	static int leerCoeficientes(String msj){
		return Teclado.leerEntero(msj);
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