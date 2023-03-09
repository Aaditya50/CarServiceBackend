package ecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecommerce.daos.ContactUsDao;
import ecommerce.entities.ContactUs;

@Service
public class ContactUsServiceImpl implements ContactUsService {

	
	@Autowired private ContactUsDao dao;
	
	@Override
	public void AddConatactus(ContactUs contact) {
		// TODO Auto-generated method stub
		dao.save(contact);
	}

}
