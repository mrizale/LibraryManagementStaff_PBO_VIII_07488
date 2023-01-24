package entity;

import models.Buku;
/**
 *
 * @author MOCH RIZAL AKIRUDIN
 */
public class BukuEntity extends BukuTerdaftarEntity {
    // Attribut Class buku
    private String judulBuku;
    private int jmlHalaman;
    private String genreBuku;
    private String tahunTerbit;
    private PengarangEntity pengarang;
    private PenerbitEntity penerbit;

    public BukuEntity() {

    }

    // Cnstructor dengan parameter
    public BukuEntity(String judulBuku, int jmlHalaman, String genreBuku, String tanggalTerbit, boolean status) {

        idBukuBaru();
        this.judulBuku = judulBuku;
        this.jmlHalaman = jmlHalaman;
        this.genreBuku = genreBuku;
        this.tahunTerbit = tahunTerbit;
        this.status = status;

    }

    public BukuEntity(String judulBuku,
        int jmlHalaman, String genreBuku, String tanggalTerbit,
        PengarangEntity pengarang, PenerbitEntity penerbit, boolean status) {
        idBukuBaru();
        this.judulBuku = judulBuku;
        this.jmlHalaman = jmlHalaman;
        this.genreBuku = genreBuku;
        this.tahunTerbit = tanggalTerbit;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.status = status;
    }


    private void idBukuBaru() {

        if (Buku.bukuList.isEmpty()) {
            // Jika ArrayList buku MASIH Kosong,
            // maka atur idBuku menjadi 1
            this.idBuku = 1;
        } else {
            // Jika ArrayList Buku TIDAK Kosong, maka

            // Ambil index Terakhir dalam List
            int indexTerakhirDalamList = Buku.bukuList.size() - 1;

            // Ambil Object Buku dalam List berdasarkan indexnya.
            BukuEntity bukuTerakhirDalamList = Buku.bukuList.get(indexTerakhirDalamList);

            // Ambil idBuku pada Object Buku terakhir
            int idBukuTerakhir = bukuTerakhirDalamList.idBuku;

            // Id Buku yang baru
            this.idBuku = idBukuTerakhir + 1;
        }
    }

    // Method
    public void dataBuku() {
        System.out.println("ID buku  :" + idBuku);
        System.out.println("Judul Buku  : " + judulBuku);
        System.out.println("jumlah halaman : " + jmlHalaman);
        System.out.println("Genre Buku  : " + genreBuku);
        System.out.println("Tahun terbit : " + tahunTerbit);
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public int getJmlHalaman() {
        return jmlHalaman;
    }

    public void setJmlHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public PengarangEntity getPengarang() {
        return pengarang;
    }

    public void setPengarang(PengarangEntity pengarang) {
        this.pengarang = pengarang;
    }

    public PenerbitEntity getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(PenerbitEntity penerbit) {
        this.penerbit = penerbit;
    }

    public String getGenreBuku() {
        return genreBuku;
    }

    public String getNamaPengarang() {
        return pengarang.getNama();
    }

    public String getEmailPengarang() {
        return pengarang.getEmailPengarang();
    }

    public String getAlamatPenerbit() {
        return penerbit.getAlamatPenerbit();
    }

    public String getNamaPenerbit() {
        return penerbit.getNama();
    }

    public void setGenreBuku(String genreBuku) {
        this.genreBuku = genreBuku;
    }


}
