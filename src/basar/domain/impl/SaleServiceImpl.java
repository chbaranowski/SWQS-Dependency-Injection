package basar.domain.impl;

import java.util.Collection;

import basar.domain.Position;
import basar.domain.PositionRepository;
import basar.domain.Sale;
import basar.domain.SaleService;
import basar.domain.Seller;
import basar.domain.SellerRepository;

class SaleServiceImpl implements SaleService {
	
	private PositionRepository positionRepository;

	private SellerRepository sellerRepository;

	public boolean isValideBasarNumber(long number) {
		Seller seller = sellerRepository.getSeller(number);
		return seller != null;
	}

	public void purchase(Sale sale) {
		Collection<Position> positions = sale.getPosition();
		for (Position position : positions) {
			isValideBasarNumber(position.getSeller().getBasarNumber());
			positionRepository.insertPosition(position);
		}
	}

	public void setPositionRepository(PositionRepository positionRepository) {
		this.positionRepository = positionRepository;
	}

	public void setSellerRepository(SellerRepository sellerRepository) {
		this.sellerRepository = sellerRepository;
	}

}
