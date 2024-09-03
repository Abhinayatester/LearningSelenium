package com.Amazon.producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazon.generic.common.Baseclass;

public class commonproduct extends Baseclass{
	@Test(groups="FT")
	public void addproduct() {
		Reporter.log("addproduct-common product successfully ",true);
	}
	
	@Test(groups="IT")
	public void updateproduct() {
		Reporter.log("updateproduct-common product successfully ",true);
	}
	@Test(groups="ST")
	public void deleteproduct() {
		Reporter.log("deleteproduct-common product successfully ",true);
	}

}
