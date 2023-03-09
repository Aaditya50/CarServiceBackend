package ecommerce.services;

import java.util.List;

import ecommerce.entities.AssignCentre;
import ecommerce.entities.Customer;
import ecommerce.entities.Order;
import ecommerce.entities.Seller;

public interface AssignCentreService {
	void AssignCentre(AssignCentre assignCentre);
	AssignCentre findById(int id);
	List<AssignCentre> allCentres();
}
