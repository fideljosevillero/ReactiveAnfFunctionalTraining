import java.util.stream.Stream;

import com.fideljose.model.Pelicula;

public class Principal {

	public static void main(String[] args) {
		Stream<Pelicula> listPeliculas = Miscelanea.getPeliculas();
		System.out.println("- Promedio de la Calificaci�n \n" + Miscelanea.getPromedioClasificacion(listPeliculas));
		Stream<Pelicula> listPeliculas2 = Miscelanea.getPeliculas();
		System.out.println("- Lamejor calificaci�n es \n" + Miscelanea.getMejorClasificacion(listPeliculas2));
	}
	
}
