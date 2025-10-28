package p2;

public class P2_main {
	public static void main(String[] args) {
		int i = 20; // Beispielwert --> i ist kleiner als 10
		boolean b = false; // Wahrheitswert (true oder false)

		if (i > 10) { // Wenn i größer als 10 ist, dann ändere b auf true. Wenn nicht, bleibt b false
			b = true;
		}

		System.out.println("i = " + i);
		System.out.println("b = " + b);
	}
}