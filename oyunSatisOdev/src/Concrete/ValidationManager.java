package Concrete;

import Abstract.ValidationService;
import Entities.User;

public class ValidationManager implements ValidationService{

	@Override
	public boolean validateUser(User user) {
		return user.getNationalNumber().length()==11;
	}

}
