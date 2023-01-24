package controller;

import entity.StaffEntity;
// import models.Library;
import models.Staff;

public class AuthController {

    public boolean regisStaff(String nama, String username, String password) {
        if (Staff.findStaff(username) == null) {
            StaffEntity staffbaru = new StaffEntity(nama, username, password);
            Staff.regisStaff(staffbaru);
            return true;
        }
        return true;
    }

    public boolean login(String username, String password) {
        StaffEntity staff = Staff.findStaff(username);

        if (staff != null) {
            if (staff.getPassword().equals(password)) {
                Staff.setStaffLogged(staff);
                return true;
            } else {
                Staff.setStaffLogged(null);
            }
        }
        return false;
    }

    public void logout() {
        Staff.setStaffLogged(null);
    }

}
