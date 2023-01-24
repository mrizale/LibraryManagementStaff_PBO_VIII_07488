
package entity;

/**
 *
 * @author MOCH RIZAL AKIRUDIN
 */
public class PenerbitEntity extends Identitas {
    // Attribut Class Penerbit
    String alamatPenerbit;


    public String getAlamatPenerbit() {
        return alamatPenerbit;
    }

    public void setAlamatPenerbit(String alamatPenerbit) {
        this.alamatPenerbit = alamatPenerbit;
    }

    public PenerbitEntity() {

    }

    public PenerbitEntity(String namaPenerbit) {
        this.nama = namaPenerbit;
        this.alamatPenerbit = "-";
    }

    public PenerbitEntity(String namaPenerbit, String alamatPenerbit) {
        this.nama = namaPenerbit;
        this.alamatPenerbit = alamatPenerbit;
    }

    // Method
    public void dataPenerbit() {
        System.out.println("Nama Penerbit     :" + nama);
        System.out.println("Alamat Penerbit :" + alamatPenerbit);

    }
}