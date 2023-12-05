package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    //Step 1 Find and Locate
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");          //WebElement Find in left side
    By bags = By.xpath("//span[normalize-space()='Bags']");              //Locate in right side
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By overnightDuffleText = By.xpath("//span[@class='base']");
    By changeQuantityTo3 = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    By addedText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By productNameText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By verifyTheQty3 = By.xpath("//input[@title='Qty']");
    By productPrice = By.xpath("//span[@class='cart-price']//span)[2]");
    By qtyChangeTo5 = By.xpath("(//input[@class='input-text qty'])[1]");
    By shoppingCartButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By productPrice225 = By.xpath("(//span[@class='cart-price']//span)[2]");

    //Step 2 Create separate methods

    public void mouseHoverOnGearMenu()
    {
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBags()
    {
        mouseHoverToElementAndClick(bags);
    }
    public void clickOnOverNightDuffle()
    {
        clickOnElement(overnightDuffle);
    }
    public String  getTextFromOvernightDuffle()
    {
        return getTextFromElement(overnightDuffleText);
    }
    public void sendTextToChangeQty(String quantity)
    {
        sendTextToElement(changeQuantityTo3, quantity );
    }
    public void clickOnAddToCartButton()
    {
        clickOnElement(addToCartButton);
    }
    public String  verifyTheAddedShoppingText()
    {
        return getTextFromElement(addedText);
    }
    public void clickOnShoppingCartLinkIntoMessage()
    {
        clickOnElement(shoppingCartLink);
    }
    public String getTextToVerifyProductOverNightDuffle()
    {
        return getTextFromElement(productNameText);
    }
    public String getTextToVerifyQuantityIs3()
    {
        return getTextFromElement(verifyTheQty3);
    }
    public String getTextToVerifyProductPrice135()
    {
        return getTextFromElement(productPrice);
    }
    public void sendTextToVerifyProductPrice135(String quantity1)
    {
        sendTextToElement(qtyChangeTo5 ,quantity1 );
    }
    public void clickOnUpdateShoppingCartButton()
    {
        clickOnElement(shoppingCartButton);
    }
    public String verifyTheProductprice225()
    {
        return getTextFromElement(productPrice225);
    }
}

