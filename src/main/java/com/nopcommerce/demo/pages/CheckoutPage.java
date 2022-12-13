package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailId;
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
    @FindBy(name = "save")
    WebElement continueButton;
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayButton;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    WebElement clickContinue;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement on2ndDayAir;
    @CacheLookup
    @FindBy(xpath = "//form/div[2]/button[1]")
    WebElement clickContinueBtn;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardRadioButton;
    @CacheLookup
    @FindBy(xpath = "//li[4]/div[2]/div[1]/button[1]")
    WebElement clickCon;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement visa;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardholderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//li[5]/div[2]/div[1]/button[1]")
    WebElement clickConBtn;

    public void fillMandatoryField() {
        Reporter.log("Enter first name" + firstName.toString());
        Reporter.log("Enter last name" + lastName.toString());
        Reporter.log("Enter email id" + emailId.toString());
        Reporter.log("Select country" + country.toString());
        Reporter.log("Select city" + city.toString());
        Reporter.log("Enter address" + address.toString());
        Reporter.log("Enter postcode" + postCode.toString());
        Reporter.log("Enter phone number" + phoneNumber.toString());
        Reporter.log("Click on continue button" + continueButton.toString());

        sendTextToElement(firstName, "Jack");
        sendTextToElement(lastName, "Leach");
        sendTextToElement(emailId, "jack991@gmail.com");
        selectByVisibleTextFromDropDown(country, "United Kingdom");
        sendTextToElement(city, "London");
        sendTextToElement(address, "100, High road");
        sendTextToElement(postCode, "A1 2AB");
        sendTextToElement(phoneNumber, "07171002233");
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirButton() {
        Reporter.log("Click on next day button" + nextDayButton.toString());
        clickOnElement(nextDayButton);
    }

    public void setClickContinue() {
        Reporter.log("Click on continue" + clickContinue.toString());
        clickOnElement(clickContinue);
    }

    public void clickOn2ndDayAirButton() {
        Reporter.log("Click on 2nd day air button" + on2ndDayAir.toString());
        clickOnElement(on2ndDayAir);
    }

    public void clickContinue() {
        Reporter.log("Click on continue button" + clickContinueBtn.toString());
        clickOnElement(clickContinueBtn);
    }

    public void selectCreditCardRadioButton() {
        Reporter.log("Select credit card radio button" + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void clickCon() {
        Reporter.log("Click on continue" + clickCon.toString());
        clickOnElement(clickCon);
    }

    public void selectVisaFromDropDown() {
        Reporter.log("Select visa from drop down" + visa.toString());
        selectByVisibleTextFromDropDown(visa, "Visa");
    }

    public void fillCardDetails() {
        Reporter.log("Enter card holder name" + cardholderName.toString());
        Reporter.log("Enter card number" + cardNumber.toString());
        Reporter.log("Select expire month" + expireMonth.toString());
        Reporter.log("Select expire year" + expireYear.toString());
        Reporter.log("Enter card code" + cardCode.toString());

        sendTextToElement(cardholderName, "Abc xyz");
        sendTextToElement(cardNumber, "4222222222222");
        selectByVisibleTextFromDropDown(expireMonth, "04");
        selectByVisibleTextFromDropDown(expireYear, "2025");
        sendTextToElement(cardCode, "643");
    }

    public void clickConBtn() {
        Reporter.log("Click on continue button" + clickConBtn.toString());
        clickOnElement(clickConBtn);
    }
}
