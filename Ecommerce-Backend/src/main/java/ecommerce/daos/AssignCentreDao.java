package ecommerce.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecommerce.entities.AssignCentre;
import ecommerce.entities.Customer;
import ecommerce.entities.Order;

@Repository
public interface AssignCentreDao extends JpaRepository<AssignCentre, Integer> {
	
	AssignCentre findByUserid(String userid);
}
