
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
		
		System.out.println("\nEjercicio 2:");
		Producto tomate= new Producto("Tomate",4,false);
		Producto lechuga= new Producto("Lechuga",2,true);
		Producto sandia= new Producto("Sandia",1,false);
		Producto pepino= new Producto("Pepino",6,true);
		
		LinkedListMercado lista2 = new LinkedListMercado();
		lista2.InsertarItem(tomate);
		lista2.InsertarItem(lechuga);
		lista2.InsertarItem(sandia);
		lista2.InsertarItem(pepino);
		
		System.out.println("\nLista de compras:");
		System.out.println(lista2.toString());
		System.out.println("\nProductos Pendientes:");
		System.out.println(lista2.Pendientes());
		
		
		
	}

}
