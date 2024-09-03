package com.Amazon.electronicsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazon.generic.common.Baseclass;

public class ElectronicProductTest extends Baseclass{
	@Test(groups="FT")
	public void addproduct() {
		Reporter.log("add product- electronic product successfully",true);
	}
	@Test(groups="IT")
	public void updateproduct() {
		Reporter.log("update product- electronic product successfully",true);
		
	}
	@Test(groups="ST")
	public void deleteproduct() {
		Reporter.log("delete product- electronic product successfully",true);
		
	}

}
