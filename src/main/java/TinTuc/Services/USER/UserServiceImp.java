package TinTuc.Services.USER;

import java.util.List;

import org.springframework.stereotype.Service;

import TinTuc.Entity.User;

@Service
public class UserServiceImp extends BaseService implements UserService{

	@Override
	public List<User> logIn(String email, String password) {
		return userDAO.logIn(email, password);
	}
}
