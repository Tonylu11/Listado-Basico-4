import utiles.*;
/**
* Define la clase Tiempo que dada una medida de tiempo expresada en horas, minutos y segundos 
* con valores arbitrarios, elabore un programa que transforme dicha medida en una expresión 
* correcta. 
* Por ejemplo, dada la medida 3h 118m 195s, se deberá obtener como resultado 5h 1m 15s
* @author Antonio Luque Bravo
* @version 1.0
*/
public class Tiempo{
	public static void main(String[] args){
		int horas,minutos,segundos;
		horas=(int)(Math.random()*(0-10)+10);
		minutos=(int)(Math.random()*(0-100)+100);
		segundos=(int)(Math.random()*(0-100)+100);
		System.out.println("La hora incorrecta es "+horas+"h "+minutos+"m "+segundos+"s ");
		mostrarResultado(horas,minutos,segundos);
	}
	/**
	* @param horas - es las horas que se muestran en la conversion del tiempo.
	* @param minutos - es los minutos que se muestran en la conversion del tiempo.
	* @param segundos - es los segundos que se muestran en la conversion del tiempo.
	*/
	static void mostrarResultado(int horas, int minutos, int segundos){
		int numseg, nummin, numhoras, dias=0;
		if(segundos>60){
			numseg=(segundos/60);
			segundos=segundos%60;
			minutos+=numseg;
		}
		if(minutos>60){
			nummin=(minutos/60);
			minutos=minutos%60;
			horas+=nummin;
		}
		System.out.println("La hora correcta es "+horas+"h "+minutos+"m "+segundos+"s ");
	}
}