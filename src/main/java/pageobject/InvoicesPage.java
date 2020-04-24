package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicesPage extends BasePage {

    public InvoicesPage(){
    }

    @FindBy(xpath = "//*[contains(@id,'MyYardDisclosure')]/tbody[6]/tr/td[3]")
    private WebElement orderID;

    @FindBy(xpath = "//*[contains(@id,'MyYardDisclosure')]/tbody[5]/tr/td[5]")
    private WebElement company;

    @FindBy(xpath = "//*[contains(@id,'MyYardDisclosure')]/tbody[5]/tr/td[6]")
    private WebElement invoiceAddress;

    @FindBy(xpath = "//*[contains(@id,'MyYardDisclosure')]/tbody[7]/tr/td[2]")
    private WebElement grade;

    @FindBy(xpath = "//*[contains(@id,'MyYardDisclosure')]/tbody[7]/tr/td[3]")
    private WebElement weight;

    @FindBy(xpath = "//*[contains(@id,'MyYardDisclosure')]/tbody[8]/tr/td[8]")
    private WebElement flatCharge;

    @FindBy(xpath = "//*[contains(@id,'MyYardDisclosure')]/tbody[9]/tr/td[8]")
    private WebElement perTonne;

    @FindBy(xpath = "//*[contains(@id,'MyYardDisclosure')]/tbody[11]/tr/td[8]")
    private WebElement item;


    public WebElement getOrderId(){
        return orderID;
    }

    public WebElement getCompany(){
        return company;
    }

    public WebElement getInvoiceAddress(){
        return invoiceAddress;
    }

    public WebElement getGrade(){
        return grade;
    }

    public WebElement getWeight(){
        return weight;
    }

    public WebElement getFlatCharge(){
        return flatCharge;
    }

    public WebElement getPerTonne(){
        return perTonne;
    }

    public WebElement getItem(){
        return item;
    }

}
