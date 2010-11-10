package basar.domain;

import java.util.Collection;
import java.util.List;


public interface SellerRepository {
	
	Seller getSeller(long basarNumber);

	void insertSeller(Seller seller);

	void updateSeller(Seller seller);

	void deleteSeller(Seller seller);

	Collection<Seller> getSellerList();

}
