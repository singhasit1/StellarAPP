package com.channel4;


import com.channel4.basest.baseclass;
import com.channel4.pages.AreaPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class TestAreaScreen extends baseclass {
    public static final Logger log = Logger.getLogger(TestAreaScreen.class.getName());

    AreaPage areapage;

    public TestAreaScreen() { super();}

    @Given("^Launch Browser And Application$")
    public void launch_Browser_And_Application() throws Throwable {
        initialization();
        areapage= new AreaPage();
    }
    @When("^Area List  Opens$")
    public void area_List_Opens() throws Throwable {

    }

    @When("^User Clicks on Add Area button$")
    public void user_Clicks_on_Add_Area_button() throws Throwable {
        areapage.clickonArea();
        captureScreen("Add Area",driver);
    }
    @Then("^Area Details  Open$")
    public void area_Details_Open() throws Throwable {
        String Area_Header_Name="Area Details";
        Assert.assertEquals(Area_Header_Name, areapage.AreaDetailScreen());
    }

    @When("^User Provide Area Name As \"([^\"]*)\"$")
    public void User_Provide_Area_Name_As(String Name) throws Throwable {
        areapage.setAreaName(Name);
    }

    @When("^User Provide Area Code As \"([^\"]*)\"$")
    public void User_Provide_Area_Code_As(String Code) throws Throwable {
        areapage.setAreacode(Code);
    }

    @When("^User Provide Audience Set As \"([^\"]*)\"$")
    public void User_Provide_Audience_Set_As(String Audset) throws Throwable {
        areapage.setAudienceSet(Audset);
    }

    @When("^User Provide Descriptions AS \"([^\"]*)\"$")
    public void User_Provide_Descriptions_AS(String Desc) throws Throwable {
        areapage.setAreaDescription(Desc);
    }

    @When("^Click on Submit button$")
    public void click_on_Submit_button() throws Throwable {
        areapage.clickOnSubmit();
    }
    @Then("^Verify That Area Name Created As \"([^\"]*)\"$")
    public void verify_That_Area_Name_Created_As(String CreatedArea) throws Throwable {
        Assert.assertEquals(CreatedArea, areapage.createdArea());
    }

    @When("^User Open area \"([^\"]*)\" in amend mode$")
    public void user_Open_area_in_amend_mode(String arg1) throws Throwable {
        areapage.clickOnEdit();
    }

    @Then("^Verify that area name changed to \"([^\"]*)\"$")
    public void verify_that_area_name_changed_to(String AmendAreaName) throws Throwable {
        Assert.assertEquals(AmendAreaName, areapage.VerifyAmendArea());
    }

    @Then("^Clcik on Submit Button$")
    public void clcik_on_Submit_Button() throws Throwable {
        areapage.clickOnSubmit();
    }
    @When("^User Select Area Name As \"([^\"]*)\"$")
    public void user_Select_Area_Name_As(String AreaName) throws Throwable {

    }

    @Then("^User Clicks on Amend Area button$")
    public void user_Clicks_on_Amend_Area_button() throws Throwable {
        areapage.clickOnEdit();
    }

    @Then("^User Change Area Name From North England To \"([^\"]*)\"$")
    public void User_Change_Area_Name_From_North_England_To(String ChangeAreaName) throws Throwable {
        areapage.AmendAreaName(ChangeAreaName);
    }

    @Then("^Verify That Area Name Changed to \"([^\"]*)\"$")
    public void verify_That_Area_Name_Changed_to(String arg1) throws Throwable {

    }
    @Then("^User Clicks On  Delete Area Button$")
    public void user_Clicks_On_Delete_Area_Button() throws Throwable {
        areapage.DeleteArea();
    }

    @Then("^System Warn A Message That \"([^\"]*)\"$")
    public void system_Warn_A_Message_That(String ActualWarningMessage) throws Throwable {
        System.out.println("Delete Waring message"+driver.switchTo().alert().getText());
        Assert.assertEquals(ActualWarningMessage, areapage.WaringDeleteMessage());
    }

    @When("^User Click On Ok Button$")
    public void user_Click_On_Ok_Button() throws Throwable {
        driver.switchTo().alert().accept();
    }

    @Then("^Verify That Area Name \"([^\"]*)\" Deleted From The Area List$")
    public void verify_That_Area_Name_Deleted_From_The_Area_List(String arg1) throws Throwable {
     Assert.assertEquals(5,areapage.rowCount());

    }
    @Then("^Close The Browser$")
    public void close_The_Browser() throws Throwable {
        driver.quit();
    }




}
