 package practicoo;
import java.util.ArrayList;
import java.util.Scanner;;
public class Biblioteca {
	
	static ArrayList<String> libros = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
public static void agregarlibros() {
	
	System.out.println("¿CUANTOS LIBROS DESEA AGREGAR? (en numeros)");
	int numlibros = sc.nextInt();
    sc.nextLine();
    
	for (int i = 0; i < numlibros; i++) {
		System.out.println("¿QUE LIBRO DESEA AGREGAR?");
		String libro = sc.nextLine().toUpperCase();
		libros.add(libro);
		System.out.println("LIBRO AGREGADO!");
	}
		
	
	}
public static void modificar () {
	
	for (int z = 0; z < libros.size(); z++) {
		System.out.println(z + "-" + libros.get(z));
	}
	
	System.out.println("¿QUE LIBRO DESEA MODIFICAR? (numero del libro)");
	int modif = sc.nextInt();
	sc.nextLine();
	
	
	System.out.println("¿QUE NOMBRE DESEA COLOCARLE A SU LIBRO?");
	String modificar = sc.nextLine().toUpperCase();
	
	libros.set(modif, modificar);
	System.out.println("¡LIBRO MODIFICADO!");
	
}

public static void eliminar () {
	
	System.out.println("¿CUANTOS LIBROS DESEA ELIMINAR? (CANTIDAD TOTAL DE LIBROS: " + libros.size() + ")");
	int usu = sc.nextInt();
	
	for (int z = 0; z < libros.size(); z++) {
		System.out.println(z + "-" + libros.get(z));
	}
	
	  for (int i = 0; i < usu; i++) {
	        System.out.println("¿QUE LIBRO DESEA ELIMINAR? (numero del libro)");
	        int numlibro = sc.nextInt();

	       
	        if (numlibro >= 0 && numlibro < libros.size()) {
	            libros.remove(numlibro);
	            System.out.println("Libro eliminado");
	        } else {
	            System.out.println("Indice invalido. Intente nuevamente");
	        }
	    }
	System.out.println("LIBROS ELIMINADOS!");
}

public static void listalibros() {

	System.out.println("LA LISTA DE LIBROS AGREGADOS ES:");
	for (int i = 0; i < libros.size(); i++) {
		System.out.println(i + "-" + libros.get(i));
		
	}

}
	public static void buscarlibro() {
		System.out.println("¿QUE LIBRO DESEA BUSCAR?");
		String buscar = sc.nextLine().toUpperCase();
		
		if (libros.contains(buscar)) {
			System.out.println("¡LIBRO ENCONTRADO!");
		}
		else {
			System.out.println("TU LIBRO NO FUE ENCONTRADO!");
		}
			
		
	}


	public Biblioteca() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a la biblioteca digital");
		int opcion;

	
do {
		
	    System.out.println("--------------------------");
		System.out.println("|  1- AGREGAR LIBRO         |");
		System.out.println("--------------------------");
		System.out.println("|  2- MODIFICAR LIBRO       |");
		System.out.println("--------------------------");
		System.out.println("|  3- ELIMINAR LIBRO        |");
		System.out.println("--------------------------");
		System.out.println("|  4- LISTA STOCK DE LIBROS |");
		System.out.println("--------------------------");
		System.out.println("|  5- BUSCAR LIBRO          |");
		System.out.println("--------------------------");
		System.out.println("|  6- SALIR                 |");
		System.out.println("--------------------------");
		
		System.out.println("ESCOJA UNA OPCION:");
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			Biblioteca.agregarlibros();
			break;
			
		case 2:
			Biblioteca.modificar();
			break;
			
		case 3:
			Biblioteca.eliminar();
			break;
		
		case 4:
			Biblioteca.listalibros();
			break;
		case 5:
			Biblioteca.buscarlibro();
			break;
		}

	}while (opcion != 6);
     System.out.println("SALIENDO...");
            sc.close();
	}
}
