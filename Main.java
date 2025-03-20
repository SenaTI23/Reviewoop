
public class Main {
    public static void main(String[] args) {
        // Create instances of accounts
        Tabungan tabungan = new Tabungan("Alice", "123456", 5.0);
        Giro giro = new Giro("Bob", "654321", 1000.0);
        Deposito deposito = new Deposito("Charlie", "789012", 12, 6.0);

        // Perform transactions
        tabungan.setor(1000);
        giro.setor(2000);
        deposito.setor(5000);

        tabungan.tarik(200);
        giro.tarik(2500);
        deposito.tarik(1000); // Early withdrawal

        // Display account information
        tabungan.tampilkanInfo();
        giro.tampilkanInfo();
        deposito.tampilkanInfo();

        // Calculate and display interest for Tabungan
        double bungaTabungan = tabungan.hitungBunga(6);
        System.out.println("Bunga Tabungan untuk 6 bulan: " + bungaTabungan);
    }
}
