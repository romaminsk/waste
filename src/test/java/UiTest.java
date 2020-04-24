import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import step.InvoicesStep;
import util.JsonDataReader;

import java.util.Map;

public class UiTest extends BaseTest {

    private static Map<String, String> searchData;

    private InvoicesStep invoicesStep;

    @BeforeClass
    public void preparationForTest() {
        searchData = JsonDataReader.getSearchData();
        invoicesStep = new InvoicesStep();
    }

    @Test
    public void checkSearchResults(){
        String orderId = String.valueOf(searchData.get("orderId"));
        Assert.assertEquals(invoicesStep.getOrderIdText(), orderId);
        String company = String.valueOf(searchData.get("company"));
        Assert.assertEquals(invoicesStep.getCompanyText(), company);
        String invoiceAddress = String.valueOf(searchData.get("invoiceAddress"));
        Assert.assertEquals(invoicesStep.getInvoiceAddressText(), invoiceAddress);
        String grade = String.valueOf(searchData.get("grade"));
        Assert.assertEquals(invoicesStep.getGradeText(), grade);
        String weight = String.valueOf(searchData.get("weight"));
        Assert.assertEquals(invoicesStep.getWeightText(), weight);
        String flatCharge = String.valueOf(searchData.get("flatCharge"));
        Assert.assertEquals(invoicesStep.getFlatChargeText(), flatCharge);
        String perTonne = String.valueOf(searchData.get("perTonne"));
        Assert.assertEquals(invoicesStep.getPerToneText(), perTonne);
        String item = String.valueOf(searchData.get("item"));
        Assert.assertEquals(invoicesStep.getItemText(), item);
    }

}
