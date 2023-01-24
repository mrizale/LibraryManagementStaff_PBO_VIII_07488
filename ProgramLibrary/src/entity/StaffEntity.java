package entity;

/**
 *
 * @author MOCH RIZAL AKIRUDIN
 */
public class StaffEntity {
    // Attribut class staff
    private String nama;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // public StaffEntity() {

    // }

    public StaffEntity(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    // Method
    public void dataStaff() {
        System.out.println("Nama       : " + nama);
        System.out.println("Username   : " + username);
        System.out.println("Password   : " + password);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}

