package views.gui.home;

import controller.*;
import entity.*;
import models.Buku;
import models.Staff;
import views.gui.*;

import java.awt.Font;
import java.util.ArrayList;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import views.gui.auth.LoginFrame;

public class DashboardFrame extends MainFrame {

    private JLabel iconLabel;
    private JLabel titleLabel, subTitleLabel;
    private JButton lihatBtn, tambahBtn, editBtn, cariBukuBtn, hapusBtn;
    private JButton refreshBtn;
    private JButton logoutBtn;

    protected JTable bukuTable;
    private JScrollPane scrollPane;

    private JTextField selectedField = new JTextField();

    private DashboardController _dashboardC = new DashboardController();

    private StaffEntity staff;

    public DashboardFrame() {
        super("Dashboard Menu", 800, 600);

        staff = Staff.getStaffLogged();
    }

    @Override
    protected void component() {
        ImageIcon imgLoad = loadImage("src/assets/logolibrary.png", 100, 100);
        iconLabel = new JLabel(imgLoad);
        boundedAdd(iconLabel, 27, 40, 191, 116);

        titleLabel = new JLabel("WELCOME");
        setFontSize(titleLabel, 25);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 556, 40, 169, 38);

        subTitleLabel = new JLabel(staff.getNama());
        setFontSize(subTitleLabel, 20);
        setFontStyle(subTitleLabel, Font.BOLD);
        boundedAdd(subTitleLabel, 662, 84, 63, 38);



        refreshBtn = new JButton("Refresh");
        refreshBtn.setForeground(color("#FFFFFF"));
        refreshBtn.setBackground(color("#FF0000"));
//        refreshBtn.setBorder(new LineBorder(color("#00FF88"), 2, true));
//        refreshBtn.setContentAreaFilled(false);
//        refreshBtn.setFocusPainted(false);
        boundedAdd(refreshBtn, 620, 183, 83, 24);

        lihatBtn = new JButton("Lihat");
        lihatBtn.setBackground(color("#0080FF"));
        lihatBtn.setForeground(color("#FFFFFF"));
        lihatBtn.setFocusPainted(false);
        boundedAdd(lihatBtn, 96, 183, 83, 24);

        tambahBtn = new JButton("Tambah");
        tambahBtn.setBackground(color("#0080FF"));
        tambahBtn.setForeground(color("#FFFFFF"));
        tambahBtn.setFocusPainted(false);
        boundedAdd(tambahBtn, 197, 183, 83, 24);

        editBtn = new JButton("Edit");
        editBtn.setBackground(color("#0080FF"));
        editBtn.setForeground(color("#FFFFFF"));
        editBtn.setFocusPainted(false);
        boundedAdd(editBtn, 298, 183, 83, 24);

        cariBukuBtn = new JButton("Cari Buku");
        cariBukuBtn.setBackground(color("#FF0000"));
        cariBukuBtn.setForeground(color("#FFFFFF"));
        cariBukuBtn.setFocusPainted(false);
        boundedAdd(cariBukuBtn, 419, 183, 83, 24);

        hapusBtn = new JButton("Hapus");
        hapusBtn.setBackground(color("#FF0000"));
        hapusBtn.setForeground(color("#FFFFFF"));
        hapusBtn.setFocusPainted(false);
        boundedAdd(hapusBtn, 519, 183, 83, 24);

        // Tabel
        bukuTable = new JTable();
        TableModel model = createTableModel();
        bukuTable.setModel(model);

        // Scroll Table
        scrollPane = new JScrollPane(bukuTable);
        boundedAdd(scrollPane, 96, 217, 607, 315);

        logoutBtn = new JButton("LOGOUT");
        logoutBtn.setBackground(color("#E50404"));
        logoutBtn.setForeground(color("#FFFFFF"));
        logoutBtn.setFocusPainted(false);
        boundedAdd(logoutBtn, 620, 542, 83, 24);
    }

    @Override
    protected void event() {
        bukuTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = bukuTable.getSelectedRow();
                String selectedId = bukuTable.getValueAt(i, 0).toString();
                selectedField.setText(selectedId);
            }
        });

        refreshBtn.addActionListener((e) -> {
            bukuTable.setModel(createTableModel());
        });

        lihatBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = bukuTable.getSelectedRow() + 1;
                BukuEntity buku = Buku.findBukuById(i);
                if (buku != null) {
                    new LihatBukuFrame(buku).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        tambahBtn.addActionListener((event -> {
            new TambahBukuFrame().setVisible(true);

        }));

        editBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = bukuTable.getSelectedRow() + 1;
                BukuEntity buku = Buku.findBukuById(i);
                if (buku != null) {
                    new EditFrame(buku).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            }

        });

        cariBukuBtn.addActionListener((event -> {
            new CariBukuFrame().setVisible(true);
        }));

        hapusBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = bukuTable.getSelectedRow();
                _dashboardC.delete(i);
                JOptionPane.showMessageDialog(null, "Hapus Buku berhasil", "Information",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        });

//        cariStaffBtn.addActionListener((event -> {
//            new CariStaffFrame().setVisible(true);
//        }));

        logoutBtn.addActionListener((event -> {
            int jawab = JOptionPane.showOptionDialog(this,
                    "Ingin Keluar?",
                    "Keluar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, null, null);

            if (jawab == JOptionPane.YES_OPTION) {
                new LoginFrame().setVisible(true);
                dispose();
            }
        }));
    }

    private TableModel createTableModel() {
        DefaultTableModel dataTable = new DefaultTableModel();

        Object[] column = {
                "ID",
                "Judul",
                "Genre",
                "Pengarang",
                "Penerbit",

        };
        dataTable.setColumnIdentifiers(column);

        ArrayList<BukuEntity> bukuList = _dashboardC.bukuList();

        for (BukuEntity buku : bukuList) {

            Object[] data = new String[] {
                    String.valueOf(buku.getIdBuku()),
                    buku.getJudulBuku(),
                    buku.getGenreBuku(),
                    buku.getNamaPengarang(),
                    buku.getNamaPenerbit()
            };

            dataTable.addRow(data);
        }
        return dataTable;
    }

    

}
