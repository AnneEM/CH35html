package generation.collections;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCollections {
	public static void main(String[] args) {
		//*****ARRAYYS*****//
		String[] names = {"Jonathan","Eveida","Eunice","Rey","David","Lucero"};
		//Imprimiento Arrays
		System.out.println(Arrays.toString(names));
		
		
		int[] edades = {22, 23, 34, 21, 34, 45, 58};
		System.out.println(Arrays.toString(edades));
		
		//Acceder a cada elemento del Array
		String name1 = names[0];
		System.out.println("El primer nombre de la lista es " + name1);
		int edad1 = edades[1];
		System.out.println("la edad de " + name1 + " es de " + edad1 + " años");
		
		String name2 = names[3];
		System.out.println("El cuarto nombre de la lists es " + name2);
		
		//Obtener longitudes
		int longitudNames = names.length;
		System.out.println("El array names tiene " + longitudNames + " elementos");
		
		//Obtener el ultimo elementos
		String ultimoElemento = names[longitudNames-1];
		System.out.println("El ultimo elemento es " + ultimoElemento);
		
		//Mostrar cada uno de los elementos. La variable "name" puede llevar cualquier nombre. 
		for (String name : names) {
			System.out.println(name);
		}
		
		//*****ARRAYLIST*******//
		//ArrayList es un array que puede cambiar de tamaño. Es la clase de java que representa la estructura de datos de Arrays. Permite elementos duplicados y recibe varios metodos para su manipulacion.
		ArrayList<String> films = new ArrayList<String>();
		ArrayList<Integer> matricula = new ArrayList<>(); //No es buena práctica 
		
		//Agregar elementos
		films.add("Inception");
		films.add("Midsommar");
		films.add("The shining");
		films.add("Hereditary");
		films.add("Nope");
		films.add("Shin-Gojira");
		films.add("Saltburn");
		System.out.println(films);
		
		
		//Obtener un elemento name.get(index);
		String film1 = films.get(0);
		System.out.println("la primer película es " + film1);
		
		//Modifocar un elemento: name.set(index, newValue)
		String film2 = films.set(3, "Void"); //Funciona sobre el arraylist
		String film2Get = films.get(3);
		System.out.println(film2Get);
		
		//Conocer el tamaño del ArrayList: none.size();
		int sizeFilms = films.size();
		System.out.println("El tamaño del Array de pelicular es de " + sizeFilms + " elementos");
		
		//Agregar un elemento para despues eliminarlo
		films.add("The fountain");
		System.out.println(film2);
		
		films.remove(7);
		System.out.println(films);
		
		System.out.println("FILMS EN LISTA");
		for(String film : films) {
			System.out.println(film);
		}
		
		
		matricula.add(22222);
		System.out.println(matricula);
		
		
		
		
	}
}
