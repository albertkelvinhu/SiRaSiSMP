package psi.app.sirasi.service;

import psi.app.sirasi.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public void saveUserSiswa(User user);
}
