package basar.domain.impl;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import basar.domain.Position;
import basar.domain.PositionRepository;
import basar.domain.Sale;
import basar.domain.Seller;
import basar.domain.SellerRepository;
import basar.domain.impl.SaleServiceImpl;

public class SaleServiceImplTest {

	Mockery mockery = new Mockery();
	
	SaleServiceImpl saleServiceImpl;
	
	PositionRepository mockPositionRepository;
	
	SellerRepository mockSellerRepository;
	
	@Before
	public void setup(){
		mockPositionRepository = mockery.mock(PositionRepository.class);
		mockSellerRepository = mockery.mock(SellerRepository.class);
		
		saleServiceImpl = new SaleServiceImpl();
		saleServiceImpl.setPositionRepository(mockPositionRepository);
		saleServiceImpl.setSellerRepository(mockSellerRepository);
	}
	
	@After
	public void tearDown(){
		mockery.assertIsSatisfied();
	}
	
	@Test
	public void testIsValideBasarNumber() {
		final long basarNumber = 100L;
		mockery.checking(new Expectations(){{
			one(mockSellerRepository).getSeller(basarNumber);
			will(returnValue(createSeller(basarNumber)));
		}});
		assertTrue(saleServiceImpl.isValideBasarNumber(basarNumber));
	}

	@Test
	public void testPurchase() {
		final long basarNumber = 100;
		final Seller seller = createSeller(basarNumber);
		final Position hose = new Position();
		hose.setSeller(seller);
		Sale sale = new Sale();
		sale.addPosition(hose);
		mockery.checking(new Expectations(){{
			one(mockSellerRepository).getSeller(basarNumber);
			will(returnValue(createSeller(basarNumber)));
			one(mockPositionRepository).insertPosition(hose);
		}});
		saleServiceImpl.purchase(sale);
	}
	
	protected Seller createSeller(long basarNumber) {
		Seller seller = new Seller();
		seller.setBasarNumber(basarNumber);
		return seller;
	}

}
