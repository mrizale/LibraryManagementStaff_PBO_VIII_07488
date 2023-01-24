package views.gui.auth;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.AuthController;
import views.gui.MainFrame;

public class RegisterFrame extends MainFrame {
    private JLabel titleLabel;
    private JLabel namaLabel, userLabel, passwordLabel;
    private JTextField namaField, userField;
    private JPasswordField passwordField;

    private JButton daftarBtn, masukDisiniBtn;
    private AuthController _authC = new AuthController();

    public RegisterFrame() {
        super("Registrasi", 555, 355);
    }

    @Override
    protected void component() {

        titleLabel = new JLabel("REGISTRASI");
        setFontSize(titleLabel, 32);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 173, 39, 205, 30);

        namaLabel = new JLabel("Nama");
        setFontSize(namaLabel, 16);
        setFontStyle(namaLabel, Font.BOLD);
        boundedAdd(namaLabel, 95, 99, 129, 27);

        namaField = new JTextField();
        boundedAdd(namaField, 95, 126, 351, 31);

        userLabel = new JLabel("Username");
        setFontSize(userLabel, 16);
        setFontStyle(userLabel, Font.BOLD);
        boundedAdd(userLabel, 95, 164, 129, 27);

        userField = new JTextField();
        boundedAdd(userField, 95, 191, 351, 31);

        passwordLabel = new JLabel("Password");
        setFontSize(passwordLabel, 16);
        setFontStyle(passwordLabel, Font.BOLD);
        boundedAdd(passwordLabel, 95, 233, 129, 27);

        passwordField = new JPasswordField();
        boundedAdd(passwordField, 95, 260, 351, 31);

        daftarBtn = new JButton("Daftar");
        daftarBtn.setBackground(color("#00D4FF")); // #00D4FF
        daftarBtn.setForeground(color("#FFFFFF"));
        setFontSize(daftarBtn, 10);
        daftarBtn.setFocusPainted(false);
        boundedAdd(daftarBtn, 301, 307, 62, 16);

        masukDisiniBtn = new JButton("Sign in");
        masukDisiniBtn.setBackground(color("#9C9C9C"));
        masukDisiniBtn.setFocusPainted(false);
        masukDisiniBtn.setBorderPainted(false);
        setFontSize(masukDisiniBtn, 9);
        boundedAdd(masukDisiniBtn, 382, 307, 62, 16);
    }

    @Override
    protected void event() {

        daftarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nama, username, password;
                    nama = namaField.getText();
                    username = userField.getText();
                    password = String.valueOf(passwordField.getPassword());
                    _authC.regisStaff(nama, username, password);
                    JOptionPane.showMessageDialog(null, "Registrasi Berhasil", "Information",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Registrasi Gagal, lengkapi data dengan benar", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        masukDisiniBtn.addActionListener((event) -> {
            new LoginFrame().setVisible(true);
            dispose();
        });

    }

}
