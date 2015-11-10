import utiles.*;
/**
* Define la clase MultiplicaSoloImpares que multiplique 20 números impares leídos desde teclado y muestre el resultado en pantalla.
* Define al menos los métodos mostrarInstrucciones y leerImpar.
* @author Antonio Luque Bravo
* @version 1.0
*/
public class MultiplicaSoloImpares{
	public static void main(String[] args) {
		System.out.println("Dame 20 numeros impares y te los multiplicare.");
		mostrarInstrucciones();
	}
	/**
	* @return devuelve un entero que son los n&uacute;meros introducidos por teclado.
	*/
	static int leerImpar(){
		return Teclado.leerEntero();
	}
	/**
	* @return no devuelve nada ya que es un contador y su funci&oacute;n es contar los impares que introducimos y multiplicarlos.
	*/
	static void mostrarInstrucciones(){
		float resultado=1;
		int numero;
		for(int i=0; i<20;i++){
			numero=leerImpar();
			if (numero%2!=0){
				resultado*=numero;
			}
		}
		System.out.println("El resultado de la multiplicacion es: " + resultado);
	}
}