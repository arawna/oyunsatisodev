package Concrete;


import java.rmi.RemoteException;

import Abstract.ValidationService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements ValidationService {
	
	KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();

	@Override
	public boolean validateUser(User user) throws RemoteException {
			
		return kpsPublic.TCKimlikNoDogrula(
				Long.parseLong(user.getNationalNumber()),
				user.getFirstName().toUpperCase(),
				user.getLastName().toUpperCase(),
				user.getYearOfBirth());
		
	}
	


}
