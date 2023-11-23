import java.util.Scanner;

public class AplikasiBookingBeta {

    static boolean menu = true;
    static Scanner sc = new Scanner(System.in);

    /*
     * function tampilan menu
     */
    static void tampilkanMenu() {
        System.out.println("==================================================");
        System.out.println("=                      Menu                      =");
        System.out.println("==================================================\n");
        System.out.println("[1] Login Akun");
        System.out.println("[2] Form Booking");
        System.out.println("[3] List Booking");
        System.out.println("[4] Reservasi Ruangan Rapat");
        System.out.println("[5] Payment Methode");
        System.out.println("[6] Checkin");
        System.out.println("[7] Checkout");
        System.out.println("[8] Beri Penilaian");
        System.out.println("[0] Keluar");
        System.out.print("Pilih menu: ");
        int pilihanMenu = sc.nextInt();
        sc.nextLine();

        switch (pilihanMenu) {
            case 1:
              login();
                break;
            case 2:
                formBooking();
                break;
            case 3:
              listBooking();
                break;
            case 4:
                    restRapat();
                break;
            case 5:
             payment();
                break;
            case 6:
                checkin();
                break;
            case 7:
               checkout();
                break;
            case 8:
                penilaian();
                break;             
            case 0:
                keluar();
                break;
            default:
                System.out.println("\nInput yang anda masukan salah, silahkan untuk mencoba lagi!\n");
        }
    }

    /* 
     * function login
     */
    static void login() {
        
        System.out.println("\n==================================================");
        System.out.println("=                     Login                      =");
        System.out.println("==================================================\n");
 
        String bookingUsername = "username123";
        String bookingPassword = "username123";

        Boolean loginBooking = false;

        while (!loginBooking) {
            System.out.println("Login Aplikasi Booking Ruangan");
            System.out.print("Masukan Username Anda : ");
            String usernameIn = sc.next();
            System.out.print("Masukan Password Anda : ");
            String passwordIn = sc.next();

            if (usernameIn.equals(bookingUsername) && passwordIn.equals(bookingPassword)) {
                loginBooking = true;
            }else {
                System.out.println("Username atau Password yang Anda Masukan Salah!");
                System.out.println("Silahkan Mengisi Username dan Password Anda Kembali!\n");
            }
        }

        if (loginBooking) {
            System.out.println("\nLogin Berhasil");
            System.out.println("Selamat Datang " + bookingUsername + " di Aplikasi Booking Ruangan");
            System.out.println("\n==================================================");
            System.out.println("=                  System out                    =");
            System.out.println("==================================================\n");

        }
    }

    /*
     * function form booking
     */
    static void formBooking() {

        // form booking dimulai
        System.out.println("\n==================================================");
        System.out.println("=                 Form Booking                   =");
        System.out.println("==================================================\n");

        // variabel loop form booking 1
        String inputNama = "";
        Boolean isNamaValid = false;

        while (!isNamaValid) {
            System.out.print("Nama: ");
            inputNama = sc.next();
            if (!inputNama.trim().isEmpty()) {
                isNamaValid = true;
            } else {
                System.out.println("Nama tidak boleh kosong. Silahkan masukkan nama lagi.\n");
            }
        }

        // variabell loop form booking 2
        boolean isAlamatValid = false;
        String alamat = "";

        while (!isAlamatValid) {
            System.out.print("Alamat: ");
            alamat = sc.next();
            if (!alamat.trim().isEmpty()) {
                isAlamatValid = true;
            } else {
                System.out.println("Alamat tidak boleh kosong. Silahkan masukkan lagi.");
            }
        }

        // variable loop form booking 3

        boolean isNoHpValid = false;
        String noHp = "";

        while (!isNoHpValid) {
            System.out.print("Nomor Telepon: ");
            noHp = sc.next().trim();

            int panjangNoHp = noHp.length();
            if (panjangNoHp == 12 || panjangNoHp == 13) {
                isNoHpValid = true;
            } else {
                System.out.println("Nomor telepon harus 12 atau 13 angka. Silahkan masukkan lagi!\n");
            }
        }

        // variable loop konfirmasi form booking 3

        boolean konfirmasiBenar = false;

        while (!konfirmasiBenar) {
            System.out.print("Silahkan Ketik (Konfirmasi) Untuk Menyimpan Data Anda: ");
            String konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("Konfirmasi")) {
                konfirmasiBenar = true;
                System.out.println("Data Diri Anda Telah Tersimpan");
            } else {
                System.out.println("Konfirmasi tidak sesuai! Silahkan coba lagi!\n");
            }
        }

