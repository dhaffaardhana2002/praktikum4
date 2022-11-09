public class Segitiga extends BangunDatar {
	int alas;
	int tinggi;

	public float luas() {
		return (alas * tinggi / 2);
	}

	public float keliling() {
		return (alas * 3);
	}
}