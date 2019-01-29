package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
			
		@Test
		public void createCampaignTest() {
			System.out.println("step 1");
			System.out.println("step 2");
			
			System.out.println("step 4");
			Assert.assertEquals("Banner ads", "ads");
			System.out.println("step 5");
		}
		@Test
		public void createNewwTest() {
			System.out.println("pass:1");
			System.out.println("pass 2");
			System.out.println("pass-3");
			System.out.println("pass-4");
		}
}