        // form booking berakhir
        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");
    }

    /*
     * function list booking
     */
    static void listBooking() {

        int ruang = 0;

        // Inisialisasi array
        String fasilitasRuangan[][] = new String[3][3];
        fasilitasRuangan[0][0] = "Fasilitas 1A";
        fasilitasRuangan[0][1] = "Fasilitas 1B";
        fasilitasRuangan[0][2] = "Fasilitas 1C";
        fasilitasRuangan[1][0] = "Fasilitas 2A";
        fasilitasRuangan[1][1] = "Fasilitas 2B";
        fasilitasRuangan[1][2] = "Fasilitas 2C";
        fasilitasRuangan[2][0] = "Fasilitas 3A";
        fasilitasRuangan[2][1] = "Fasilitas 3B";
        fasilitasRuangan[2][2] = "Fasilitas 3C";

        boolean isListBooking = false;
        while (!isListBooking) {

            System.out.println("\n==================================================");
            System.out.println("=                 List Booking                   =");
            System.out.println("==================================================\n");

            System.out.println("List ruangan yang tersedia pada hari ini\n");
            System.out.println("Ruangan 1 ");
            System.out.println("Ruangan 2");
            System.out.println("Ruangan 3");
            System.out.print("Silahkan masukan ruangan yang ingin anda pesan (1/2/3): ");
            ruang = sc.nextInt();

            if (ruang > 3 || ruang < 1) {
                System.out.println("\nRuang yang anda pilih tidak tersedia, silahkan untuk mencoba kembali!");
            } else {
                isListBooking = true;
            }
        }

        System.out.println("\n==================================================");
        System.out.println("=           Detail fasilitas ruangan             =");
        System.out.println("==================================================\n");
        System.out.print("Apakah Anda Ingin Melihat Detail Fasilitas Ruangan " + ruang + " (y/t)?: ");
        String detail = sc.next();

        if (detail.equalsIgnoreCase("y")) {

            if (ruang >= 1 && ruang <= 3) {
                System.out.println("\nIni Adalah Detail dari Ruangan " + ruang + ".");
                System.out.println("\nDetail Fasilitas Ruangan " + ruang + ": ");
                for (int i = 0; i < fasilitasRuangan[ruang - 1].length; i++) {
                    System.out.println(fasilitasRuangan[ruang - 1][i]);
                }
            }

        } else {
            System.out.println("\nAnda tidak melihat detail ruangan.");
        }

        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");

    }

    /*
     * function reservasi rapat
     */
    static void restRapat() {

        System.out.println("\n==================================================");
        System.out.println("=        Reservasi Ruangan Rapat                 =");
        System.out.println("==================================================\n");

        int ruangRapat = 0;
        Boolean isResRapat = false;

        while (!isResRapat) {

            System.out.print("Apakah Anda ingin Memulai Reservasi Ruangan Rapat? (y/t): ");
            String resRapat = sc.nextLine();
            if (resRapat.equalsIgnoreCase("y")) {
                System.out.println("\nSilahkan untuk memilih ruangan rapat");

                System.out.println("Ruangan Rapat 1");
                System.out.println("Ruangan Rapat 2");
                System.out.println("Ruangan Rapat 3");
                System.out.print("Pilih Ruangan Rapat (1/2/3): ");
                ruangRapat = sc.nextInt();

                Boolean isRuangRapat = false;

                while (!isRuangRapat) {
                    switch (ruangRapat) {
                        case 1:
                            System.out.println("\nAnda Memilih Ruang Rapat 1");
                            System.out.println("Detail ruang rapat 1\n");
                            isRuangRapat = true;
                            break;
                        case 2:
                            System.out.println("\nAnda Memilih Ruang Rapat 2");
                            System.out.println("\nDetail ruang rapat 2\n");
                            isRuangRapat = true;
                            break;
                        case 3:
                            System.out.println("\nAnda Memilih Ruang Rapat 3");
                            System.out.println("Detail ruang rapat 3\n");
                            isRuangRapat = true;
                            break;
                        default:
                            System.out.println("Input yang Anda Masukan Tidak Valid\n");
                            break;
                    }
                }

                String konfirmasiRuangRapat;
                Boolean isKonfirmasiRuangRapat = false;

                while (!isKonfirmasiRuangRapat) {

                    System.out.print("Apakah anda yakin dengan ruangan rapat " + ruangRapat + "? (y/t): ");
                    konfirmasiRuangRapat = sc.next();

                    if (konfirmasiRuangRapat.equalsIgnoreCase("y")) {
                        System.out.println("Anda telah memesan ruang rapat " + ruangRapat + "\n");
                        isKonfirmasiRuangRapat = true;
                    } else if (konfirmasiRuangRapat.equalsIgnoreCase("t")) {
                        System.out.println("Anda tidak jadi memesar ruang rapat!\n");
                        isKonfirmasiRuangRapat = true;
                    } else {
                        System.out.println("input yang anda masukan salah!");
                    }

                }
                isResRapat = true;

            } else if (resRapat.equalsIgnoreCase("t")) {
                System.out.println(
                        "Anda Tidak Memilih Reservasi Ruangan Rapat\n");
                isResRapat = true;

            } else {
                System.out.println("Input yang anda masukan salah!\n");
            }

        }

        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");
    }

    /*
     * function checkin
     */
    static void checkin() {

        // input Checkin
        System.out.println("\n==================================================");
        System.out.println("=                    Checkin                     =");
        System.out.println("==================================================");

        int bulanCheckin, tanggalCheckin, waktuCheckin;
        String namaBulanCheckin = "";
        String ampmCheckin;

        // Tahun checkin
        int tahunCheckin = 0;
        while (tahunCheckin != 2023) {

            System.out.print("Masukan Tahun Checkin (YYYY): ");
            tahunCheckin = sc.nextInt();

            if (tahunCheckin != 2023) {
                System.out.println("Tahun Checkin yang Anda Masukan Tidak Valid!\n");
            }

        }
        // Bulan checkin

        do {
            System.out.print("Masukan Bulan Checkin(1-12): ");
            bulanCheckin = sc.nextInt();
            namaBulanCheckin = ""; // Reset bulan di setiap iterasi

            switch (bulanCheckin) {
                case 1:
                    namaBulanCheckin = "Januari";
                    break;
                case 2:
                    namaBulanCheckin = "Februari";
                    break;
                case 3:
                    namaBulanCheckin = "Maret";
                    break;
                case 4:
                    namaBulanCheckin = "April";
                    break;
                case 5:
                    namaBulanCheckin = "Mei";
                    break;
                case 6:
                    namaBulanCheckin = "Juni";
                    break;
                case 7:
                    namaBulanCheckin = "Juli";
                    break;
                case 8:
                    namaBulanCheckin = "Agustus";
                    break;
                case 9:
                    namaBulanCheckin = "September";
                    break;
                case 10:
                    namaBulanCheckin = "Oktober";
                    break;
                case 11:
                    namaBulanCheckin = "November";
                    break;
                case 12:
                    namaBulanCheckin = "Desember";
                    break;
                default:
                    System.out.println("Bulan yang Anda Masukan Salah!\n");
                    break;
            }
        } while (bulanCheckin < 1 || bulanCheckin > 12);
        // output bulan checkin

        // Input tanggal checkin
        int maxTanggalCheckintanggal = 31;
        if (bulanCheckin == 2) {
            if ((tahunCheckin % 4 == 0 && tahunCheckin % 100 != 0) || (tahunCheckin % 400 == 0)) {
                maxTanggalCheckintanggal = 29;
            } else {
                maxTanggalCheckintanggal = 28;
            }
        } else if (bulanCheckin == 4 || bulanCheckin == 6 || bulanCheckin == 9 || bulanCheckin == 11) {
            maxTanggalCheckintanggal = 30;
        }
        do {
            System.out.print("Masukan Tanggal Checkin (1-" + maxTanggalCheckintanggal + "): ");
            tanggalCheckin = sc.nextInt();
            if (tanggalCheckin < 1 || tanggalCheckin > maxTanggalCheckintanggal) {
                System.out.println(
                        "Tanggal yang Anda Masukan Salah untuk Bulan " + namaBulanCheckin + "!");
            }
        } while (tanggalCheckin < 1 || tanggalCheckin > maxTanggalCheckintanggal);
        // output tanggal checkin

        // Input JamCheckin
        do {
            System.out.print("Masukan Jam Checkin (format 24 jam): ");
            waktuCheckin = sc.nextInt();
            if (waktuCheckin < 0 || waktuCheckin >= 24) {
                System.out.println("Waktu yang Anda Masukan Salah!");
            }
        } while (waktuCheckin < 0 || waktuCheckin >= 24);

        ampmCheckin = waktuCheckin < 12 ? "AM" : "PM";
        if (waktuCheckin > 12)
            waktuCheckin -= 12;
        // output jam checkin

        System.out.println("konfirmasi checkin");

        String konfirmCheckin;
        boolean isConfirm = false;

        while (!isConfirm) {

            System.out.print("Apakah anda yakin ingin memulai checkin?(y/t): ");
            konfirmCheckin = sc.next();

            if (konfirmCheckin.equalsIgnoreCase("y")) {

                System.out.println("\nSelamat checkin anda berhasil\n");
                System.out.println(
                        "Anda Memulai Checkin Pada " + " " + tanggalCheckin + " " + namaBulanCheckin + " "
                                + tahunCheckin +
                                " Pada Jam "
                                + waktuCheckin + " " + ampmCheckin);
                isConfirm = true;

            } else if (konfirmCheckin.equalsIgnoreCase("t")) {
                System.out.println("Anda batal checkin");

                isConfirm = true;

            } else {
                System.out.println("Input yang anda masukan salah, silahkan coba kembali!");
            }
        }
        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");
        // output checkin

    }

    /*
     * function checkout
     */
    static void checkout() {
        System.out.println("\n==================================================");
        System.out.println("=                   Checkout                     =");
        System.out.println("==================================================\n");

        // konfirmasi checkout
        boolean konfirmasiCheckout = false;
        while (!konfirmasiCheckout) {
            System.out.print("\nSilahkan Ketik (Konfirmasi) Untuk Checkout Dari Ruangan: ");
            String konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("Konfirmasi")) {
                konfirmasiCheckout = true;
                System.out.println("Anda Telah Mengkonfirmasi Checkout\n");
            } else {
                System.out.println("Konfirmasi tidak sesuai! Silahkan coba lagi!\n");
            }
        }
        // konfirmasi checkout

        // input waktu checkout
        int waktuCheckout;
        String ampmCheckout;
        do {
            System.out.print("Masukan Waktu Checkout (format 24 jam): ");
            waktuCheckout = sc.nextInt();
            if (waktuCheckout < 0 || waktuCheckout >= 24) {
                System.out.println("Waktu checkout yang Anda Masukan Salah!\n");
            }
        } while (waktuCheckout < 0 || waktuCheckout >= 24);

        ampmCheckout = waktuCheckout < 12 ? "AM" : "PM";
        if (waktuCheckout > 12)
            waktuCheckout -= 12;

        System.out.println("Anda Telah Checkout Pada Jam " + waktuCheckout + " " + ampmCheckout);
        // output waktu checkout

        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");
    }

    /*
     * function payment methode
     */
    static void payment() {

        String konfirmasiPembayaran;
        int pilihanBank = 0;
        int pilihanKartu = 0;
        int payMethod;

        // pilihan pembayaran
        do {
            System.out.println("\n==================================================");
            System.out.println("=                Payment Methode                 =");
            System.out.println("==================================================\n");

            System.out.println("1. M-Banking");
            System.out.println("2. Kartu Kredit/Debit");
            System.out.println("3. Offline Payment");
            System.out.println("4. Bank Transfer");
            System.out.print("Pilih Metode Pembayaran (1/2/3/4): ");
            payMethod = sc.nextInt();

            // pilihan pembayaran a
            switch (payMethod) {
                case 1:
                    do {
                        System.out.println("\n1. Bank CBA");
                        System.out.println("2. Bank ABC");
                        System.out.println("3. Bank ACB");
                        System.out.println("0. batalkan pilihan");
                        System.out.print("Silahkan pilih bank (1/2/3/0): ");
                        pilihanBank = sc.nextInt();

                        switch (pilihanBank) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 0:
                                continue;
                            default:
                                System.out.println("Nomor yang anda masukan salah, silahkan pilih kembali!");
                                break;
                        }
                    } while (pilihanBank != 0 && (pilihanBank < 1 || pilihanBank > 3));
                    break;

                // pilihan pembayaran b
                case 2:
                    do {
                        System.out.println("\n1. Kartu kredit");
                        System.out.println("2. Kartu debit");
                        System.out.println("0. Batalkan pembayaran=");
                        System.out.print("Silahkan pilih jenis kartu (1/2/0): ");
                        pilihanKartu = sc.nextInt();

                        switch (pilihanKartu) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 0:
                                continue;
                            default:
                                System.out.println("Nomor yang anda masukan salah, silahkan coba lagi!");
                        }
                    } while (pilihanKartu != 0 && (pilihanKartu < 1 || pilihanKartu > 2));
                    break;

                // pilihan pembayaran c
                case 3:
                    break;

                // pilihan pembayaran d
                case 4:
                    do {
                        System.out.println("\n1. Bank CBA");
                        System.out.println("2. Bank ABC");
                        System.out.println("3. Bank ACB");
                        System.out.println("0. batalkan pilihan");
                        System.out.print("Silahkan pilih jenis bank (1/2/3/0): ");
                        pilihanBank = sc.nextInt();

                        switch (pilihanBank) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 0:
                                continue;
                            default:
                                System.out.println("Nomor yang anda masukan salah, Silahkan coba lagi!");
                        }
                    } while (pilihanBank != 0 && (pilihanBank < 1 || pilihanBank > 3));
                    break;
                default:
                    System.out.println("Pilihan pembayaran yang anda masukan salah, silahkan coba lagi!\n");
                    continue;
            }

            // ketika user input c
            if (payMethod == 3 || pilihanBank != 0 || pilihanKartu != 0) {
                do {
                    System.out.print("\nApakah anda sudah yakin dengan metode pembayaran ini? (y/t): ");
                    konfirmasiPembayaran = sc.next();
                    if (konfirmasiPembayaran.equalsIgnoreCase("t")) {
                        System.out.println("Pembayaran dibatalkan, kembali ke pilihan pembayaran!\n");
                        break;

                        // ketika user input a/b/d
                    } else if (konfirmasiPembayaran.equalsIgnoreCase("y")) {
                        switch (payMethod) {
                            case 1:
                                switch (pilihanBank) {
                                    case 1:
                                        System.out.println(
                                                "Silahkan transfer m-banking bank CBA pada nomor rekening 1234567890123456");
                                        break;
                                    case 2:
                                        System.out.println(
                                                "Silahkan transfer m-banking bank ABC pada nomor rekening 1234567890123456");
                                        break;
                                    case 3:
                                        System.out.println(
                                                "Silahkan transfer m-banking bank ACB pada nomor rekening 1234567890123456");
                                        break;
                                }
                                break;
                            case 2:
                                switch (pilihanKartu) {
                                    case 1:
                                        System.out.println(
                                                "Silahkan transfer menggunakan kartu kredit pada rekening 1234567890123456");
                                        break;
                                    case 2:
                                        System.out.println(
                                                "Silahkan transfer menggunakan kartu debit pada rekening 1234567890123456");
                                        break;
                                }
                                break;
                            case 4:
                                switch (pilihanBank) {
                                    case 1:
                                        System.out.println(
                                                "Silahkan transfer m-banking bank CBA pada nomor rekening 1234567890123456");
                                        break;
                                    case 2:
                                        System.out.println(
                                                "Silahkan transfer m-banking bank ABC pada nomor rekening 1234567890123456");
                                        break;
                                    case 3:
                                        System.out.println(
                                                "Silahkan transfer m-banking bank ACB pada nomor rekening 1234567890123456");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("\nAnda telah mengkonfirmasi pembayaran.");
                                System.out.println("Silahkan siapkan uang anda saat melakukan checkin");
                                break;
                        }
                        System.out.println("\n==================================================");
                        System.out.println("=                  System out                    =");
                        System.out.println("==================================================\n");
                        return;

                        // ketika input salah
                    } else {
                        System.out.println("Pilihan yang anda masukan salah, silahkan pilih 'y' atau 't'!");
                    }
                } while (!konfirmasiPembayaran.equalsIgnoreCase("y") && !konfirmasiPembayaran.equalsIgnoreCase("t"));
            }
        } while (true);
    }

    /*
     * function penilaian dan feedback
     */
    static void penilaian() {

        String feedback = "";
        String penilaian = "";
        boolean isPenilaian = false;

        System.out.println("\n==================================================");
        System.out.println("=            Penilaian dan feedback              =");
        System.out.println("==================================================\n");

        // input ppenilaian 1-5
        while (!isPenilaian) {
            // input penilaian pelanggan
            System.out.println("Bagaimana pengalaman anda saat menggunakan aplikasi  ini?");
            System.out.println("1 = Sangat Tidak Puas");
            System.out.println("2 = Tidak Puas");
            System.out.println("3 = Biasa Saja");
            System.out.println("4 = Puas");
            System.out.println("5 = Sangat Puas");
            System.out.print("Silahkan isi penilaian sesuai kepuasan anda: ");
            penilaian = sc.next();

            if (penilaian.equals("1") || penilaian.equals("2") || penilaian.equals("3") || penilaian.equals("4")
                    || penilaian.equals("5")) {
                isPenilaian = true;
            } else {
                System.out.println("Anda memasukan angka yang salah, silahkan untuk memilih angka 1-5.\n");
            }
        }

        switch (penilaian) {
            case "1":
                System.out.println("Mohon maaf atas ketidaknyamanan yang telah anda alami pada aplikasi ini\n");
                break;
            case "2":
                System.out.println("kami akan berusaha lebih baik lagi dalam pengembangan aplikasi ini\n");
                break;
            case "3":
                System.out.println("Terimakasih atas penilaian anda\n");
                break;
            case "4":
                System.out.println("Senang mendengar anda puas dengan aplikasi ini\n");
                break;
            case "5":
                System.out.println("Senang mendengar anda sangat puas dengan aplikasi ini\n");
                break;
        }
        // output penilaian 1-5

        // input feedback kepuasan pengguna
        System.out.print("Kami ingin mendengar lebih lanjut, silahkan berikan feedback / saran anda: ");
        feedback = sc.next();
        // feedback telah disimpan

        System.out.println("\nFeedback anda telah tersimpan");
        System.out.println("Terima kasih telah meluangkan waktu untuk memberi masukan.");

        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");

    }

    static void keluar() {

        System.out.println("\n==================================================");
        System.out.println("=              Keluar dari aplikasi              =");
        System.out.println("==================================================\n");

        String konfirmKeluar;
        Boolean isKonfirmKeluar = false;

        while (!isKonfirmKeluar) {

            System.out.print("Apakah anda yakin ingin keluar?(y/t): ");
            konfirmKeluar = sc.next();

            if (konfirmKeluar.equalsIgnoreCase("y")) {
                System.out.println("\nTerimakasih telah menggunakan Aplikasi Booking Ruangan!");
                System.out.println("\n==================================================");
                System.out.println("=                   System end                   =");
                System.out.println("==================================================\n");
                isKonfirmKeluar = true;
                menu = false;

            } else if (konfirmKeluar.equalsIgnoreCase("t")) {
                System.out.println("Anda kembali ke menu, silahkan pilih menu kembali!\n");
                isKonfirmKeluar = true;
                tampilkanMenu();

            } else {
                System.out.println("Input anda tidak valid, silahkan ulang kembali!\n");
            }
        }
    }

    public static void main(String[] args) {
        do {
            tampilkanMenu();
        } while (menu);
    }

}
