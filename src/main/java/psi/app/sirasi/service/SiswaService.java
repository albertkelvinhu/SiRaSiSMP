package psi.app.sirasi.service;

import java.util.List;

import psi.app.sirasi.model.Siswa;

public interface SiswaService {
    
	List <Siswa> listAllSiswa();

    Siswa getSiswaById(Integer id);

    void saveSiswa(Siswa siswa);

    void deleteSiswa(Integer id);
	

}
