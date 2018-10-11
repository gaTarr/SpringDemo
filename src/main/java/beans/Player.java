package beans;

import java.util.Date;

public class Player {

	private int number;
	private String name;
	private String position;
	private Date gradYear;
	private boolean redshirted;
	
	public Player() {
		
	}

	public Player(int number, String name, String position, Date gradYear, boolean redshirted) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.gradYear = gradYear;
		this.redshirted = redshirted;
	}
	

	public Player(int number, String name, String position) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
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

	public Date getGradYear() {
		return gradYear;
	}

	public void setGradYear(Date gradYear) {
		this.gradYear = gradYear;
	}

	public boolean isRedshirted() {
		return redshirted;
	}

	public void setRedshirted(boolean redshirted) {
		this.redshirted = redshirted;
	}

	@Override
	public String toString() {
		return "Player [number=" + number + ", name=" + name + ", position=" + position + ", gradYear=" + gradYear
				+ ", redshirted=" + redshirted + "]";
	}
	
	
}
