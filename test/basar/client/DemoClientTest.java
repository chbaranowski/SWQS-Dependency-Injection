package basar.client;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/core-context.xml")
public class DemoClientTest {

	@Autowired
	DemoClient demoClient;
	
	@Test
	public void testIsOk() {
		assertTrue(demoClient.isOk());
	}

}
