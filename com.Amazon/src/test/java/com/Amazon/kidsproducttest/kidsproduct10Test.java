package com.Amazon.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amazon.generic.common.Baseclass;
@Listeners(com.Amazon.generic.listenerutility.Listener.class)
public class kidsproduct10Test extends Baseclass{
	@Test(groups ="FT")
	public void addproduct() {
		Reporter.log("addproduct-kids product10 successfully ",true);
	}
	
	@Test(groups ="IT")
	public void updateproduct() {
		Reporter.log("updateproduct-kids product10 successfully ",true);
	}
	
	@Test(groups ="ST")
	public void deleteproduct() {
		Reporter.log("deleteproduct-kids product 10successfully ",true);
	}

}
