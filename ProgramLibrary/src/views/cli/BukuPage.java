package views.cli;

import java.util.Scanner;

import entity.BukuEntity;
import entity.PenerbitEntity;
import entity.PengarangEntity;
import entity.StaffEntity;
import models.Buku;
import models.Staff;

public class BukuPage extends Buku {
    private Scanner input = new Scanner(System.in);

    private void lihatBuku(BukuEntity buku) {
        PengarangEntity pengarang = buku.getPengarang();
        PenerbitEntity penerbit = buku.getPenerbit();

        System.out.println("---------------------------------------");
        System.out.println("ID Buku        : " + buku.getIdBuku());
        System.out.println("Judul Buku     : " + buku.getJudulBuku());
        System.out.println("Jumlah Halaman : " + buku.getJmlHalaman());
        System.out.println("Genre Buku     : " + buku.getGenreBuku());
        if (pengarang != null) {
            System.out.println("Nama Pengarang   : " + pengarang.getNama());
        } else {
            System.out.println("Nama Pengarang   : Tidak diketahui");
        }
        if (penerbit != null) {
            System.out.println("Penerbit       : " + penerbit.getNama());
        } else {
            System.out.println("Penerbit       : Tidak diketahui");
        }
        System.out.println("Tanggal Terbit : " + buku.getTahunTerbit());
        System.out.println("---------------------------------------");

    }

    private void lihatBuku(int index) {
        BukuEntity buku = new BukuEntity();
        PengarangEntity pengarang = buku.getPengarang();
        PenerbitEntity penerbit = buku.getPenerbit();

        System.out.println("---------------------------------------");
        System.out.println("ID Buku        : " + buku.getIdBuku());
        System.out.println("Judul Buku     : " + buku.getJudulBuku());
        System.out.println("Jumlah Halaman : " + buku.getJmlHalaman());
        System.out.println("Genre Buku     : " + buku.getGenreBuku());
        if (pengarang != null) {
            System.out.println("Nama Pengarang   : " + pengarang.getNama());
        } else {
            System.out.println("Nama Pengarang   : Tidak diketahui");
        }
        if (penerbit != null) {
            System.out.println("Penerbit       : " + penerbit.getNama());
        } else {
            System.out.println("Penerbit       : Tidak diketahui");
        }
        System.out.println("Tanggal Terbit : " + buku.getTahunTerbit());
        System.out.println("---------------------------------------");

    }

    public void lihatBuku() {
        System.out.println("============== LIHAT BUKU =============");
        for (BukuEntity buku : Buku.bukuList) {
            lihatBuku(buku);
        }
        System.out.println("=======================================");

        System.out.print("Lanjut ...");
        input.nextLine();
        System.out.println();
    }

    public void tambahBuku() {
        String judulBuku;
        int jmlHalaman;
        String genreBuku;
        String tahunTerbit;

        PengarangEntity pengarang = null;
        PenerbitEntity penerbit = null;

        System.out.println("============== TAMBAH BUKU ============");
        System.out.print("Judul Buku        : ");
        judulBuku = input.nextLine();

        System.out.print("Jumlah Halaman    : ");
        jmlHalaman = input.nextInt();

        input.nextLine();

        System.out.print("Genre Buku      :");
        genreBuku = input.nextLine();
        
        System.out.print("Tanggal Terbit    : ");
        tahunTerbit = input.nextLine();

        System.out.print("Masukan Pengarang (y/n) ? ");
        char masukanPengarang = input.nextLine().charAt(0);

        if (masukanPengarang == 'y') {
            String namaPengarang;
            String emailPengarang;
            System.out.print("  Nama Pengarang    : ");
            namaPengarang = input.nextLine();
            System.out.print(" Email Pengarang  : ");
            emailPengarang = input.nextLine();
            pengarang = new PengarangEntity(namaPengarang, emailPengarang);
        }

        System.out.print("Masukan Penerbit (y/n) ? ");
        char masukanPenerbit = input.nextLine().charAt(0);

        if (masukanPenerbit == 'y') {
            String namaPenerbit, alamatPenerbit;

            System.out.print("  Nama Penerbit   : ");
            namaPenerbit = input.nextLine();

            System.out.print("  Alamat Penerbit : ");
            alamatPenerbit = input.nextLine();

            penerbit = new PenerbitEntity(namaPenerbit, alamatPenerbit);
        }

        BukuEntity bukuBaru = new BukuEntity(judulBuku, jmlHalaman, genreBuku, tahunTerbit, pengarang, penerbit, true);

        Buku.tambahBuku(bukuBaru);

        System.out.println("Berhasil Menambahkan Buku");

        System.out.println("=======================================");

        System.out.print("Lanjut ...");
        input.nextLine();
        System.out.println();
    }

