public class Giro extends Rekening {
    private double limitPenarikan;

    public Giro(String namaPemilik, String nomorRekening, double limitPenarikan) {
        super(namaPemilik, nomorRekening);
        this.limitPenarikan = limitPenarikan;
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah <= saldo + limitPenarikan) {
            saldo -= jumlah;
        } else {
            System.out.println("Penarikan melebihi limit giro.");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Limit Penarikan: " + limitPenarikan);
    }
}
