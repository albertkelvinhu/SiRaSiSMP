package psi.app.sirasi.service;

import java.util.List;

import psi.app.sirasi.model.Role;
import psi.app.sirasi.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public void saveUserSiswa(User user);
	List<Role> findAllRoles();
	
}
