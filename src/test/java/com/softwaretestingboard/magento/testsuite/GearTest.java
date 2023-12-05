package com.softwaretestingboard.magento.testsuite;
/**
 * 6.Write down the following test into ‘GearTest’ class
 * 1. userShouldAddProductSuccessFullyTo
 * ShoppinCart()
 * * Mouse Hover on Gear Menu
 * * Click on Bags
 * * Click on Product Name ‘Overnight Duffle’
 * * Verify the text ‘Overnight Duffle’
 * * Change Qty 3
 * * Click on ‘Add to Cart’ Button.
 * * Verify the text
 *
 * ‘You added Overnight Duffle to your shopping cart.’
 * * Click on ‘shopping cart’ Link into
 * message
 * * Verify the product name ‘Cronus Yoga Pant’
 * * Verify the Qty is ‘3’
 * * Verify the product price ‘$135.00’
 * * Change Qty to ‘5’
 * * Click on ‘Update Shopping Cart’ button
 * * Verify the product price ‘$225.00’
 */

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

public class GearTest extends TestBase {

        GearPage gearPage = new GearPage(); //Create objects globally to use throughout all methods
        @Test
        public void userShouldAddProductSuccessfullyToShoppingCart () {
        gearPage.mouseHoverOnGearMenu();
        gearPage.clickOnBags();
        gearPage.clickOnOverNightDuffle();
        gearPage.getTextFromOvernightDuffle();
        gearPage.sendTextToChangeQty("3");
        gearPage.clickOnAddToCartButton();
        gearPage.verifyTheAddedShoppingText();
        gearPage.clickOnShoppingCartLinkIntoMessage();
        gearPage.getTextToVerifyProductOverNightDuffle();
        gearPage.getTextToVerifyQuantityIs3();
        gearPage.getTextToVerifyProductPrice135();
        gearPage.sendTextToVerifyProductPrice135("quantity1");
        gearPage.clickOnUpdateShoppingCartButton();
        gearPage.verifyTheProductprice225();
    }

}

