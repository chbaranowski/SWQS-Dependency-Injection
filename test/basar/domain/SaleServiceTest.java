package basar.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/core-context.xml")
public class SaleServiceTest {
	
	@Autowired
	SaleService saleService;
	
	@Autowired
	PositionRepository positionRepository;
	
	@Autowired
	SellerRepository sellerRepository;
	
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
