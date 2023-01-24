package views.gui.home;

import java.awt.Font;
import javax.swing.*;

import entity.*;
import models.Buku;
import views.gui.MainFrame;
import views.gui.home.*;

public class EditFrame extends MainFrame {
    private JLabel titleLabel;
    private JLabel namaBukuLabel;
    private JLabel halamanBukuLabel;
    private JLabel genreBukuLabel;
    private JLabel tahunTerbitLabel;
    private JLabel pengarangLabel;
    private JLabel namaPengarangLabel, namaPenerbitLabel, emailPengarangLabel, alamatPenerbitLabel;
    private JTextField namaPengarangField, namaPenerbitField, emailPengarangField, alamatPenerbitField;
    private JLabel penerbitLabel, yLabel1, yLabel2, tLabel1, tLabel2;
    private JTextField namaBukuField, halamanField, genreField, tahunField;
    private JRadioButton yaButton1, yaButton2, tidakButton1, tidakButton2;
    private JButton updateBtn, batalBtn;
    private ButtonGroup G1, G2;

    PengarangEntity pengarang = null;
    PenerbitEntity penerbit = null;
    DashboardFrame _dashboardF = new DashboardFrame();
    private BukuEntity _bukuC;

    public EditFrame(BukuEntity buku) {
        super("EDIT BUKU", 400, 600);
        this._bukuC = buku;

    }

    @Override
    protected void component() {

        titleLabel = new JLabel("EDIT BUKU");
        setFontSize(titleLabel, 32);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 80, 19, 239, 39);

        namaBukuLabel = new JLabel("Judul Buku");
        setFontSize(namaBukuLabel, 15);
        setFontStyle(namaBukuLabel, Font.BOLD);
        boundedAdd(namaBukuLabel, 34, 79, 82, 18);

        namaBukuField = new JTextField(_bukuC.getJudulBuku());
        boundedAdd(namaBukuField, 34, 105, 333, 24);

        halamanBukuLabel = new JLabel("Jumlah Halaman Buku");
        setFontSize(halamanBukuLabel, 15);
        setFontStyle(halamanBukuLabel, Font.BOLD);
        boundedAdd(halamanBukuLabel, 34, 135, 163, 18);

        halamanField = new JTextField(String.valueOf(_bukuC.getJmlHalaman()));
        boundedAdd(halamanField, 34, 161, 333, 24);

        genreBukuLabel = new JLabel("Genre Buku");
        setFontSize(genreBukuLabel, 15);
        setFontStyle(genreBukuLabel, Font.BOLD);
        boundedAdd(genreBukuLabel, 34, 191, 86, 18);

        genreField = new JTextField(_bukuC.getGenreBuku());
        boundedAdd(genreField, 34, 217, 333, 24);

        tahunTerbitLabel = new JLabel("Tahun Terbit");
        setFontSize(tahunTerbitLabel, 15);
        setFontStyle(tahunTerbitLabel, Font.BOLD);
        boundedAdd(tahunTerbitLabel, 34, 247, 106, 18);

        tahunField = new JTextField(_bukuC.getTahunTerbit());
        boundedAdd(tahunField, 34, 273, 333, 24);

        pengarangLabel = new JLabel("Pengarang");
        setFontSize(pengarangLabel, 15);
        setFontStyle(pengarangLabel, Font.BOLD);
        boundedAdd(pengarangLabel, 34, 304, 54, 18);

        yaButton1 = new JRadioButton();
        boundedAdd(yaButton1, 32, 331, 9, 9);

        yLabel1 = new JLabel("Ya");
        setFontSize(yLabel1, 10);
        setFontStyle(yLabel1, Font.BOLD);
        boundedAdd(yLabel1, 46, 330, 12, 12);

        tidakButton1 = new JRadioButton();
        boundedAdd(tidakButton1, 77, 331, 9, 9);

        tLabel1 = new JLabel("Tidak");
        setFontSize(tLabel1, 10);
        setFontStyle(tLabel1, Font.BOLD);
        boundedAdd(tLabel1, 92, 331, 28, 12);

        G1 = new ButtonGroup();
        G1.add(yaButton1);
        G1.add(tidakButton1);

        namaPengarangLabel = new JLabel("Nama Pengarang :");
        setFontSize(namaPengarangLabel, 10);
        setFontStyle(namaPengarangLabel, Font.BOLD);
        boundedAdd(namaPengarangLabel, 37, 354, 72, 12);

        namaPengarangField = new JTextField(_bukuC.getNamaPengarang());
        boundedAdd(namaPengarangField, 114, 349, 248, 24);

        emailPengarangLabel = new JLabel("Email Pengarang :");
        setFontSize(emailPengarangLabel, 10);
        setFontStyle(emailPengarangLabel, Font.BOLD);
        boundedAdd(emailPengarangLabel, 37, 384, 70, 12);

