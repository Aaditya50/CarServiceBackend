package ecommerce.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecommerce.entities.ContactUs;



@Repository
public interface ContactUsDao extends JpaRepository<ContactUs, Integer> {

}
