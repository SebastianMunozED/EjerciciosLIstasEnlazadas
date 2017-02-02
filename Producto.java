
public class Producto {
	private String nombre;
	private int cantidad;
	private boolean pendiente;
	
	public Producto(String nomb, int cant, boolean pend){
		nombre = nomb;
		cantidad= cant;
		pendiente= pend;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean isPendiente() {
		return pendiente;
	}
	public void setPendiente(boolean pendiente) {
		this.pendiente = pendiente;
	}
	
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
