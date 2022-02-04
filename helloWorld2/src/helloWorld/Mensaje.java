package helloWorld;

import java.util.Date;
//shift+alt+r -> Refactorizar
//alt + s -> source
	// dentro, una letra de las subrayadas para abrir lo que necesites
// alt + shift + z --> rodear trozo de código

// CTRL + SHIFT + T --> ir a clase

// CTRL + SHIFT + O --> quitar 
public class Mensaje {
	//Atributos
		private String emisor;
		private String cuerpo;
		private Date fechaHoraCreacion;
		private Date fechaHoraModificacion;
		private String destinatario;
		
		//Constructor
		//1 
		public Mensaje() {
			this.emisor= "Emisto desconocido";
			this.cuerpo = "Texto desconocido";
			this.fechaHoraCreacion = new Date();
			this.fechaHoraModificacion= new Date();
		}
		//2
		public Mensaje(String emisor, String texto,Date fechaHora ) {
			super();
			this.emisor = emisor;
			this.cuerpo = texto;
			this.fechaHoraCreacion = new Date();
			this.fechaHoraModificacion= new Date();
		}
		
		
		//Getters and Setters
		//---------------Emisor-----------------//
		public String getEmisor() {
			return emisor;
		}
		public void setEmisor(String emisor) {
			this.emisor = emisor;
			actualizarFechaHoraModificacion();
		}
		//---------------Cuerpo------------------//
		public String getCuerpo() {
			return cuerpo;
		}
		public void setCuerpo(String texto) {
			this.cuerpo = texto;
			actualizarFechaHoraModificacion();
		}
		//---------------Destinatario------------------//
		public String getDestinatario() {
			return destinatario;
		}
		public void setDestinatario(String destinatario) {
			this.destinatario = destinatario;
		}
		
		//Metodo
		private void actualizarFechaHoraModificacion() {
			this.fechaHoraModificacion = new Date();
			System.out.println("Hora actualizada");
		}
		
		//DEvuelve
		@Override
		public String toString() {
			return "("+fechaHoraModificacion+") Mensaje de " + emisor + " :" + cuerpo +"\n\t";
		}
		
		
}
