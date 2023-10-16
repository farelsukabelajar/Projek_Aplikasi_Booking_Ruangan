import java.util.Scanner;

public class AplikasiBookingRuangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input login
        System.out.println("======= Login di Aplikasi Booking Ruangan =======\n");

        String username = "admin1";
        String password = "admin";
        Boolean loginApk = false;

        while (!loginApk) {
            System.out.print("Masukan Username Anda : ");
            String usernameIn = sc.next();
            System.out.print("Masukan Password Anda : ");
            String passwordIn = sc.next();

            if (usernameIn.equals(username) && passwordIn.equals(password)) {
                loginApk = true;
            } else {
                System.out.println("\n======= Username atau Password yang anda masukan salah =======");
                System.out.println("======= Silahkan Masukan Username dan Password anda kembali =======\n");
            }
        }
        if (loginApk) {
            System.out.println("\nLogin Berhasil");
            System.out.println("Selamat Datang " + username + " di Aplikasi Booking Ruangan");
            System.out.println("======= [System] =======\n");
        }
        // output login

        // input form booking

        // input data diri
        System.out.println("=================================");
        System.out.println("=\tMasuk ke Form Booking\t=");
        System.out.println("=================================");
        System.out.println("=  Silahkan Isi Data Diri Anda  =");
        System.out.println("=================================");
        System.out.print("Nama: ");
        String inputNama = sc.next();

        if (inputNama.equals(username)) {
            System.out
                    .println("\nSelamat Datang " + inputNama + " Silahkan Mengisi Tanggal dan Waktu Pemesanan Anda\n");
        } else {
            System.out.println("Silahkan Mengisi Nama Anda Sesuai dengan Username\n");
        }
        // output data diri

        // input tanggal dan waktu pemesanan
        System.out.print("Masukan Tahun Pemesanan (YYYY): ");
        int tahun = sc.nextInt();
        System.out.print("Masukan Bulan Pemesanan: ");

        // input bulan pemesanan
        int bulan = sc.nextInt();
        switch (bulan) {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Agustus");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Desember");
                break;

            default:
                System.out.println("Bulan yang Anda Masukan Salah!");
                break;
        }
        // output bulan pemesanan

        // input tanggal dan waktu pemesanan
        System.out.print("Masukan Tanggal Pemesanan: ");
        int tanggal = sc.nextInt();
        if (tanggal <= 31) {
            System.out.println("T");
        } else {
            System.out.println("Tanggal yang Anda Masukan Salah! ");
        }

        System.out.print("Masukan Waktu Mulai Pesanan: ");
        int waktu = sc.nextInt();
        if (waktu <= 12) {
            System.out.println("Am");
        } else if (waktu <= 24) {
            System.out.println("Pm");
        } else {
            System.out.println("Waktu yang Anda Masukan Salah! ");
        }
        System.out.print("Masukan Durasi Pemesanan (Jam): ");
        int jam = sc.nextInt();
        System.out.print("\nAnda Telah Memulai Pemesanan Ruangan pada Tahun " + tahun + " Bulan " + bulan + " Tanggal "
                + tanggal + " Dengan Waktu Mulai dari Jam "
                + waktu + " WIB" + " Dengan Durasi " + jam + " Jam\n\n");
        // output tanggal dan waktu pemesanan

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
        System.out.println("\n\nFasilitas a");
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

        // input list booking ruangan
        System.out.println("\n======= List Booking Ruangan =======\n");

        // input detail ruangan
        System.out.println("Ruangan 1 ");
        System.out.println("Ruangan 2");
        System.out.println("Ruangan 3");
        System.out.print("Silahlkan Masukan Pilihan Ruangan (1/2/3): ");
        int ruang = sc.nextInt();
        sc.nextLine();

        System.out.println("\n======= Detail Ruangan =======\n");
        System.out.print("Lihat Detail Ruangan (y/t)?: ");
        String detail = sc.nextLine();

        if (detail.equalsIgnoreCase("y")) {
            switch (ruang) {
                case 1:
                    System.out.println("Detail Fasilitas 1 = \n");
                    break;
                case 2:
                    System.out.println("Detail Fasiliitas 2 = \n");
                    break;
                case 3:
                    System.out.println("Detail Fasilitas 3 = \n");
                    break;
                default:
                    System.out.println("Pilihan Ruangan Tidak Valid\n");
                    break;
            }
        } else {
            System.out.println("Anda Memilih Untuk Tidak Melihat Detail\n");
        }
        // output detail ruangan
        // output list booking ruangan

        // input reservasi ruangan rapat
        System.out.println("======= Selamat Datang di Reservasi Ruangan Rapat =======");
        System.out.print("Apakah Anda ingin Memulai Reservasi Ruangan Rapat? (y/t): ");
        String resRapat = sc.nextLine();
        if (resRapat.equalsIgnoreCase("y")) {
            System.out.println("Silahkan Pilih Ruangan Rapat");

            System.out.println("Ruangan Rapat 1");
            System.out.println("Ruangan Rapat 2");
            System.out.println("Ruangan Rapat 3");
            System.out.print("Pilih Ruangan Rapat (1/2/3): ");
            int ruangRapat = sc.nextInt();

            switch (ruangRapat) {
                case 1:
                    System.out.println("Anda Memilih Ruang Rapat 1");
                    break;
                case 2:
                    System.out.println("Anda Memilih Ruang Rapat 2");
                    break;
                case 3:
                    System.out.println("Anda Memilih Ruang Rapat 3");
                    break;
                default:
                    System.out.println("Input yang Anda Masukan Tidak Valid");
                    break;
            }
        } else {
            System.out.println(
                    "Anda Tidak Memilih Reservasi Ruangan Rapat, Silahkan Lanjutkan untuk Menyelesaikan Pembayaran Anda");
        }
        // output reservasi ruangan rapat

        // input check in
        System.out.println("\n======= Mulai Checkin =======");

        System.out.println("Mulai Checkin (YYYY-MM-DD HH:mm)");
        System.out.print("Apakah Anda Ingin Memulai Checkin? (y/t): ");
        String checkIn = sc.next();
        if (checkIn.equalsIgnoreCase("y")) {
            System.out.println("Anda Akan Memulai Checkin");
        } else {
            System.out.println("Anda Tidak Jadi Checkin");
        }
        System.out.print("Masukan Tahun checkin (YYYY): ");
        int tahunCheckin = sc.nextInt();

        System.out.print("Masukan Bulan Checkin: ");
        int bulanCheckin = sc.nextInt();

        switch (bulanCheckin) {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Agustus");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Desember");
                break;

            default:
                System.out.println("Bulan yang Anda Masukan Salah!");
                break;
        }

        System.out.print("Masukan Tanggal Checkin: ");

        int tanggalCheckin = sc.nextInt();
        if (tanggalCheckin <= 31) {
            System.out.println("T");
        } else {
            System.out.println("Tanggal yang Anda Masukan Salah! ");
        }

        System.out.print("Masukan Jam Checkin: ");
        int jamCheckin = sc.nextInt();
        if (jamCheckin <= 12) {
            System.out.println(" Am");
        } else if (jamCheckin <= 24) {
            System.out.println(" Pm");
        } else {
            System.out.println("Waktu yang Anda Masukan Salah! ");
        }

        System.out.println("Anda Akan Checkin Pada Tanggal " + tanggalCheckin + " Bulan " + bulanCheckin + " Tahun "
                + tahunCheckin + " dan Pada Jam " + jamCheckin);

        // output checkin

        // input layanan pelanggan
        System.out.println("Jika ada Permasalahan Saat Checkin Silahkan Hubungi Nomer Berikut +" + resepsionis);
        // output layanan pelanggan

        // input payment methode
        System.out.println("\n======= Payment Methode =======");
        System.out.println("a. M-Banking");
        System.out.println("b. Kartu Kredit/Debit");
        System.out.println("c. E-Wallet");
        System.out.println("d. Offline Payment");
        System.out.println("Pilih Methode Pembayaran (a/b/c/d)");
        String payMethode = sc.next();

        String pay1 = "a";
        String pay2 = "b";
        String pay3 = "c";
        String pay4 = "d";

        switch (payMethode) {
            case "a":
                System.out.println("Silahkan Membayar Di Nomer Rekening ini 0123827392819276");
                break;
            case "b":
                System.out.println("Silahkan Membayar Memakai Kartu Kredit/Debit Anda");
                break;
            case "c":
                System.out.println("Silahkan Membayar Memakai E-Wakket");
                break;
            case "d":
                System.out.println("Silahkan Membayar Saat Telah Sampai Dilokasi");
                break;
            default:
                System.out.println("Pembayaran Tidak Valid");
                break;
        }
        // output payment methode

        // input checkout
        System.out.println("\n======= Checkout dari ruangan =======");
        System.out.print("Apakah Anda Yakin Ingin Checkout (y/t)?: ");
        String checkOut = sc.next();
        if (checkOut.equalsIgnoreCase("y")) {
            System.out.println("Anda Telah Mengkonfirmasi Checkout");
        } else {
            System.out.println("Anda Tidak Jadi Checkout");
        }

        System.out.println("Silahkan untuk Mengisi Waktu Checkout: ");
        int checkoutTime = sc.nextInt();

        if (checkoutTime <= 12) {
            System.out.println("Am");
        } else if (checkoutTime <= 24) {
            System.out.println("Pm");
        } else {
            System.out.println("Waktu yang Anda Masukan Salah! ");
        }
        // output checkout

        // input layanan pelanggan checkout
        System.out.println("Jika ada Permasalahan Saat Checkout Silahkan Hubungi Nomer Berikut +" + resepsionis);
        // output layanan pelanggan checkout

        // input penilaian pelanggan

        System.out.println("Silahkan Beri Nilai Kepuasan Anda Terhadap Aplikasi Ini (1-5)");
        System.out.println("1 = Sangat Tidak Puas");
        System.out.println("2 = Tidak Puas");
        System.out.println("3 = Biasa Saja");
        System.out.println("4 = Puas");
        System.out.println("5 = Sangat Puas");
        System.out.println("Masukan Penilaian Anda: ");
        int penilaian = sc.nextInt();

        switch (penilaian) {
            case 1:
                System.out.println("Anda Sangat Tidak Puas Terhadap Aplikasi Kami");
                break;
            case 2:
                System.out.println("Anda Tidak Puas Terhadap Aplikasi Kami");
                break;
            case 3:
                System.out.println("Anda Biasa Saja Terhadap Aplikasi Kami");
                break;
            case 4:
                System.out.println("Anda Puas Terhadap Aplikasi Kami");
                break;
            case 5:
                System.out.println("Anda Sangat Puas Terhadap Aplikasi Kami");
                break;
            default:
                System.out.println("Input yang Anda Masukan Salah!");
                break;
        }
        System.out.println("Terimakasih Telah Memberi Peninilai Terhadap Aplikasi Kami");
        // output penilaian pelanggan
    }
}