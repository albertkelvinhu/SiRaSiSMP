package psi.app.sirasi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import psi.app.sirasi.model.Siswa;
import psi.app.sirasi.model.User;
import psi.app.sirasi.repository.SiswaRepository;


@Service()
public class SiswaServiceImpl implements SiswaService {
	
	
	private SiswaRepository siswarepository;
	private UserServiceImpl userserviceimpl;
	
	@Autowired
	public void setSiswarepository(SiswaRepository siswarepository) {
		this.siswarepository = siswarepository;
	}
	 
	@Autowired
	public void setUserserviceimpl(UserServiceImpl userserviceimpl) {
		this.userserviceimpl = userserviceimpl;
	}

	@Override
	public List <Siswa> listAllSiswa() {
		return siswarepository.findAll();
	}

	@Override
	public Siswa getSiswaById(Integer id) {
		// TODO Auto-generated method stub
		return siswarepository.getOne(id);
	}

	@Override
	public void saveSiswa(Siswa siswa) {
		siswarepository.save(siswa);

		
	}

	@Override
	public void deleteSiswa(Integer id) {
		// TODO Auto-generated method stub
		siswarepository.deleteById(id);
	}

	
}
