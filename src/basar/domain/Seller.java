package basar.domain;

import java.util.Collection;


public class Seller {

	private Long basarNumber;

	private String name;
	
	private Collection<Position> position;

	public Collection<Position> getPosition() {
		return position;
	}

	public void setPosition(Collection<Position> position) {
		this.position = position;
	}

	public void setBasarNumber(Long basarNumber) {
		this.basarNumber = basarNumber;
	}

	public Long getBasarNumber() {
		return basarNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
