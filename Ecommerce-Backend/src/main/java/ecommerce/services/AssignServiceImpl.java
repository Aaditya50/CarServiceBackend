package ecommerce.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecommerce.daos.AssignDao;
import ecommerce.entities.Assign;

@Service
public class AssignServiceImpl implements AssignService {
	
	@Autowired private AssignDao dao;
	
	@Override
	public void Assign(Assign assign) {
		// TODO Auto-generated method stub
		dao.save(assign);
		
		
	}

}
