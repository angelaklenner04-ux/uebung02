package h2;

public class H2_main {
	public static void main(String[] args) {

		int i = 8; // Beispielwerte
		int j = 3; // Beispielwerte
		int k = 10; // Beispielwerte

		int min = i; // Man geht davon aus, dass i das Minimum ist (egal welche Variable)
		int max = i; // und i auch das Maximum

		// Minimum finden
		if (j < min) { // Wenn j kleiner als min (i) ist:
			min = j; // Dann ist j das neue Minimum
		}
		if (k < min) { // Wenn k kleiner als min ist:
			min = k; // Dann k neues min
		}

		// Maximum finden
		if (j > max) { // Wenn j größer als max:
			max = j; // Dann ist j neues Maximum
		}
		if (k > max) { // Wenn k größer als max:
			max = k; // Dann ist k neues Maximum
		}

		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}
}