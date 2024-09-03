package com.Amazon.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazon.generic.common.Baseclass;

public class kidsproduct9Test extends Baseclass{
	@Test(groups ="FT")
	public void addproduct() {
		Reporter.log("addproduct-kids product 9successfully ",true);
	}
	
	@Test(groups ="IT")
	public void updateproduct() {
		Reporter.log("updateproduct-kids product9 successfully ",true);
	}
	
	@Test(groups ="ST")
	public void deleteproduct() {
		Reporter.log("deleteproduct-kids product9 successfully ",true);
	}

}
