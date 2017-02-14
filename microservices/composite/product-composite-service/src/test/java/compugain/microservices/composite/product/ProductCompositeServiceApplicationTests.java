package compugain.microservices.composite.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import compugain.microservices.composite.product.ProductCompositeServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProductCompositeServiceApplication.class)
@WebAppConfiguration
public class ProductCompositeServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
