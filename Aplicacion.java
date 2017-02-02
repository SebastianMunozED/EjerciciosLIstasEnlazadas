
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno carlos = new Alumno("Carlos",172200032);
		Alumno juanca = new Alumno("Juanca",1722032434);
		Alumno maria = new Alumno("Maria",1722023423);
		Alumno lopez = new Alumno("Lopez",172200032);
		
		
		
		SlinkedList lista1 = new SlinkedList();
		lista1.InsertarAlumno(carlos);
		lista1.InsertarAlumno(juanca);
		lista1.InsertarAlumno(maria);
		lista1.InsertarAlumno(lopez);
				
		System.out.println("\nLista:");
		System.out.println(lista1.toString());
		System.out.println("\nBúsqueda:");
		System.out.println(lista1.BuscarDato(1722023423));
		
		
	}

}
