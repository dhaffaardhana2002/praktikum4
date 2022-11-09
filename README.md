# Tugas PBO Pertemuan 7

Nama: Muhammad Dhaffa Ardhana Rianto Putra

NIM: 312110029

Kelas: TI.21.C.2

---

Disini saya akan menunjukkan tutorial membuat Overloading dan Overridding

## Buat file dan kode Java

- Buat file dengan nama bebas seperti `Utama` dengan ekstensi file `.java`
- Tulis kode java seperti berikut

```
public class Utama {
	public static void main(String[] args) {
	
	}
}
```

### Buat file BangunDatar class

- Untuk membuat super class constructor, buat file di folder yang sama dengan nama `BangunDatar.java`
- Tulis kode java seperti berikut

```
public class BangunDatar {
	
}
```

- Lalu buat function `luas()` dan `keliling()` 

```
public float luas() {
	return 0;
}
public float keliling() {
	return 0;
}
```

### Buat file Lingkaran, Segitiga dan Persegi sebagai subclass dari BangunDatar

- Setelah diawal telah membuat super class, sekarang kita akan membuat subclass dengan menggunakan syntac `extend` setelah nama subclass
- Sebelum itu buat file baru dengan nama `Lingkaran.java` dan ketik kode tersebut


```
public class Lingkaran extends BangunDatar { 

}
```

- Lalu buat variabel dan function `luas()` dan `keliling()`


```
private float pi = 3.14f;
int r;

public float luas() {
	return (this.pi*r*r);
}

public float keliling() {
	return (2*this.pi*r);
}
```

- Lalu file berikutnya yaitu `Segitiga.java`
- Buat variabel dan luas dengan rumus `alas * tinggi / 2`
- Keliling segitiga dengan rumus `alas * 3`

```
int alas;
int tinggi;

public float luas() {
	return (alas * tinggi / 2);
}

public float keliling() {
	return (alas * 3);
}
```

- Lalu file terakhir yaitu `Persegi.java`
- Buat variabel dan luas dengan rumus `sisi * sisi`
- Keliling segitiga dengan rumus `sisi * 4`

```
int sisi;

public float luas() {
	return (sisi * sisi);
}

public float keliling() {
	return (sisi * 4);
}
```

### Di dalam file `Utama.java`

- Tambahkan kode didalam `main()` dengan kode sebagai berikut, untuk menambahkan objek baru dari class constructor yang sudah dibuat, dan juga tambahkan variabel

```
Lingkaran bulat = new Lingkaran();
bulat.r = 4;

Segitiga atap = new Segitiga();
atap.alas = 6;
atap.tinggi = 8;

Persegi kotak = new Persegi();
kotak.sisi = 5;
```

### Cetak hasil koding

- Print hasil dengan menggunakan `System.out.println`

```
System.out.println("Luas Lingkaran: " + bulat.luas());
System.out.println("Keliling Lingkaran: " + bulat.keliling());
System.out.println("\nLuas Segitiga: " + atap.luas());
System.out.println("Keliling Segitiga: " + atap.keliling());
System.out.println("\nLuas Persegi: " + kotak.luas());
System.out.println("Keliling Persegi: " + kotak.keliling());
```

- Save semua file
- Buka cmd (Command Prompt)
- Pergi menuju folder yang sudah dibuat dengan menggunakan `cd ...`
- Lalu eksekusi dengan mengetik `javac` lalu file yang akan di kompile yaitu `Utama.java`, `BangunDatar.java`, `Lingkaran.java`, `Segitiga.java`, dan `Persegi.java`.
- Jika berhasil dan tidak ada error, ketik

```
java Utama
```

- Tampilan nya akan seperti ini

```
Luas Lingkaran: 50.24
Keliling Lingkaran: 25.12

Luas Segitiga: 24.0
Keliling Segitiga: 18.0

Luas Persegi: 25.0
Keliling Persegi: 20.0
```

[Klik disini untuk melihat Hasil screenshot](https://github.com/dhaffaardhana2002/praktikum3/blob/master/img/praktikum-hasil.png?raw=true)

___
Terima kasih untuk membaca tutorial saya. Tak lupa juga untuk dosen saya dan teman-teman saya yang sudah membantu saya.
