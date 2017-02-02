public class SlinkedList {

	protected Nodo head;
	protected long size;
	
	public SlinkedList(){
		head=null;
		size=0;		
	}
	
	public boolean EstaVacio(){
		return (head==null && size==0);
	}
	
	
	public void InsertarAlumno(Alumno  n){
		Nodo s = new Nodo(n, null);
		if(EstaVacio()){
			head= s;
			size=1;
			System.out.println("Ingreso Exitoso");
		}
		else{
			if(Repetido(s.getAlumno().getCedula()))
				System.out.println("El Alumno Ya existe");
			else{
			Nodo aux;
			aux= head;
			while(aux.getEnlace()!=null){
				aux=aux.getEnlace();
			}
			aux.setEnlace(s);
			size=size+1;
				System.out.println("Ingreso Exitoso");
			}
		}
	}
	
	public boolean Repetido(int clave){
		Nodo aux=head;	
		if(clave == aux.getAlumno().getCedula())
			return true;			
		while(aux.getEnlace()!=null){
			if(clave == aux.getAlumno().getCedula())
				return true;
			aux=aux.getEnlace();
		}	
		return false;
	}
	

	
	public Nodo BuscarDato(int clave){
		Nodo aux=head;	
		if(clave == aux.getAlumno().getCedula())
			return aux;			
		while(aux.getEnlace()!=null){
			if(clave == aux.getEnlace().getAlumno().getCedula())
				return aux.getEnlace();
			aux=aux.getEnlace();
		}	
		return null;
	}
	

	@Override
	public String toString() {
		String lista="";
		Nodo aux=head;
		lista+=aux+"\n";
		while(aux.getEnlace()!=null){
			lista+=aux.getEnlace()+"\n";
			aux=aux.getEnlace();
		}
		
		lista+="Tamanio de Lista: "+size;
		return lista;
	}
	
}
