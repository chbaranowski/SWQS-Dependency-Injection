package basar.domain;

import java.util.Collection;
import java.util.Vector;


public class Sale {

	private Collection<Position> positions = new Vector<Position>();

	public Collection<Position> getPosition() {
		return positions;
	}
	
	public void addPosition(Position position){
		positions.add(position);
	}

}
