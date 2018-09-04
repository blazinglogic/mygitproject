package com.selenium.zoho.project.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;
public class LeadTest {

@Test (priority=1)
public void createLeadTest(){
}
@Test(priority=2, dependsOnMethods={"createLeadTest"})
public void convertLeadTest(){
Assert.fail();
}
@Test(priority=3, dependsOnMethods={"createLeadTest","convertLeadTest" })
public void deleteLeadAccountTest(){
}
}

