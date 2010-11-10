package basar.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaleServiceSpringTest {
	
	SaleService saleService;
	
	PositionRepository positionRepository;
	
	SellerRepository sellerRepository;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/core-context.xml");
		saleService = context.getBean(SaleService.class);
		positionRepository = context.getBean(PositionRepository.class);
		sellerRepository = context.getBean(SellerRepository.class);
	}

	@Test
	public void testIsValideBasarNumber() {
		final long basarNumber = 100L;
		Seller seller = new Seller();
		seller.setBasarNumber(basarNumber);
		sellerRepository.insertSeller(seller);
		assertTrue(saleService.isValideBasarNumber(basarNumber));
	}
	
	@Test
	public void testIsValideBasarNumber_False() {
		final long basarNumber = 101L;
		assertFalse(saleService.isValideBasarNumber(basarNumber));
	}

}