        emailPengarangField = new JTextField(_bukuC.getEmailPengarang());
        boundedAdd(emailPengarangField, 114, 379, 248, 24);

        penerbitLabel = new JLabel("Penerbit");
        setFontSize(penerbitLabel, 15);
        setFontStyle(penerbitLabel, Font.BOLD);
        boundedAdd(penerbitLabel, 33, 423, 63, 18);

        yaButton2 = new JRadioButton();
        boundedAdd(yaButton2, 36, 451, 9, 9);

        yLabel2 = new JLabel("Ya");
        setFontSize(yLabel2, 10);
        setFontStyle(yLabel2, Font.BOLD);
        boundedAdd(yLabel2, 52, 450, 12, 12);

        tidakButton2 = new JRadioButton();
        boundedAdd(tidakButton2, 81, 451, 9, 9);

        tLabel2 = new JLabel("Tidak");
        setFontSize(tLabel2, 10);
        setFontStyle(tLabel2, Font.BOLD);
        boundedAdd(tLabel2, 96, 450, 28, 12);

        G2 = new ButtonGroup();
        G2.add(yaButton2);
        G2.add(tidakButton2);

        namaPenerbitLabel = new JLabel("Nama Penerbit :");
        setFontSize(namaPenerbitLabel, 10);
        setFontStyle(namaPenerbitLabel, Font.BOLD);
        boundedAdd(namaPenerbitLabel, 37, 467, 78, 12);

        namaPenerbitField = new JTextField(_bukuC.getNamaPenerbit());
        boundedAdd(namaPenerbitField, 119, 461, 248, 24);

        alamatPenerbitLabel = new JLabel("alamat Penerbit :");
        setFontSize(alamatPenerbitLabel, 10);
        setFontStyle(alamatPenerbitLabel, Font.BOLD);
        boundedAdd(alamatPenerbitLabel, 30, 496, 85, 12);

        alamatPenerbitField = new JTextField(_bukuC.getAlamatPenerbit());
        boundedAdd(alamatPenerbitField, 119, 490, 248, 24);

        updateBtn = new JButton("update");
        updateBtn.setBackground(color("#5BFF40"));
        updateBtn.setForeground(color("#FFFFFF"));
        boundedAdd(updateBtn, 292, 540, 74, 30);

        batalBtn = new JButton("Batal");
        batalBtn.setBackground(color("#FF4040"));
        batalBtn.setForeground(color("#FFFFFF"));
        boundedAdd(batalBtn, 196, 540, 74, 30);

    }

    @Override
    protected void event() {

        yaButton1.addActionListener((event -> {
            namaPengarangField.setEditable(true);
            emailPengarangField.setEditable(true);
        }));

        tidakButton1.addActionListener((event -> {
            namaPengarangField.setEditable(false);
            emailPengarangField.setEditable(false);
        }));

        yaButton2.addActionListener((event -> {
            namaPenerbitField.setEditable(true);
            alamatPenerbitField.setEditable(true);
        }));

        tidakButton2.addActionListener((event -> {
            namaPenerbitField.setEditable(false);
            alamatPenerbitField.setEditable(false);
        }));

        updateBtn.addActionListener((event -> {
            String judulBuku = namaBukuField.getText();
            _bukuC.setJudulBuku(judulBuku);
            int halamanBuku = Integer.parseInt(halamanField.getText());
            _bukuC.setJmlHalaman(halamanBuku);
            String genreBuku = genreField.getText();
            _bukuC.setGenreBuku(genreBuku);
            String tahunTerbit = tahunField.getText();
            _bukuC.setTahunTerbit(tahunTerbit);
            if (yaButton1.isSelected()) {
                pengarang = new PengarangEntity(namaPengarangField.getText(), emailPengarangField.getText());
                _bukuC.setPengarang(pengarang);
            } else if (tidakButton1.isSelected()) {
                String namaPengarang = " - ";
                String emailPengarang = " - ";
                pengarang = new PengarangEntity(namaPengarang, emailPengarang);
                _bukuC.setPengarang(pengarang);
            }

            if (yaButton2.isSelected()) {
                penerbit = new PenerbitEntity(namaPenerbitField.getText(), alamatPenerbitField.getText());
                _bukuC.setPenerbit(penerbit);
            } else if (tidakButton2.isSelected()) {
                String namaPenerbit = " - ";
                String alamatPenerbit = " - ";
                penerbit = new PenerbitEntity(namaPenerbit, alamatPenerbit);
                _bukuC.setPenerbit(penerbit);
            }
            Buku.updateBuku(_bukuC);
            JOptionPane.showMessageDialog(null, "Edit Buku berhasil", "Information",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();

        }));

        batalBtn.addActionListener((event -> {
            dispose();
        }));

    }

}
