public class Nodo {
	private Alumno alumno;
	private Nodo enlace;
	
	public Nodo(Alumno a,Nodo n){
		alumno= a;
		enlace=n;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}

	@Override
	public String toString() {
		return "Nodo [alumno=" + alumno + "]";
	}


}
