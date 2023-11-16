import java.util.Scanner;

public class AplikasiBookingRuangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input login
        System.out.println("==================================================");
        System.out.println("=            Aplikasi Booking Ruangan            =");
        System.out.println("==================================================\n");
        System.out.println("[1] Daftar Akun");
        System.out.println("[2] Login Akun");
        System.out.println("[3] Form Booking");
        System.out.println("[4] List Booking");
        System.out.println("[5] Reservasi Ruangan Rapat");
        System.out.println("[6] Payment Methode");
        System.out.println("[7] Checkin");
        System.out.println("[8] Checkout");
        System.out.println("[9] Beri Penilaian");
        System.out.println("[0] Keluar");
        System.out.print("Pilih menu: ");

        System.out.println("\n==================================================");
        System.out.println("=                  Daftar Akun                   =");
        System.out.println("==================================================\n");

        System.out.println("Selamat datang di aplikasi booking ruangan! Silahkan buat akun anda");

        // input nama
        System.out.print("Nama lengkap: ");
        String namaDaftar = sc.next();

        // input username
        String usernameDaftar;
        Boolean isUsernameDaftar = false;

        while (!isUsernameDaftar) {
            System.out.print("Username: ");
            usernameDaftar = sc.next();
            if (usernameDaftar.length() >= 8) {
                isUsernameDaftar = true;

            } else {
                System.out.println("Password minimal harus 8 huruf atau angka!\n");
            }

        }

        // input pasword
        String passwordDaftar = "";
        Boolean isDigitPassword = false;

        while (!isDigitPassword) {

            System.out.print("Password: ");
            passwordDaftar = sc.next();
            if (passwordDaftar.length() >= 8) {
                isDigitPassword = true;

            } else {
                System.out.println("Password minimal harus 8 huruf atau angka!\n");
            }

        }

        // input konfirmasi password
        Boolean isPassword = false;

        while (!isPassword) {

            System.out.print("Konfirmasi password: ");
            String confirmPasswordDaftar = sc.next();

            if (confirmPasswordDaftar.equals(passwordDaftar)) {
                isPassword = true;
            } else {
                System.out.println("Konfirmasi password anda tidak sesuai, silahkan coba lagi!\n");
            }
        }

        // input ttl
        System.out.print("Tempat, tanggal, lahir: ");
        String ttlDaftar = sc.next();

        // input e-mail
        System.out.print("E-mail: ");
        String emailDaftar = sc.next();

        // input nomer telepon
        System.out.print("Nomor telepon: ");
        String noHpDaftar = sc.next();

        // daftar akun berakhir
        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================");

        System.out.println("\n==================================================");
        System.out.println("=                     Login                      =");
        System.out.println("==================================================\n");

        String bookingUsername = "username123";
        String bookingPassword = "username123";

        String adminUsername = "admin123";
        String adminPassword = "admin123";

        Boolean loginBooking = false;
        Boolean loginAdmin = false;

        while (!loginBooking && !loginAdmin) {
            System.out.println("Login Aplikasi Booking Ruangan");
            System.out.print("Masukan Username Anda : ");
            String usernameIn = sc.next();
            System.out.print("Masukan Password Anda : ");
            String passwordIn = sc.next();

            if (usernameIn.equals(bookingUsername) && passwordIn.equals(bookingPassword)) {
                loginBooking = true;
            } else if (usernameIn.equals(adminUsername) && passwordIn.equals(adminPassword)) {
                loginAdmin = true;
            } else {
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

        } else if (loginAdmin) {
            System.out.println("\nLogin Berhasil");
            System.out.println("Selamat Datang " + adminUsername + " di Aplikasi Booking Ruangan");
            System.out.println("\n==================================================");
            System.out.println("=                Admin System                    =");
            System.out.println("==================================================\n");
        }
        // output login

        System.out.println("\n==================================================");
        System.out.println("=                Form Booking                    =");
        System.out.println("==================================================\n");
        System.out.println("Silahkan Isi Data Diri Anda");

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

        boolean isAlamatValid = false;
        String alamat = "";
        while (!isAlamatValid) {
            System.out.print("Alamat: ");
            alamat = sc.next();
            if (!alamat.trim().isEmpty()) { // memastikan alamat tidak kosong
                isAlamatValid = true;
            } else {
                System.out.println("Alamat tidak boleh kosong. Silahkan masukkan lagi.");
            }
        }

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

        int tahun, bulan, tanggal, waktu, jam;
        String namaBulanFormBooking = "";
        String ampm;

        // input tahun
        do {
            System.out.print("Masukan Tahun Pemesanan (YYYY): ");
            tahun = sc.nextInt();
            if (tahun == 2023) {
            } else {
                System.out.println("Tahun Yang Anda Masukan Tidak Valid!\n");
            }
        } while (tahun != 2023);
        // output tahun

        // input bulan
        do {
            System.out.print("Masukan Bulan Pemesanan (1-12): ");
            bulan = sc.nextInt();
            namaBulanFormBooking = ""; // Reset namaBulanFormBooking di setiap iterasi

            switch (bulan) {
                case 1:
                    namaBulanFormBooking = "Januari";
                    break;
                case 2:
                    namaBulanFormBooking = "Februari";
                    break;
                case 3:
                    namaBulanFormBooking = "Maret";
                    break;
                case 4:
                    namaBulanFormBooking = "April";
                    break;
                case 5:
                    namaBulanFormBooking = "Mei";
                    break;
                case 6:
                    namaBulanFormBooking = "Juni";
                    break;
                case 7:
                    namaBulanFormBooking = "Juli";
                    break;
                case 8:
                    namaBulanFormBooking = "Agustus";
                    break;
                case 9:
                    namaBulanFormBooking = "September";
                    break;
                case 10:
                    namaBulanFormBooking = "Oktober";
                    break;
                case 11:
                    namaBulanFormBooking = "November";
                    break;
                case 12:
                    namaBulanFormBooking = "Desember";
                    break;
                default:
                    System.out.println("Bulan yang Anda Masukan Salah!\n");
                    break;
            }
        } while (bulan < 1 || bulan > 12);
        // output bulan

        // Input tanggal
        int maxTanggal = 31;
        if (bulan == 2) {
            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                maxTanggal = 29;
            } else {
                maxTanggal = 28;
            }
        } else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            maxTanggal = 30;
        }
        do {
            System.out.print("Masukan Tanggal Pemesanan (1-" + maxTanggal + "): ");
            tanggal = sc.nextInt();
            if (tanggal < 1 || tanggal > maxTanggal) {
                System.out.println("Tanggal yang Anda Masukan Salah untuk Bulan " + namaBulanFormBooking + "!\n");
            }
        } while (tanggal < 1 || tanggal > maxTanggal);
        // output tanggal

        // input waktu
        do {
            System.out.print("Masukan Waktu Mulai Pesanan (format 24 jam): ");
            waktu = sc.nextInt();
            if (waktu < 0 || waktu >= 24) {
                System.out.println("Waktu yang Anda Masukan Salah!\n");
            }
        } while (waktu < 0 || waktu >= 24);

        ampm = waktu < 12 ? "AM" : "PM";
        if (waktu > 12)
            waktu -= 12; // Konversi ke format 12 jam
        // output waktu

        // input durasi
        do {
            System.out.print("Masukan Durasi Pemesanan (Jam, 1-24): ");
            jam = sc.nextInt();
            sc.nextLine();

            if (jam < 1 || jam > 24) {
                System.out.println("Durasi yang Anda Masukan Salah!\n");
            }
        } while (jam < 1 || jam > 24);
        // output durasi

        // output hasil
        System.out.println(
                "\nAnda Telah Memulai Pemesanan Ruangan pada " + tanggal + " " + namaBulanFormBooking + " " + tahun + ""
                        + " Pada Jam "
                        + waktu + " " + ampm + " Dengan Durasi Pemesanan " + jam + " Jam");
        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================");

        // output form booking

        // input layanan
        System.out.println("Layanan a");
        System.out.println("Layanan b");
        System.out.println("Layanan c");

        System.out.print("Pilih Layanan yang Ingin Dipesan (a/b/c): ");
        String layanan = sc.next();

        String a = "a";
        String b = "b";
        String c = "c";

        switch (layanan) {
            case "a":
                System.out.println("Jenis Layanan yang Dipilih adalah Layanan " + a);
                break;
            case "b":
                System.out.println("Jenis Layanan yang Dipilih adalah Layanan " + b);
                break;
            case "c":
                System.out.println("Jenis Layanan yang Dipilih adalah Layanan " + c);
                break;
            default:
                System.out.println("Anda Tidak Memilih Layanan Apapun");
                break;
        }
        // output layanan

        // input fasilitas
        System.out.println("\nFasilitas a");
        System.out.println("Fasilitas b");
        System.out.println("Fasilitas c");

        System.out.print("Pilih Faasilitas yang Ingin Dipesan (a/b/c): ");
        String fasilitas = sc.next();

        String a1 = "a";
        String b1 = "b";
        String c1 = "c";

        switch (fasilitas) {
            case "a":
                System.out.println("Jenis Fasilitas yang Dipilih adalah Fasilitas " + a1);
                break;
            case "b":
                System.out.println("Jenis Fasilitas yang Dipilih adalah Fasilitas " + b1);
                break;
            case "c":
                System.out.println("Jenis Fasilitas yang Dipilih adalah Fasilitas " + c1);
                break;
            default:
                System.out.println("Anda Tidak Memilih Fasilitas Apapun");
                break;
        }
        // output fasilitas

        // input informasi resepsionis
        System.out.println(
                "\n\nData Anda Telah Tersimpan Jika Ada Kendala Saat Memesan Ruangan Silahkan Menghubungi Kontak Resepsionis yang ada Dibawah Ini");
        String resepsionis = "6281234567890";
        System.out.println("\nInformasi Kontak Resepsionis +" + resepsionis);
        // output informasi resepsionis

        // output form booking

        System.out.println("\n==================================================");
        System.out.println("=                 List Booking                   =");
        System.out.println("==================================================\n");

        int listRuang;
        Boolean isListRuang = false;
        Boolean isDetailRuang = false;

        while (!isListRuang) {

            System.out.println("List Ruangan yang Tersedia Hari Ini\n");
            System.out.println("Ruangan 1 ");
            System.out.println("Ruangan 2");
            System.out.println("Ruangan 3");
            System.out.print("Silahlkan Masukan Pilihan Ruangan (1/2/3): ");
            listRuang = sc.nextInt();

            switch (listRuang) {
                case 1:
                case 2:
                case 3:
                    isListRuang = true;
                    break;
                default:
                    System.out.println("Input yang anda masukan salah!\n");
                    continue;
            }

            while (!isDetailRuang) {

                System.out.println("\nDetail ruangan " + listRuang);
                System.out.print("Apakah Anda Ingin Melihat Detail Ruangan " + listRuang + " (y/t)?: ");
                String detail = sc.next();

                if (detail.equalsIgnoreCase("y")) {
                    switch (listRuang) {
                        case 1:
                            System.out.println("Detail Ruangan 1\n");
                            break;
                        case 2:
                            System.out.println("Detail Ruangan 2\n");
                            break;
                        case 3:
                            System.out.println("Detail Ruangan 3\n");
                            break;
                        default:
                            System.out.println("Pilihan Ruangan Tidak Valid\n");
                            break;
                    }
                    isDetailRuang = true;
                } else if (detail.equalsIgnoreCase("t")) {
                    System.out.println("Anda tidak jadi melihat detail ruangan.\n");
                    isDetailRuang = true;
                } else {
                    System.out.println("Input yang anda masukan salah, silahkan coba lagi!");
                }
            }
        }

        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");

        // input reservasi ruangan rapat

        System.out.println("\n==================================================");
        System.out.println("=        Reservasi Ruangan Rapat                 =");
        System.out.println("==================================================\n");

        int ruangRapat = 0;
        Boolean isResRapat = false;

        while (!isResRapat) {

            System.out.print("Apakah Anda ingin Memulai Reservasi Ruangan Rapat? (y/t): ");
            String resRapat = sc.next();
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

        // input Checkin
        System.out.println("\n==================================================");
        System.out.println("=                    Checkin                     =");
        System.out.println("==================================================\n");
        int tahunCheckin, bulanCheckin, tanggalCheckin, waktuCheckin;
        String namaBulanCheckin = "";
        String ampmCheckin;

        // Input tahun
        do {
            System.out.print("Masukan Tahun Checkin (YYYY): ");
            tahunCheckin = sc.nextInt();
            if (tahunCheckin == 2023) {
            } else {
                System.out.println("Tahun Checkin yang Anda Masukan Tidak Valid!\n");
            }
        } while (tahunCheckin != 2023);
        // output tahun checkin harus 2023

        // input bulan checkin
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
                    System.out.println("Bulan yang Anda Masukan Salah!");
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

        System.out.println("\nCheckin Sukses");

        System.out.println(
                "Anda Memulai Checkin Pada " + " " + tanggalCheckin + " " + namaBulanCheckin + " "
                        + tahunCheckin +
                        " Pada Jam "
                        + waktuCheckin + " " + ampmCheckin);

        // input layanan pelanggan
        System.out.println("Jika ada Permasalahan Saat Checkin Silahkan Hubungi Nomer Berikut +" + resepsionis + "\n");
        // output layanan pelanggan

        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");
        // output checkin

        System.out.println("\n==================================================");
        System.out.println("=                Payment Methode                 =");
        System.out.println("==================================================\n");

        // array pilihan pembayaran
        String[] paymentMethods = {
                "M-Banking",
                "Kartu Kredit/Debit",
                "Offline Payment",
                "Bank Transfer"
        };

        // array pilihan bank
        String[] bankOptions = { "Bank CBA", "Bank ABC", "Bank ACB" };

        // array pilihan kartu
        String[] cardOptions = { "Kartu kredit", "Kartu debit" };

        // input type data dan variable
        String konfirmasiPembayaran;
        int pilihanBank;
        int pilihanKartu;
        int payMethod;
        String instruksiPembayaran = "";

        // for panjang array yaitu 4
        for (int i = 0; i < paymentMethods.length; i++) {
            System.out.println((i + 1) + ". " + paymentMethods[i]);
        }

        // input user
        System.out.print("Pilih Metode Pembayaran (1-" + paymentMethods.length + "): ");
        payMethod = sc.nextInt();

        // switch case pilihan pembayaran
        switch (payMethod) {

            // input 1 (m-banking)
            case 1:
                System.out.println("\n");
                for (int i = 0; i < bankOptions.length; i++) {
                    System.out.println((i + 1) + ". " + bankOptions[i]);
                }
                System.out.print("Pilih Bank:");
                pilihanBank = sc.nextInt();
                instruksiPembayaran = "Silahkan transfer m-banking " + bankOptions[pilihanBank - 1]
                        + " pada nomor rekening 1234567890123456";
                break;

            // input 2 (kartu kredit/debit)
            case 2:
                System.out.println("\n");
                for (int i = 0; i < cardOptions.length; i++) {
                    System.out.println((i + 1) + ". " + cardOptions[i]);
                }
                System.out.print("Pilih Jenis Kartu:");
                pilihanKartu = sc.nextInt();
                instruksiPembayaran = "Silahkan lakukan pembayaran menggunakan " + cardOptions[pilihanKartu - 1]
                        + " Anda";
                break;

            // input 3 (pembayaran offline)
            case 3:
                instruksiPembayaran = "Anda memilih pembayaran offline. Silahkan siapkan uang Anda saat melakukan checkin";
                break;

            // input 4 (bank transfer)
            case 4:
                System.out.println("\n");
                for (int i = 0; i < bankOptions.length; i++) {
                    System.out.println((i + 1) + ". " + bankOptions[i]);
                }
                System.out.print("Pilih Bank:");
                pilihanBank = sc.nextInt();
                instruksiPembayaran = "Silahkan transfer ke " + bankOptions[pilihanBank - 1]
                        + " pada nomor rekening 1234567890123456";
                break;

            // input selain 1-4
            default:
                System.out.println("Pilihan pembayaran yang Anda masukan salah, silahkan coba lagi!");
                return;
        }

        // loop konfirmasi pembayaran
        Boolean isKonfirmasiPembayaran = false;
        while (!isKonfirmasiPembayaran) {

            // input user (y/t)
            System.out.print("\nApakah Anda yakin dengan metode pembayaran ini? (y/t): ");
            konfirmasiPembayaran = sc.next();

            // ketika user memilih y
            if (konfirmasiPembayaran.equalsIgnoreCase("y")) {
                System.out.println(instruksiPembayaran);
                isKonfirmasiPembayaran = true;
            }

            // ketika user memilih t
            else if (konfirmasiPembayaran.equalsIgnoreCase("t")) {
                System.out.println("\nPembayaran dibatalkan.");
                isKonfirmasiPembayaran = true;
            }

            // ketika user memilih selain y/t
            else {
                System.out.println("Input yang anda masukan salah!");
            }
        }
        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");

        // output payment methode

        System.out.println("\n==================================================");
        System.out.println("=                   Checkout                     =");
        System.out.println("==================================================\n");

        // input waktu checkout
        int waktuCheckout;
        String ampmCheckout;
        do {
            System.out.print("Masukan Waktu Checkout (format 24 jam): ");
            waktuCheckout = sc.nextInt();
            if (waktuCheckout < 0 || waktuCheckout >= 24) {
                System.out.println("WaktuCheckout yang Anda Masukan Salah!\n");
            }
        } while (waktuCheckout < 0 || waktuCheckout >= 24);

        ampmCheckout = waktuCheckout < 12 ? "AM" : "PM";
        if (waktuCheckout > 12)
            waktuCheckout -= 12;

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

        System.out.println("Anda Telah Checkout Pada Jam " + waktuCheckout + " " + ampmCheckout);

        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");

        // input penilaian dan feedback
        int feedbackLimit = 1;
        String[] arrayFeedback = new String[feedbackLimit];
        int inputFeedback = 0;

        // input penilaian dan feedback
        String feedback = "";
        String penilaian = "";
        boolean validInput = false;

        System.out.println("\n==================================================");
        System.out.println("=            Penilaian dan feedback              =");
        System.out.println("==================================================\n");

        // input penilaian user
        while (!validInput) {

            System.out.println("Silahkan Beri Nilai Kepuasan Anda Terhadap Aplikasi Ini (1-5)");
            System.out.println("1 = Sangat Tidak Puas");
            System.out.println("2 = Tidak Puas");
            System.out.println("3 = Biasa Saja");
            System.out.println("4 = Puas");
            System.out.println("5 = Sangat Puas");
            System.out.print("Masukan Penilaian Anda: ");
            penilaian = sc.next();

            // penilaian harus bernilai 1-5
            if (penilaian.equals("1") || penilaian.equals("2") || penilaian.equals("3") || penilaian.equals("4")
                    || penilaian.equals("5")) {
                validInput = true;
                // penilaian selain 1-5
            } else {
                System.out.println("Input yang Anda Masukan Salah! Harap masukkan angka antara 1-5.\n");
            }
        }

        // input feedback kepuasan pengguna
        System.out.print("Silahkan berikan feedback Anda: ");
        feedback = sc.next();
 
        if (inputFeedback < feedbackLimit) {

            System.out.println("\nFeedback Anda Telah Tersimpan");
            System.out.println("Terimakasih telah memberikan penilaian dan feedback pada aplikasi kami");
            // feedback disimpan di array
            arrayFeedback[inputFeedback] = feedback;
            inputFeedback++;

            // feedback telah lebih dimasukan satu kali
        } else {
            System.out.println("\nMaaf anda hanya dapat memasukan feedback 1 kali saja!");
            System.out.println("Terimakasih telah memberikan penilaian pada aplikasi kami");
        }

        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");

    }
}
