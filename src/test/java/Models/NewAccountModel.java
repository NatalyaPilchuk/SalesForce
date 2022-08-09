package Models;

import lombok.Builder;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Data
@Builder
public class NewAccountModel {
    private String accountName;
    private String phone;
    private String type;
    private String fax;
    private String website;
    private String industry;
    private String employees;
    private String annualRevenue;
    private String description;
    private String billingStreet;
    private String shippingStreet;
    private String billingCity;
    private String billingZipPostalCode;
    private String billingStateProvince;
    private String billingCountry;
    private String shippingCity;
    private String shippingZipPostalCode;
    private String shippingStateProvince;
    private String shippingCountry;


}


