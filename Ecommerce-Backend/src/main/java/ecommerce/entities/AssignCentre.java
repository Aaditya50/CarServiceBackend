package ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assigncentre")
public class AssignCentre {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private int userid;
	private int orderid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	@Override
	public String toString() {
		return "AssignCentre [id=" + id + ", userid=" + userid + ", orderid=" + orderid + "]";
	}
	
	
}
