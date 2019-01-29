package practice;

import org.testng.annotations.Test;

public class GroupExecution {
			@Test(groups= {"SmokeTest"},priority=2)
			public void createCampaign() {
				System.out.println("campaign test is executed");
			}
			@Test(groups= {"SmokeTest","RegretionTest"},priority=1)
			public void newCampaign() {
				System.out.println("new campaign is being executed");
			}
			@Test(groups= {"RegretionTest"},priority=3)
			public void deleteCampaign() {
				System.out.println("campaign is deleted");
			}
}
