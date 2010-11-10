package basar.domain;

import java.util.Collection;

public interface PositionRepository {
	
	Position getPosition(PositionKey positionKey);

	void insertPosition(Position position);

	void updatePosition(Position position);

	void deletePosition(Position position);

	Collection<Position> getPositionList();

}
