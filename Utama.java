public class Utama {
	public static void main(String[] args) {
		// Lingkaran
		Lingkaran bulat = new Lingkaran();
		bulat.r = 4;
		System.out.println("Luas Lingkaran: " + bulat.luas());
		System.out.println("Keliling Lingkaran: " + bulat.keliling());

		// Segitiga
		Segitiga atap = new Segitiga();
		atap.alas = 6;
		atap.tinggi = 8;
		System.out.println("\nLuas Segitiga: " + atap.luas());
		System.out.println("Keliling Segitiga: " + atap.keliling());

		// Persegi
		Persegi kotak = new Persegi();
		kotak.sisi = 5;
		System.out.println("\nLuas Persegi: " + kotak.luas());
		System.out.println("Keliling Persegi: " + kotak.keliling());
	}
}