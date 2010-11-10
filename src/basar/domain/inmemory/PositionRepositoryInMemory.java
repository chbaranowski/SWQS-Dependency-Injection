package basar.domain.inmemory;

import java.util.Collection;
import java.util.HashMap;

import basar.domain.Position;
import basar.domain.PositionKey;
import basar.domain.PositionRepository;

public class PositionRepositoryInMemory implements PositionRepository {
	
	HashMap<PositionKey, Position> positions = new HashMap<PositionKey, Position>();
	
	@Override
	public Position getPosition(PositionKey positionKey) {
		return positions.get(positionKey);
	}

	@Override
	public void insertPosition(Position position) {
		positions.put(position.getPositionKey(), position);
	}

	@Override
	public void updatePosition(Position position) {
		positions.put(position.getPositionKey(), position);
	}

	@Override
	public void deletePosition(Position position) {
		positions.remove(position.getPositionKey());
	}

	@Override
	public Collection<Position> getPositionList() {
		return positions.values();
	}

}
