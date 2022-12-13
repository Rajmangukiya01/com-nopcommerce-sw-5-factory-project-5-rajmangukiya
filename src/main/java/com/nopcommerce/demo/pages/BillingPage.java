package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BillingPage extends Utility {
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//div/button[4]")
    WebElement continueButton;


    public void fillDeliveryAddressFields() {
        Reporter.log("Select country" + country.toString());
        Reporter.log("Select city" + city.toString());
        Reporter.log("Enter address" + address.toString());
        Reporter.log("Enter postcode" + postCode.toString());
        Reporter.log("Enter phone number" + phoneNumber.toString());

        selectByVisibleTextFromDropDown(country, "United Kingdom");
        sendTextToElement(city, "London");
        sendTextToElement(address, "100, High road");
        sendTextToElement(postCode, "E7 0NX");
        sendTextToElement(phoneNumber, "07717223344");
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
