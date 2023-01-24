package views.gui.auth;



import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.AuthController;
import views.gui.MainFrame;
import views.gui.home.DashboardFrame;

public class LoginFrame extends MainFrame {
    private JLabel titleLabel;

    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;

    private JButton masukBtn, daftarBtn, exitBtn;

    private AuthController _authC = new AuthController();

    public LoginFrame() {
        super("LOGIN PAGE", 555, 355);
    }

    @Override
    protected void component() {


        titleLabel = new JLabel("LOGIN FORM");
        setFontSize(titleLabel, 25);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 199, 39, 175, 29);

        usernameLabel = new JLabel("Username");
        setFontSize(usernameLabel, 16);
        setFontStyle(usernameLabel, Font.BOLD);
        boundedAdd(usernameLabel, 73, 116, 98, 23);

        usernameField = new JTextField();
        boundedAdd(usernameField, 73, 139, 409, 33);

        passwordLabel = new JLabel("Password");
        setFontSize(passwordLabel, 16);
        setFontStyle(passwordLabel, Font.BOLD);
        boundedAdd(passwordLabel, 73, 188, 98, 23);

        passwordField = new JPasswordField();
        boundedAdd(passwordField, 73, 211, 409, 33);

        masukBtn = new JButton("Sign in");
        masukBtn.setBackground(color("#080000")); 
        masukBtn.setForeground(color("#FFFFFF"));
        masukBtn.setFocusPainted(false);
        setFontSize(masukBtn, 10);
        boundedAdd(masukBtn, 111, 277, 75, 18);

        daftarBtn = new JButton("Sign up");
        daftarBtn.setBackground(color("#080000"));
        daftarBtn.setForeground(color("#FFFFFF"));
        daftarBtn.setFocusPainted(false);
        setFontSize(daftarBtn, 10);
        boundedAdd(daftarBtn, 229, 277, 75, 18);

        exitBtn = new JButton("Exit");
        exitBtn.setBackground(color("#E50404"));
        exitBtn.setForeground(color("#FFFFFF"));
        exitBtn.setFocusPainted(false);
        setFontSize(exitBtn, 10);
        boundedAdd(exitBtn, 356, 277, 75, 18);

    }

    @Override
    protected void event() {

        exitBtn.addActionListener((event -> {
            int jawab = JOptionPane.showOptionDialog(this,
                    "Ingin Keluar?",
                    "Keluar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, null, null);

            if (jawab == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Program Akan Keluar");
                System.exit(0);
            }

        }));

        masukBtn.addActionListener((event) -> {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            boolean statusLogin = _authC.login(username, password);

            if (statusLogin == true) {
                // View Dashboard / View Home
                new DashboardFrame().setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null,
                        "Username atau Password Salah",
                        "Login Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }

        });

        daftarBtn.addActionListener((event) -> {
            new RegisterFrame().setVisible(true);
            dispose();
        });
    }
}
