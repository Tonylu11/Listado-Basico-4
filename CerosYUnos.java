import utiles.*;
/**
* Define la clase CerosYUnos que lea una secuencia de ceros y unos. Mostrará el número 
* de ceros de la secuencia. Dejará de leer cuando el usuario introduzca el número 2
* @author Antonio Luque Bravo
* @version 1.0
*/
public class CerosYUnos{
	public static void main(String[] args) {
		int numero = 0, contador = 0;
		System.out.println("Dame una secuencia de 0 y 1, me saldre si introduces un 2..");
		do{
			numero=Teclado.leerEntero();
			if(numero==0){
				contador++;
				System.out.println("Llevas " + contador + " ceros en la secuencia");
			}else if(numero!=0 && numero!=1 && numero!=2){
				System.out.println("ERROR. Introduce un 0, 1 o un 2 para salir..");
			}
		}while(numero!=2);
	}
}