package compugain.microservises.core.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import compugain.microservises.core.product.ProductServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProductServiceApplication.class)
@WebAppConfiguration
public class ProductServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
