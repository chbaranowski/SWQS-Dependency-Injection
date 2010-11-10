package basar.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import basar.domain.SaleService;

@Component
public class DemoClient implements FooService {

	private SaleService saleService;

	@Autowired
	public void setSaleService(SaleService saleService) {
		this.saleService = saleService;
	}

	@Override
	public boolean isOk() {
		return saleService != null;
	}
	
}
