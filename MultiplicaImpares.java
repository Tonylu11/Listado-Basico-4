import utiles.*;
/**
* Define la clase MultiplicaImpares que multiplique los 20 primeros números impares y muestre el resultado en pantalla.
* @author Antonio Luque Bravo
* @version 1.0
*/
public class MultiplicaImpares{
	public static void main(String[] args) {
		int resultado = 1;
		for(int i=1; i<40; i+=2){
			resultado*=i;
		}
		System.out.println("El resultado de multiplicar los 20 primeros numeros impares es " + resultado);
	}
}