import java.util.Scanner;
import java.util.Random;
public class AmigoInvisible{
    public static void main(String[] args) {

    	int cantidad;

    	String[] Aleatorio = new String[cantidad];
    	String[] nombres = {"Gabri -->", "Antonio-->", "Ana-->", "Maria Jesus-->", "Oscar-->"}; 
    	String[] regalo = {"Gabri", "Antonio", "Ana", "Maria Jesus", "Oscar"};
    	
		for (int i = 0; i < cantidad; i++) {
			Aleatorio[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
					+ regalo[(int) (Math.floor(Math.random() * ((regalo.length - 1) - 0 + 1) + 0))];
		}
		return Aleatorio;
	}

	public static void imprimir(String[] nombresGenerados) {
		for (int i = 0; i < nombresGenerados.length; i++) {
			System.out.println(nombresGenerados[i]);
		}
	}
}


