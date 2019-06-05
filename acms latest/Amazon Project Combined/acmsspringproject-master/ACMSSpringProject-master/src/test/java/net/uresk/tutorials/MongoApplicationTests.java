package net.uresk.tutorials;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.acmsmongo.mongo1.MongoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MongoApplication.class)
@WebAppConfiguration
public class MongoApplicationTests {

	@Test
	public void contextLoads() {
	}

}