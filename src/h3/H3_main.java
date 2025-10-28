package h3;

public class H3_main {
	public static void main(String[] args) {

		// Deklaration der Variablen
		int i = 210; // Beispielwert für i
		int j = 8; // Beispielwert für j
		int k = -10; // Startwert k laut Aufgabe

		// Ausdruck 1: i > j
		// Ausdruck 2: i > 200
		// Ausdruck 3: j > 100

		// Überprüfung der Bedingungen
		if (i > j) { // Ausdruck 1 wahr
			if (i > 200) { // Ausdruck 2 wahr
				if (j > 100) { // Ausdruck 3 wahr
					k = 3; // (1, 2 und 3) wahr
				} else { // (1 und 2 wahr, 3 falsch)
					k = 2;
				}
			} else { // (1 wahr, 2 falsch) -->innerhalb Zweig else 1w und 2f:
				if (j > 100) { // (1 wahr, 2 falsch, 3 wahr) -->(3 wahr kommt hinzu)
					k = -10; // „andere Fälle“
				} else { // (1 wahr, 2 falsch, 3 falsch) ----> in Aufgabe gegeben
					k = 1;
				}
			}
		} else { // Ausdruck 1 falsch
			if (i <= 200 && j <= 100) { // (alle 3 falsch)--->in Aufgabe gegeben (&& = und gleichzeitig)
				k = 4;
			} else { // „andere Fälle“
				k = -10;
			}
		}

		// Ausgabe
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
	}
}