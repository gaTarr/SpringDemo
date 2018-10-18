package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int number;
	private String name;
	private String position;
	private int enrollYear;
	private int gradYear;
	private boolean redshirted;
	
	public Player() {
		setGradYear();		
	}

	public Player(int number, String name, String position, int enrollYear, boolean redshirted) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.enrollYear = enrollYear;
		this.redshirted = redshirted;
		setGradYear();
	}
	

	public Player(int number, String name, String position) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	

	public int getEnrollYear() {
		return enrollYear;
	}

	public void setEnrollYear(int enrollYear) {
		this.enrollYear = enrollYear;
	}

	public void setGradYear() {
		int gradYear = (getEnrollYear() + 4);
		if (isRedshirted()) {
			gradYear = (getEnrollYear() + 5);
		}
		this.gradYear = gradYear;
	}
	
	public int getGradYear() {
		return gradYear;
	}

	public boolean isRedshirted() {
		return redshirted;
	}

	public void setRedshirted(boolean redshirted) {
		this.redshirted = redshirted;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", number=" + number + ", name=" + name + ", position=" + position + ", enrollYear="
				+ enrollYear + ", gradYear=" + gradYear + ", redshirted=" + redshirted + "]";
	}


	
	
}