    public void editBuku(BukuEntity buku, int pilihEdit) {
        switch (pilihEdit) {
            case 1:
                String judulBukuBaru;
                System.out.println("Judul Buku          : " + buku.getJudulBuku());
                System.out.print("Masukan Judul Baru  : ");
                judulBukuBaru = input.nextLine();
                buku.setJudulBuku(judulBukuBaru);
                break;

            case 2:
                int jmlHalaman;
                System.out.println("Jumlah Halaman              : " + buku.getJmlHalaman());
                System.out.print("Masukan Jumlah Halaman Baru : ");
                jmlHalaman = input.nextInt();
                input.nextLine();
                buku.setJmlHalaman(jmlHalaman);
                break;

            case 3:
                String genreBuku;
                System.out.println("Genre Buku              : " + buku.getGenreBuku());
                System.out.print("Masukan Genre Baru : ");
                genreBuku = input.nextLine();

                buku.setGenreBuku(genreBuku);
                break;

            case 4:
                String thnTerbit;
                System.out.println("Tahun Terbit            : " + buku.getTahunTerbit());
                System.out.print("Masukan Tahun Terbit Baru : ");
                thnTerbit = input.nextLine();

                buku.setTahunTerbit(thnTerbit);
                break;

        }

        Buku.updateBuku(buku);
        System.out.println("Berhasil Mengubah Data Buku");

        System.out.print("Lanjut ...");
        input.nextLine();
        System.out.println();
    }

    public void editBuku(BukuEntity buku) {
        System.out.println("---------------------------------------");
        System.out.println("Ingin mengubah apa ? ");

        int pilihEdit;
        System.out.print("""
                1. Judul Buku
                2. Jumlah Halaman
                3. Genre Buku
                4. Tanggal Terbit
                0. Selesai
                Pilih: """);
        pilihEdit = input.nextInt();
        input.nextLine();

        editBuku(buku, pilihEdit);
        System.out.println("---------------------------------------");

    }

    public void editBuku() {
        int idKoleksi;

        System.out.println("=============== EDIT BUKU =============");

        System.out.print("Masukan ID Buku: ");
        idKoleksi = input.nextInt();
        input.nextLine();

        BukuEntity buku = Buku.findBukuById(idKoleksi);

        if (buku != null) {
            editBuku(buku);
        } else {
            System.out.println("Data Buku Tidak Ditemukan !");
        }

        System.out.println("=======================================");
    }

    private void hapusBuku(int i) {
        System.out.println("=============== KONFIRMASI ============");

        lihatBuku(i);

        System.out.print("Ingin Menghapus Buku ini ? (y/n) ");
        char konf = input.nextLine().charAt(0);

        if (konf == 'y') {
            Buku.deleteBuku(i);
        }

    }

    public void hapusBuku() {
        int idKoleksi;

        System.out.println("============== HAPUS  BUKU ============");

        System.out.print("Masukan ID Buku: ");
        idKoleksi = input.nextInt();
        input.nextLine();

        BukuEntity buku = Buku.findBukuById(idKoleksi);

        if (buku != null) {
            hapusBuku(idKoleksi);
        } else {
            System.out.println("Data Buku Tidak Ditemukan !");
        }

        System.out.println("=======================================");
    }

    public void cariBukuByTitle() {

        System.out.print("Masukkan Judul Buku : ");
        String judulBuku = input.nextLine();
        BukuEntity buku = Buku.findBukuByTitle(judulBuku);
        if (buku != null) {
            lihatBuku(buku);
        } else {
            System.out.println("Data Buku Tidak Ditemukan !");
        }
    }

    public void cariBukuById() {

        System.out.print("Masukkan Id Buku : ");
        int idBuku = input.nextInt();
        input.nextLine();
        BukuEntity buku = Buku.findBukuById(idBuku);
        if (buku != null) {
            lihatBuku(buku);
        } else {
            System.out.println("Data Buku Tidak Ditemukan !");
        }
    }

    public void filterBuku() {

        System.out.print("Masukkan genre Buku : ");
        String genre = input.nextLine();

        BukuEntity buku = Buku.filterBukuByGenre(genre);
        if (buku != null) {
            lihatBuku(buku);
        } else {
            System.out.println("Data Buku Tidak Ditemukan !");
        }

    }

    public void cariStaff() {

        System.out.print("Masukkan username Staff : ");
        String username = input.nextLine();
        StaffEntity staff = Staff.findStaff(username);
        if (staff != null) {
            System.out.println(staff.getNama());
        } else {
            System.out.println("Data Staff Tidak Ditemukan !");
        }
    }

   

}