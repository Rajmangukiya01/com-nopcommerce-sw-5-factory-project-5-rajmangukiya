package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement checkRegisterText;
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement gender;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement day;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement month;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement year;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement checkRegistrationText;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueTab;


    public String verifyRegisterText() {
        Reporter.log("Verify register text" + checkRegisterText.toString());
        return getTextFromElement(checkRegisterText);
    }

    public void mandatoryFields() {
        Reporter.log("Click on gender" + gender.toString());
        Reporter.log("Enter first name" + firstName.toString());
        Reporter.log("Enter last name" + lastName.toString());
        Reporter.log("Select day" + day.toString());
        Reporter.log("Select month" + month.toString());
        Reporter.log("Select year" + year.toString());
        Reporter.log("Enter email" + email.toString());
        Reporter.log("Enter password" + password.toString());
        Reporter.log("Enter confirm password" + confirmPassword.toString());

        clickOnElement(gender);
        sendTextToElement(firstName, "Abc");
        sendTextToElement(lastName, "Def");
        selectByVisibleTextFromDropDown(day, "2");
        selectByVisibleTextFromDropDown(month, "May");
        selectByVisibleTextFromDropDown(year, "1995");
        sendTextToElement(email, "Abc959@gmail.com");
        sendTextToElement(password, "Abc@010");
        sendTextToElement(confirmPassword, "Abc@010");
    }

    public void clickOnRegistrationButton() {
        Reporter.log("Click on registration button" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyRegistrationText() {
        Reporter.log("Verify registration text" + checkRegistrationText.toString());
        return getTextFromElement(checkRegistrationText);
    }

    public void clickOnContinueTab() {
        Reporter.log("Click on continue tab" + continueTab.toString());
        clickOnElement(continueTab);
    }
}
