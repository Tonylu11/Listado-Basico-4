import utiles.*;
/**
* Define la clase IvaConMetodos que calcule los impuestos que se aplican a un precio base en función de si el iva es superreducido (4%), reducido (10%) o general (21%). Para ello define y usa los siguientes métodos:
* a. pedirIVA()
* b. pedirPrecio()
* c. continuar()
* d. calcularIva(double, char)
* @author Antonio Luque Bravo
* @version 1.0
*/
public class IvaConMetodos{
	public static void main(String[] args){
		double precio;
		double iva=0;
		char tipoiva;
		do{
			precio = pedirPrecio();
			tipoiva = pedirIVA();
			iva = calcularIVA(precio, tipoiva);
			if (iva!=0)
				System.out.println("\nEl precio base introducido con IVA es: "+iva);
		}while(continuar());
	}
	/**
	* @return devuelve un double que es el n&uacute;mero introducido por teclado.
	*/
	static double pedirPrecio(){
		return Teclado.leerEntero("\nVamos a calcular el IVA sobre un precio base:\n");
	}
	/**
	* @return devuelve un char que que es la letra que es introducida por teclado para indicar el tipo de IVA.
	*/
	static char pedirIVA(){
		return Teclado.leerCaracter("\nIndica el tipo de iva: superreducido, reducido o general.(s/r/g)");
	}
	/**
	* @return devuelve un double que es el n&uacute;mero que muestra el precio con el IVA aplicado.
	* @param precio - es el n&uacute;mero que introducimos que va relacionado con el precio del producto.
	* @param tipoiva - el tipo de iva requerido por el teclado.
	*/
	static double calcularIVA(double precio, char tipoiva){
		do{
			if(tipoiva=='s' || tipoiva=='S'){
				System.out.println("El iva elegido es el reducido.");
			return precio*1.04;
			}else if(tipoiva=='r' || tipoiva=='R'){
				System.out.println("el iva elegido es el reducido.");
			return precio*1.10;
			}else if(tipoiva=='g' || tipoiva=='G'){
				System.out.println("el iva elegido es el general.");
			return precio*1.21;
			}else{
				System.out.println("Error, no has introducido un iva valido.");
				return precio;
			}
		}while (true);
	}
	/**
	* @return devuelve un boolean que indica que si la opci&oacute;n dada por teclado es afirmativa que devuelva true, en caso contrario que devuelva false.
	* @param respuesta - es el car&aacute;cter que indica true o false dependiendo si vale 's' o vale cualquier otro caracter.
	*/
	static boolean continuar(){
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
