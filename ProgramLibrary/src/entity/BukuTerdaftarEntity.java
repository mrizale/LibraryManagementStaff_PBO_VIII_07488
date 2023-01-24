package entity;

/**
 *
 * @author MOCH RIZAL AKIRUDIN
 */
public abstract class BukuTerdaftarEntity {
    protected int idBuku;
    protected boolean status;
    
     public BukuTerdaftarEntity() {

    }
     
     public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

