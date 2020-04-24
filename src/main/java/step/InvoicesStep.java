package step;

import org.openqa.selenium.WebElement;
import pageobject.InvoicesPage;
import util.CustomLogger;
import util.WaitUtils;

public class InvoicesStep extends BaseStep{

    public InvoicesStep(){}

    InvoicesPage invoicesPage = new InvoicesPage();

    public String getOrderIdText(){
        WebElement orderId = invoicesPage.getOrderId();
        WaitUtils.waitForElementVisible(orderId);
        String orderIdText = orderId.getText();
        CustomLogger.info("Getting order ID text: " + orderIdText);
        return orderIdText;
    }

    public String getCompanyText(){
        WebElement company = invoicesPage.getCompany();
        WaitUtils.waitForElementVisible(company);
        String companyText = company.getText();
        CustomLogger.info("Getting company text: " + companyText);
        return companyText;
    }

    public String getInvoiceAddressText(){
        WebElement invoiceAddress = invoicesPage.getInvoiceAddress();
        WaitUtils.waitForElementVisible(invoiceAddress);
        String invoiceAddressText = invoiceAddress.getText();
        CustomLogger.info("Getting invoice address text: " + invoiceAddressText);
        return invoiceAddressText;
    }

    public String getGradeText(){
        WebElement grade = invoicesPage.getGrade();
        WaitUtils.waitForElementVisible(grade);
        String gradeText = grade.getText();
        CustomLogger.info("Getting grade text: " + gradeText);
        return gradeText;
    }

    public String getWeightText(){
        WebElement weight = invoicesPage.getWeight();
        WaitUtils.waitForElementVisible(weight);
        String weightText = weight.getText();
        CustomLogger.info("Getting weight text: " + weightText);
        return weightText;
    }

    public String getFlatChargeText(){
        WebElement flatCharge = invoicesPage.getFlatCharge();
        WaitUtils.waitForElementVisible(flatCharge);
        String flatChargeText = flatCharge.getText();
        CustomLogger.info("Getting flat charge text: " + flatChargeText);
        return flatChargeText;
    }

    public String getPerToneText(){
        WebElement perTone = invoicesPage.getPerTonne();
        WaitUtils.waitForElementVisible(perTone);
        String perToneText = perTone.getText();
        CustomLogger.info("Getting per tone text: " + perToneText);
        return perToneText;
    }

    public String getItemText(){
        WebElement item = invoicesPage.getItem();
        WaitUtils.waitForElementVisible(item);
        String itemText = item.getText();
        CustomLogger.info("Getting item text: " + itemText);
        return itemText;
    }

}
