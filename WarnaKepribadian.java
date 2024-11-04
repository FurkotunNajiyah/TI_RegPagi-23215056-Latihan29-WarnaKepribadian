import java.util.Scanner;

public class WarnaKepribadian {

    // Kode ANSI untuk teks dan latar belakang warna
    public static final String RESET = "\u001B[0m";
    public static final String RED_BG = "\u001B[41m";
    public static final String GREEN_BG = "\u001B[42m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String PURPLE_BG = "\u001B[45m";
    public static final String WHITE_TEXT = "\u001B[37m"; // Untuk teks putih agar kontras dengan latar belakang

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println(boxColor(RED_BG, "MERAH"));
        System.out.println(boxColor(GREEN_BG, "HIJAU"));
        System.out.println(boxColor(BLUE_BG, "BIRU"));
        System.out.println(boxColor(PURPLE_BG, "UNGU"));

        System.out.print("PILIH WARNA FAVORITMU: ");
        String warnaFavorit = scanner.nextLine().toUpperCase();

        System.out.print("NAMA KAMU: ");
        String nama = scanner.nextLine();

        System.out.println("\n====HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "====");

        // Menampilkan hasil berdasarkan warna favorit
        switch (warnaFavorit) {
            case "MERAH":
                System.out.println(boxColor(RED_BG, "Warna Favoritmu adalah " + warnaFavorit));
                System.out.println("1. Pemberani");
                System.out.println("2. Percaya diri");
                System.out.println("3. Energik");
                break;
            case "HIJAU":
                System.out.println(boxColor(GREEN_BG, "Warna Favoritmu adalah " + warnaFavorit));
                System.out.println("1. Tenang");
                System.out.println("2. Penyabar");
                System.out.println("3. Peduli lingkungan");
                break;
            case "BIRU":
                System.out.println(boxColor(BLUE_BG, "Warna Favoritmu adalah " + warnaFavorit));
                System.out.println("1. Menyenangkan");
                System.out.println("2. Bijaksana");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah");
                System.out.println("4. Dinamis");
                System.out.println("5. Senang berbagi");
                System.out.println("6. Bersahabat");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai");
                break;
            case "UNGU":
                System.out.println(boxColor(PURPLE_BG, "Warna Favoritmu adalah " + warnaFavorit));
                System.out.println("1. Kreatif");
                System.out.println("2. Intuitif");
                System.out.println("3. Misterius");
                break;
            default:
                System.out.println("Warna tidak valid");
        }

        scanner.close();
    }

    // Metode untuk menampilkan latar belakang warna
    public static String boxColor(String bgColor, String text) {
        return bgColor + WHITE_TEXT + "  " + text + "  " + RESET; // Warna latar belakang dan teks putih
    }
}
