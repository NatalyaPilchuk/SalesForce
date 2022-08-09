package TestData;

import Models.NewAccountModel;
import utils.FakeMessageGenerator;

public class PrepareNewAccountData {
    public static NewAccountModel getValidData(){
        return NewAccountModel
                .builder()
                .accountName(FakeMessageGenerator.generateAccountName())
                .phone(FakeMessageGenerator.generatePhone())
                .type("Analyst")
                .fax(FakeMessageGenerator.generateFax())
                .website(FakeMessageGenerator.generateWebsite())
                .industry("Banking")
                .employees(FakeMessageGenerator.generateEmployees())
                .annualRevenue(FakeMessageGenerator.generateRevenue())
                .description(FakeMessageGenerator.generateDescription())
                .billingStreet(FakeMessageGenerator.generateStreet())
                .shippingStreet(FakeMessageGenerator.generateStreet())
                .billingCity(FakeMessageGenerator.generateCity())
                .billingZipPostalCode(FakeMessageGenerator.generateZipCode())
                .billingStateProvince(FakeMessageGenerator.generateState())
                .billingCountry(FakeMessageGenerator.generateCountry())
                .shippingCity(FakeMessageGenerator.generateCity())
                .shippingZipPostalCode(FakeMessageGenerator.generateZipCode())
                .shippingStateProvince(FakeMessageGenerator.generateState())
                .shippingCountry(FakeMessageGenerator.generateCountry())
                .build();
    }

}
