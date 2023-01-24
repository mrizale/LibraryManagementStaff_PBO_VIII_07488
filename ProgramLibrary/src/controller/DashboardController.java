package controller;

import java.util.ArrayList;
import entity.BukuEntity;
import entity.StaffEntity;
import models.Buku;
import models.Staff;

public class DashboardController {

    public void toView() {

    }

    public StaffEntity staffLogged() {
        return Staff.getStaffLogged();
    }

    public ArrayList<BukuEntity> bukuList() {
        return Buku.getBukuList();
    }

    public void updateBuku(BukuEntity buku) {
        Buku.updateBuku(buku);
    }

    public void getIndex(int index) {
        Buku.findBukuById(index);
    }

    public void delete(int index) {
        Buku.deleteBuku(index);
    }

}
