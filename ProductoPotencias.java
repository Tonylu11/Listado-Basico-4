import utiles.*;
/**
* Define la clase ProductoPotencias que calcule y visualice el producto de las potencias 
* de 2 entre 0 y 10.
* @author Antonio Luque Bravo
* @version 1.0
*/
public class ProductoPotencias{
	public static void main(String[] args) {
	int potencia = 1;
	int x;
	for(x=0; x<11; x++){
			if (x==0){
				potencia=1;
				System.out.println("Pontencia de 2 elevado a "+x+" es: "+ potencia);
			}
			else{
				potencia=2*potencia;
				System.out.println("Pontencia de 2 elevado a "+x+" es: "+ potencia);
			}
		}	
	}
}