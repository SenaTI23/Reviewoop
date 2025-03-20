public class Deposito extends Rekening {
    private int jangkaWaktuBulan;
    private double sukuBunga;

    public Deposito(String namaPemilik, String nomorRekening, int jangkaWaktuBulan, double sukuBunga) {
        super(namaPemilik, nomorRekening);
        this.jangkaWaktuBulan = jangkaWaktuBulan;
        this.sukuBunga = sukuBunga;
    }

    public double hitungBungaDeposito() {
        return (saldo * sukuBunga / 100) * (jangkaWaktuBulan / 12.0);
    }

    @Override
    public void tarik(double jumlah) {
        if (jangkaWaktuBulan > 0) {
            double denda = saldo * 0.10; // 10% penalty
            saldo -= (jumlah + denda);
            System.out.println("Penarikan sebelum jatuh tempo dikenakan denda: " + denda);
        } else {
            super.tarik(jumlah);
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jangka Waktu: " + jangkaWaktuBulan + " bulan");
        System.out.println("Suku Bunga: " + sukuBunga + "%");
    }
}
