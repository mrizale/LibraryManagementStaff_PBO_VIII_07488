package views.gui.home;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import entity.*;
import models.Buku;
import views.gui.MainFrame;

public class TambahBukuFrame extends MainFrame {
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
    private JButton tambahBtn, batalBtn;
    private ButtonGroup G1, G2;


    public TambahBukuFrame() {
        super("Tambah Buku", 400, 600);
    }

    @Override
    protected void component() {

        titleLabel = new JLabel("TAMBAH BUKU");
        setFontSize(titleLabel, 27);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 80, 19, 239, 39);

        namaBukuLabel = new JLabel("Judul");
        setFontSize(namaBukuLabel, 13);
        setFontStyle(namaBukuLabel, Font.BOLD);
        boundedAdd(namaBukuLabel, 34, 79, 82, 18);

        namaBukuField = new JTextField();
        boundedAdd(namaBukuField, 34, 105, 333, 24);

        halamanBukuLabel = new JLabel("Jumlah Halaman");
        setFontSize(halamanBukuLabel, 13);
        setFontStyle(halamanBukuLabel, Font.BOLD);
        boundedAdd(halamanBukuLabel, 34, 135, 163, 18);

        halamanField = new JTextField();
        boundedAdd(halamanField, 34, 161, 333, 24);

        genreBukuLabel = new JLabel("Genre");
        setFontSize(genreBukuLabel, 13);
        setFontStyle(genreBukuLabel, Font.BOLD);
        boundedAdd(genreBukuLabel, 34, 191, 86, 18);

        genreField = new JTextField();
        boundedAdd(genreField, 34, 217, 333, 24);

        tahunTerbitLabel = new JLabel("Tahun Terbit");
        setFontSize(tahunTerbitLabel, 13);
        setFontStyle(tahunTerbitLabel, Font.BOLD);
        boundedAdd(tahunTerbitLabel, 34, 247, 106, 18);

        tahunField = new JTextField();
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

        namaPengarangLabel = new JLabel("Nama :");
        setFontSize(namaPengarangLabel, 10);
        setFontStyle(namaPengarangLabel, Font.BOLD);
        boundedAdd(namaPengarangLabel, 37, 354, 72, 12);

        namaPengarangField = new JTextField();
        boundedAdd(namaPengarangField, 114, 349, 248, 24);

        emailPengarangLabel = new JLabel("Email :");
        setFontSize(emailPengarangLabel, 10);
        setFontStyle(emailPengarangLabel, Font.BOLD);
        boundedAdd(emailPengarangLabel, 37, 384, 70, 12);

        emailPengarangField = new JTextField();
        boundedAdd(emailPengarangField, 114, 379, 248, 24);

        penerbitLabel = new JLabel("Penerbit");
        setFontSize(penerbitLabel, 15);
        setFontStyle(penerbitLabel, Font.BOLD);
        boundedAdd(penerbitLabel, 34, 415, 63, 18);

        yaButton2 = new JRadioButton();
        boundedAdd(yaButton2, 36, 479, 9, 9);

        yLabel2 = new JLabel("Ya");
        setFontSize(yLabel2, 10);
        setFontStyle(yLabel2, Font.BOLD);
        boundedAdd(yLabel2, 51, 442, 12, 12);

        tidakButton2 = new JRadioButton();
        boundedAdd(tidakButton2, 82, 443, 9, 9);

        tLabel2 = new JLabel("Tidak");
        setFontSize(tLabel2, 10);
        setFontStyle(tLabel2, Font.BOLD);
        boundedAdd(tLabel2, 96, 442, 28, 12);

        G2 = new ButtonGroup();
        G2.add(yaButton2);
        G2.add(tidakButton2);

        namaPenerbitLabel = new JLabel("Nama :");
        setFontSize(namaPenerbitLabel, 10);
        setFontStyle(namaPenerbitLabel, Font.BOLD);
        boundedAdd(namaPenerbitLabel, 37, 467, 78, 12);

        namaPenerbitField = new JTextField();
        boundedAdd(namaPenerbitField, 119, 461, 248, 24);

        alamatPenerbitLabel = new JLabel("alamat :");
        setFontSize(alamatPenerbitLabel, 10);
        setFontStyle(alamatPenerbitLabel, Font.BOLD);
        boundedAdd(alamatPenerbitLabel, 30, 496, 85, 12);

        alamatPenerbitField = new JTextField();
        boundedAdd(alamatPenerbitField, 119, 490, 248, 24);

        tambahBtn = new JButton("Tambah");
        tambahBtn.setBackground(color("#5BFF40"));
        tambahBtn.setForeground(color("#FFFFFF"));
        boundedAdd(tambahBtn, 189, 542, 84, 28);

        batalBtn = new JButton("Batal");
        batalBtn.setBackground(color("#FF4040"));
        batalBtn.setForeground(color("#FFFFFF"));
        boundedAdd(batalBtn, 189, 542, 84, 28);

    }

    PengarangEntity pengarang;
    PenerbitEntity penerbit;

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

        tambahBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String judulBuku = namaBukuField.getText();
                    int halamanBuku = Integer.parseInt(halamanField.getText());
                    String genreBuku = genreField.getText();
                    String tahunTerbit = tahunField.getText();
                    if (yaButton1.isSelected()) {
                        // namaPenulisField.setEditable(true);
                        pengarang = new PengarangEntity(namaPengarangField.getText(), emailPengarangField.getText());

                    } else if (tidakButton1.isSelected()) {
                        String namaPengarang = " - ";
                        // namaPenulisField.setEditable(false);
                        pengarang = new PengarangEntity(namaPengarang);
                    }

                    if (yaButton2.isSelected()) {
                        // namaPenerbitField.setEditable(true);
                        penerbit = new PenerbitEntity(namaPenerbitField.getText(), alamatPenerbitField.getText());
                    } else if (tidakButton2.isSelected()) {
                        String namaPenerbit = " - ";
                        // namaPenulisField.setEditable(false);
                        penerbit = new PenerbitEntity(namaPenerbit);
                    }
                    BukuEntity bukuBaru = new BukuEntity(judulBuku, halamanBuku, genreBuku, tahunTerbit, pengarang,
                            penerbit,
                            true);
                    Buku.tambahBuku(bukuBaru);

                    JOptionPane.showMessageDialog(null,
                            "Tambah Buku Berhasil");
                    dispose();
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Maaf Buku Gagal Ditambahkan, Isi Kolom Dengan Benar",
                            "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        batalBtn.addActionListener((event -> {
            dispose();
        }));

    }

}
