package helloWorld;

public class Programa {

	static String mensaje = "Hola clase";
	public static void main(String[] args) {
		Mensaje m = new Mensaje();
		m.setEmisor("Pepe");
		
		for (int i = 0; i < 4; i++) {
			System.out.println(m);
		}
		System.out.println(mensaje);
	}
}
