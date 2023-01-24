package entity;

/**
 *
 * @author MOCH RIZAL AKIRUDIN
 */
public class PengarangEntity extends Identitas{
    // Attribut Class Penulis
    private String emailPengarang;

    public PengarangEntity() {

    }

    public PengarangEntity(String namaPengarang) {
        this.nama = namaPengarang;
        this.emailPengarang = "-";
    }

    public PengarangEntity(String namaPengarang, String emailPengarang) {
        this.nama = namaPengarang;
        this.emailPengarang = emailPengarang;
    }

    // Method
    public void dataPengarang() {
        System.out.println("Nama Pengarang    : " + nama);
        System.out.println("Email Pengarang   : " + emailPengarang);

    }

    public String getEmailPengarang() {
        return emailPengarang;
    }

    public void setEmailPengarang(String emailPengarang) {
        this.emailPengarang = emailPengarang;
    }
}
