package com.Amazon.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazon.generic.common.Baseclass;

public class kidsproduct5Test extends Baseclass{
	@Test(groups ="FT")
	public void addproduct() {
		Reporter.log("addproduct-kids product5 successfully ",true);
	}
	
	@Test(groups ="IT")
	public void updateproduct() {
		Reporter.log("updateproduct-kids product5 successfully ",true);
	}
	
	@Test(groups ="ST")
	public void deleteproduct() {
		Reporter.log("deleteproduct-kids product5 successfully ",true);
	}

}
