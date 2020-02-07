import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fideljose.model.Pelicula;

public class Miscelanea {

	public enum Genero {
		Drama, Suspenso, Comedia
	};
	
	public static Stream<Pelicula> getPeliculas() {
		Pelicula pelicula1 = new Pelicula("The irishman", Genero.Drama.toString(), 8.1, "3:29:00");
		Pelicula pelicula2 = new Pelicula("Parasito", Genero.Suspenso.toString(), 8.6, "2:12:00");
		Pelicula pelicula3 = new Pelicula("Parasito", Genero.Comedia.toString(), 8.6, "2:12:00");
		Stream<Pelicula> peliculas = Stream.of(pelicula1, pelicula2, pelicula3);
		return peliculas;
	}
	
	public static Double getPromedioClasificacion(Stream<Pelicula> peliculas){
		Double promedio = peliculas
			     			.collect(Collectors.averagingDouble(e -> e.getCalificacion()));
		return promedio;
	}
	
	public static Double getMejorClasificacion(Stream<Pelicula> peliculas){
		Double promedio = peliculas
			     			.mapToDouble(e -> e.getCalificacion()).max()
			     			.orElseThrow(NoSuchElementException::new);
		return promedio;
	}
	
}
