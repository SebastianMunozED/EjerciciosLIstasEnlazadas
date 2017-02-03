
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
	
	public void Compra(String prod, int cant){
		Nodo2 aux=head;
		int a,b;			
		while(aux!=null){
			if(aux.getItem().getNombre().equalsIgnoreCase(prod)){
				a=aux.getItem().getCantidad();
				b=a-cant;
				if(b<0)
					System.out.println("Esta comprando de mas de: "+prod);
				else{
				aux.getItem().setCantidad(b);
				if(aux.getItem().getCantidad()==0){
					aux.getItem().setPendiente(false);}
				}
			}
			aux=aux.getEnlace2();
		}	
	}
	

	
	public String Pendientes(){
		String lista="";
		Nodo2 aux=head;
		while(aux!=null){
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
		while(aux!=null){
			lista+=aux+"\n";
			aux=aux.getEnlace2();
		}
		lista+="Tamanio de Lista: "+size;
		return lista;
	}
	
}







