package com.channel4.pages;


import com.channel4.basest.baseclass;
import com.channel4.helper.javascript.JavaScriptHelper;
import com.channel4.helper.wait.WaitHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class AreaPage extends baseclass {

    public static final Logger log = Logger.getLogger(AreaPage.class.getName());

    WaitHelper waithelper = new WaitHelper(driver);
    JavaScriptHelper javaScripthelper = new JavaScriptHelper(driver);

    @FindBy(xpath = "//*[contains(text(),'Add Area')]")
    private  WebElement AreaLink;

    @FindBy(xpath = "//h4[contains(text(),'Area Details')]")
    private  WebElement AreaHeader;

    @FindBy(xpath = "//input[@id='inputEmail3' and @name='areaName' and @type='text']")
    private  WebElement AreaName;

    @FindBy(xpath = "//input[@name='areaCode']")
    private  WebElement AreaCode;

    @FindBy(xpath = "//select[@name='audienceSetKey']")
    private  WebElement AudienceSetkey;

    @FindBy(xpath = "//textarea[@name='areaDescription']")
    private  WebElement Description;

    @FindBy(xpath = "//button[@name='submit']")
    private  WebElement SubmitButton;

    @FindBy(xpath = "//*[@id='my_table']/tbody/tr[5]/td[1]")
    private WebElement CreatedAreaName;

    @FindBy(xpath = "//*[@id=\"my_table\"]/tbody/tr")
    private List<WebElement> AreaList;

    @FindBy(xpath = "//*[@id=\"my_table\"]/tbody/tr[5]/td[4]/i[1]")
    private WebElement EditArea;

    @FindBy(xpath = "//*[@id=\"my_table\"]/tbody/tr[5]/td[4]/i[2]")
    private WebElement DeleteArea;



    public AreaPage() {
        PageFactory.initElements(driver, this);

    }

    public void clickonArea() throws InterruptedException{
        waithelper.waitForElement(AreaLink,30);

        javaScripthelper.clickElement(AreaLink);
       log.info("Click on Add Area...");
    }

    public String AreaDetailScreen(){

        String Getareaheader=AreaHeader.getAttribute("innerHTML");
        return Getareaheader;
    }

    public void setAreaName(String areaname ) throws InterruptedException {

        AreaName.sendKeys(areaname);
        Thread.sleep(500);
    }
    public void setAreacode(String areacode ){
        AreaCode.sendKeys(areacode);
    }
    public void setAudienceSet(String SetAudienceName) throws InterruptedException{
        Select AudSet = new Select(AudienceSetkey);
        Thread.sleep(500);
        AudSet.selectByVisibleText(SetAudienceName);

    }
    public void setAreaDescription(String AreaDescription ){
        Description.sendKeys(AreaDescription);
    }
    public void clickOnSubmit() throws InterruptedException{
        SubmitButton.click();
        Thread.sleep(2000);
    }

    public String createdArea(){
        String areaname=CreatedAreaName.getAttribute("innerHTML");
        return areaname;
    }

    public void clickOnEdit() throws InterruptedException{
        waithelper.waitForElement(EditArea,30);
        javaScripthelper.clickElement(EditArea);
       }
    public void AmendAreaName(String Name4) throws InterruptedException{
       waithelper.waitForElement(AreaName,30);
       AreaName.click();
       AreaName.clear();
       AreaName.sendKeys(Name4);
      }

    public String VerifyAmendArea(){
        String AmendArea=  CreatedAreaName.getAttribute("innerHTML");
        return AmendArea;
    }
    public void DeleteArea() throws InterruptedException {
        waithelper.waitForElement(DeleteArea,30);
        javaScripthelper.clickElement(DeleteArea);
       // DeleteArea.click();
        Thread.sleep(1000);
    }
    public String WaringDeleteMessage(){
        String WarningMessage=driver.switchTo().alert().getText();
        return WarningMessage;
    }
    public boolean deletedRecord(){
        return CreatedAreaName.isDisplayed();
    }
   public int rowCount(){
        return AreaList.size();
   }


}
