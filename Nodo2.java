
public class Nodo2 {

		private Producto item;
		private Nodo2 enlace;
		
		public Nodo2(Producto u ,Nodo2 n){
			item= u;
			enlace=n;
		}

		public Producto getItem() {
			return item;
		}

		public void setItem(Producto item) {
			this.item = item;
		}

		public Nodo2 getEnlace2() {
			return enlace;
		}

		public void setEnlace2(Nodo2 enlace) {
			this.enlace = enlace;
		}

		@Override
		public String toString() {
			return "Nodo [item=" + item + "]";
		}

		


	

	
}
