package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Department")
public class Department {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;	
	private String deparmentName;
	@OneToMany
	private List<Employee> employess;
	
	
	
	public List getEmployess() {
		return employess;
	}
	public void setEmployess(List employess) {
		this.employess = employess;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDeparmentName() {
		return deparmentName;
	}
	public void setDeparmentName(String deparmentName) {
		this.deparmentName = deparmentName;
	}
	
	
	
	
}
