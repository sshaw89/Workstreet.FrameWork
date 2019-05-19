package com.actitime.customertest;

import org.testng.annotations.Test;

import com.actitime.genriclib.BaseClass;

public class CustomerTest extends BaseClass{
	@Test
	public void createCustomerTest() throws Throwable {
		System.out.println(flib.getExcelData("Sheet1", 2, 2));
	}

}
