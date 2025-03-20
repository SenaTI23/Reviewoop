public class Tabungan extends Rekening {
    private double bungaTahunan;

    public Tabungan(String namaPemilik, String nomorRekening, double bungaTahunan) {
        super(namaPemilik, nomorRekening);
        this.bungaTahunan = bungaTahunan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bunga Tahunan: " + bungaTahunan + "%");
    }

    public double hitungBunga(int bulan) {
        return (saldo * bungaTahunan / 100) * (bulan / 12.0);
    }
}
