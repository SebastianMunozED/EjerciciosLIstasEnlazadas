
public class LinkedListMercado {
	
	private Nodo2 head;
	private int size;
	
	public LinkedListMercado(){
		head=null;
		size=0;		
	}
	
	public boolean EstaVacio(){
		return (head==null && size==0);
	}
	
	
	public void InsertarItem(Producto  n){
		Nodo2 s = new Nodo2(n, null);
		if(EstaVacio()){
			head= s;
			size=1;
		}
		else{
			Nodo2 aux;
			aux= head;
			while(aux.getEnlace2()!=null){
				aux=aux.getEnlace2();
			}
			aux.setEnlace2(s);
			size=size+1;
		}
	}
	

	
	public String Pendientes(){
		String lista="";
		Nodo2 aux=head;
		if(aux.getItem().isPendiente())
			lista+=aux+"\n";
		while(aux.getEnlace2()!=null){
			if(aux.getItem().isPendiente())
				lista+=aux.getItem()+"\n";
			aux=aux.getEnlace2();
		}
		return lista;
	}
	

	@Override
	public String toString() {
		String lista="";
		Nodo2 aux=head;
		lista+=aux+"\n";
		while(aux.getEnlace2()!=null){
			lista+=aux.getEnlace2()+"\n";
			aux=aux.getEnlace2();
		}
		
		lista+="Tamanio de Lista: "+size;
		return lista;
	}
	
}



