package basar.domain.inmemory;

import java.util.Collection;
import java.util.HashMap;

import basar.domain.Seller;
import basar.domain.SellerRepository;


public class SellerRepositoryInMemory implements SellerRepository {
	
	HashMap<Long, Seller> sellers = new HashMap<Long, Seller>();
	
	@Override
	public Seller getSeller(long basarNumber) {
		return sellers.get(basarNumber);
	}

	@Override
	public void insertSeller(Seller seller) {
		sellers.put(seller.getBasarNumber(), seller);
	}

	@Override
	public void updateSeller(Seller seller) {
		sellers.put(seller.getBasarNumber(), seller);
	}

	@Override
	public void deleteSeller(Seller seller) {
		sellers.remove(seller.getBasarNumber());
	}

	@Override
	public Collection<Seller> getSellerList() {
		return sellers.values();
	}

}
