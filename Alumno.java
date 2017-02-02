
public class Alumno {
	private String Nombre;
	private int cedula;
	
	public Alumno(String n, int c){
		Nombre=n;
		cedula=c;
		
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	@Override
	public String toString() {
		return "Alumno [Nombre=" + Nombre + ", cedula=" + cedula + "]";
	}
	
	
	

}
