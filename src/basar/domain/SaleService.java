package basar.domain;


public interface SaleService {
	
	boolean isValideBasarNumber(long number);

	void purchase(Sale sale);

}
