package views.gui.home;

import java.awt.Font;
import javax.swing.*;

import entity.*;
import views.gui.MainFrame;
import views.gui.home.*;

public class LihatBukuFrame extends MainFrame {
    private JLabel titleLabel;
    private JLabel namaBukuLabel;
    private JLabel halamanBukuLabel;
    private JLabel genreBukuLabel;
    private JLabel tahunTerbitLabel;
    private JLabel pengarangLabel;
    private JLabel namaPengarangLabel, namaPenerbitLabel, emailPengarangLabel, alamatPenerbitLabel;
    private JTextField namaPengarangField, namaPenerbitField, emailPengarangField, alamatPenerbitField;
    private JLabel penerbitLabel;
    private JTextField namaBukuField, halamanField, genreField, tahunField;
    private JButton tutupBtn;

    PengarangEntity pengarang = null;
    PenerbitEntity penerbit = null;
    DashboardFrame _dashboardF = new DashboardFrame();
    private BukuEntity _bukuC;

    public LihatBukuFrame(BukuEntity buku) {
        super("LIHAT BUKU", 400, 600);
        this._bukuC = buku;

    }

    @Override
    protected void component() {

        titleLabel = new JLabel("LIHAT BUKU");
        setFontSize(titleLabel, 32);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 102, 42, 195, 39);

        namaBukuLabel = new JLabel("Judul");
        setFontSize(namaBukuLabel, 15);
        setFontStyle(namaBukuLabel, Font.BOLD);
        boundedAdd(namaBukuLabel, 19, 112, 71, 23);

        namaBukuField = new JTextField(_bukuC.getJudulBuku());
        namaBukuField.setEditable(false);
        boundedAdd(namaBukuField, 19, 135, 355, 24);

        halamanBukuLabel = new JLabel("Jumlah Halaman");
        setFontSize(halamanBukuLabel, 15);
        setFontStyle(halamanBukuLabel, Font.BOLD);
        boundedAdd(halamanBukuLabel, 19, 167, 71, 23);

        halamanField = new JTextField(String.valueOf(_bukuC.getJmlHalaman()));
        halamanField.setEditable(false);
        boundedAdd(halamanField, 19, 189, 355, 24);

        genreBukuLabel = new JLabel("Genre Buku");
        setFontSize(genreBukuLabel, 15);
        setFontStyle(genreBukuLabel, Font.BOLD);
        boundedAdd(genreBukuLabel, 19, 221, 71, 23);

        genreField = new JTextField(_bukuC.getGenreBuku());
        genreField.setEditable(false);
        boundedAdd(genreField, 19, 243, 355, 24);

        tahunTerbitLabel = new JLabel("Tahun Terbit");
        setFontSize(tahunTerbitLabel, 15);
        setFontStyle(tahunTerbitLabel, Font.BOLD);
        boundedAdd(tahunTerbitLabel, 19, 277, 71, 23);

        tahunField = new JTextField(_bukuC.getTahunTerbit());
        tahunField.setEditable(false);
        boundedAdd(tahunField, 19, 300, 355, 24);

        pengarangLabel = new JLabel("Pengarang");
        setFontSize(pengarangLabel, 15);
        setFontStyle(pengarangLabel, Font.BOLD);
        boundedAdd(pengarangLabel, 19, 335, 126, 23);

        namaPengarangLabel = new JLabel("Nama :");
        setFontSize(namaPengarangLabel, 10);
        setFontStyle(namaPengarangLabel, Font.BOLD);
        boundedAdd(namaPengarangLabel, 36, 366, 171, 23);

        namaPengarangField = new JTextField(_bukuC.getNamaPengarang());
        namaPengarangField.setEditable(false);
        boundedAdd(namaPengarangField, 107, 365, 267, 24);

        emailPengarangLabel = new JLabel("Email:");
        setFontSize(emailPengarangLabel, 10);
        setFontStyle(emailPengarangLabel, Font.BOLD);
        boundedAdd(emailPengarangLabel, 36, 400, 71, 23);

        emailPengarangField = new JTextField(_bukuC.getEmailPengarang());
        emailPengarangField.setEditable(false);
        boundedAdd(emailPengarangField, 107, 396, 267, 24);

        penerbitLabel = new JLabel("Penerbit");
        setFontSize(penerbitLabel, 15);
        setFontStyle(penerbitLabel, Font.BOLD);
        boundedAdd(penerbitLabel, 19, 448, 126, 23);

        namaPenerbitLabel = new JLabel("Nama :");
        setFontSize(namaPenerbitLabel, 10);
        setFontStyle(namaPenerbitLabel, Font.BOLD);
        boundedAdd(namaPenerbitLabel, 36, 479, 71, 23);

        namaPenerbitField = new JTextField(_bukuC.getNamaPenerbit());
        namaPenerbitField.setEditable(false);
        boundedAdd(namaPenerbitField, 107, 478, 267, 24);

        alamatPenerbitLabel = new JLabel("alamat :");
        setFontSize(alamatPenerbitLabel, 10);
        setFontStyle(alamatPenerbitLabel, Font.BOLD);
        boundedAdd(alamatPenerbitLabel, 36, 510, 71, 23);

        alamatPenerbitField = new JTextField(_bukuC.getAlamatPenerbit());
        alamatPenerbitField.setEditable(false);
        boundedAdd(alamatPenerbitField, 107, 510, 267, 24);

        tutupBtn = new JButton("Tutup");
        tutupBtn.setBackground(color("#FF4040"));
        tutupBtn.setForeground(color("#FFFFFF"));
        boundedAdd(tutupBtn, 281, 545, 99, 22);

    }

    @Override
    protected void event() {

        tutupBtn.addActionListener((event -> {
            dispose();
        }));

    }
}
