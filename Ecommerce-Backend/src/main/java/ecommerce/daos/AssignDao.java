package ecommerce.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecommerce.entities.Assign;

@Repository
public interface AssignDao extends JpaRepository<Assign, Integer> {
	Assign findByUserid(String userid);
}
