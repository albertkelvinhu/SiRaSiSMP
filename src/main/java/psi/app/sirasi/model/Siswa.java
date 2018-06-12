package psi.app.sirasi.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "siswa")
public class Siswa {
	
	@Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Size(min = 10, max = 10, message = "Masukkan NISN yang valid")
    @Column(unique = true)
    private String nisn;

    @Column(nullable = false)
    private String namaLengkap;

    @Column
    private String jenisKelamin;

    @Column
    private String alamat;

    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date tglLahir;

    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;
    
    @Column
    private String path;
    
    //setter getter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNisn() {
		return nisn;
	}

	public void setNisn(String nisn) {
		this.nisn = nisn;
	}

	public String getNamaLengkap() {
		return namaLengkap;
	}

	public void setNamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Date getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(Date tglLahir) {
		this.tglLahir = tglLahir;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
    

    
    
    
}
