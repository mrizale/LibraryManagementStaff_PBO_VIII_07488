package main;
import models.Buku;
import models.Staff;
import views.gui.auth.LoginFrame;

public class MainProgram {
    public static void main(String[] args) {

        Staff.initialStaff();
        Buku.initialBuku();

        new LoginFrame().setVisible(true);

    }
}
