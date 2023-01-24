package models;

import entity.StaffEntity;
import java.util.ArrayList;

/**
 *
 * @author MOCH RIZAL AKIRUDIN
 */
public class Staff {
    public static ArrayList<StaffEntity> staffList = new ArrayList<>();
    private static StaffEntity staffLogged = null;

    public static void initialStaff() {

        StaffEntity staff = new StaffEntity("Rizal", "rizalstaff", "1");

        staffList.add(staff);

    }

    public static ArrayList<StaffEntity> all() {
        return staffList;
    }

    public static StaffEntity findStaff(String nik) {
        for (StaffEntity staff : staffList) {
            if (staff.getUsername().equals(nik)) {
                return staff;
            }
        }
        return null;
    }

    public static void regisStaff(StaffEntity data) {
        staffList.add(data);
    }

    public static StaffEntity getStaffLogged() {
        return staffLogged;
    }

    public static void setStaffLogged(StaffEntity staffLogged) {
        Staff.staffLogged = staffLogged;
    }

}
