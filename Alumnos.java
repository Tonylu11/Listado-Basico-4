import utiles.*;
/**
* Define la clase Alumnos que obtenga aleatoriamente las notas de 30 alumnos. La nota será un número decimal comprendido entre 0 y 10, ambos inclusive. Utiliza métodos. Al finalizar el programa deberá mostrar:
* a. Total de notas
* b. Número de aprobados
* c. Número de suspensos
* d. Nota máxima
* e. Nota mínima
* f. Media
* @author Antonio Luque Bravo
* @version 1.0
*/
public class Alumnos{
	public static void main(String[] args){
		int i, aprobados=0, suspensos=0, contadorTotalNotas=0;
		double totalnotas=0, notamax=-1, notamin=11, media=0, nota;
		System.out.println("\nNotas de los alumnos:\n");
		for(i=1;i<31;i++){
			nota=(Math.random()*10);
			System.out.print(nota+"\n");
			totalnotas+=nota;
			contadorTotalNotas++;
			if(aprobadosSuspensos(nota))
				aprobados++;
			else
				suspensos++;
			notamax=notaMax(nota,notamax);
			notamin=notaMin(nota,notamin);
		}
		System.out.println("a. Total de notas: " + contadorTotalNotas);
		System.out.println("b. Total de aprobados: "+aprobados);
		System.out.println("c. Total de suspensos: "+suspensos);
		System.out.println("d. Nota maxima: "+notamax);
		System.out.println("e. Nota minima: "+notamin);
		System.out.println("f. Media: " + (totalnotas/30));
	}
	/**
	* @return devuelve un boolean que cambia si esta por debajo o por encima de 5.00
	* @param nota - es el numero de la nota que se genera aleatoriamente.
	*/
	static boolean aprobadosSuspensos(double nota){
		if(nota>=5.00)
			return true;
		else
			return false;	
	}
	/**
	* @return devuelve un double que es la nota maxima de todas la notas.
	* @param nota - es el numero de la nota que se genera aleatoriamente.
	* @param notamax - es el numero de la nota mayor de las generadas.
	*/
	static double notaMax(double nota, double notamax){
 		if(nota>notamax)
 			notamax = nota;
		return notamax;
	}
	/**
	* @return devuelve un double que es la nota minima de todas las notas.
	* @param nota - es el numero de la nota que se genera aleatoriamente.
	* @param notamin - es el numero de la nota mas peque&ntilde;o generado aleatoriamente.
	*/
	static double notaMin(double nota, double notamin){
		if(nota<notamin)
			notamin = nota;
		return notamin;
	}
	/**
	* @return devuelve un double que es la media total de todas las notas.
	* @param nota - es el numero de la nota que se genera aleatoriamente.
	* @param media - es la media de todas las notas generadas.
	*/
	static double totalMedia(double nota, double media){
		do{
			media+=nota/2;
			return media;
		}while(true);
	}
}