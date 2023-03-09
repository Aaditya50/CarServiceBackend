package ecommerce.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecommerce.daos.AssignCentreDao;
import ecommerce.entities.AssignCentre;
import ecommerce.entities.Order;
import ecommerce.entities.Seller;

@Service
public class AssignCentreServiceImpl implements AssignCentreService {
	
	@Autowired private AssignCentreDao dao;

	@Override
	public void AssignCentre(AssignCentre assignCentre) {
		// TODO Auto-generated method stub
		dao.save(assignCentre);
	}

	@Override
	public AssignCentre findById(int id) {
		// TODO Auto-generated method stub
		
		return dao.getById(id);
	}

	
	@Override
	public List<AssignCentre> allCentres() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	

	
	
}
