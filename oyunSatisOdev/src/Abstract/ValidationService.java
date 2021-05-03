package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface ValidationService {
	boolean validateUser(User user) throws RemoteException;
}
