public class Lingkaran extends BangunDatar {
	private float pi = 3.14f;
	int r;

	public float luas() {
		return (this.pi*r*r);
	}

	public float keliling() {
		return (2*this.pi*r);
	}
}