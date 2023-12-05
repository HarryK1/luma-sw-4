package com.softwaretestingboard.magento.testsuite;
/**
 * 2. Write down the following test into ‘MenTest’
 * class
 * 1. userShouldAddProductSuccessFullyTo
 * ShoppinCart()
 * * Mouse Hover on Men Menu
 * * Mouse Hover on Bottoms
 * * Click on Pants
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on size
 * 32.
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on colour
 * Black.
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on
 * ‘Add To Cart’ Button.
 * * Verify the text
 * ‘You added Cronus Yoga Pant to your shopping cart.’
 * * Click on ‘shopping cart’ Link into
 * message
 * * Verify the text ‘Shopping Cart.’
 * * Verify the product name ‘Cronus Yoga Pant’
 * * Verify the product size ‘32’
 * * Verify the product colour ‘Black’
 */

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

public class MenTest extends TestBase {
    MenPage menPage = new MenPage();
    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart()
    {
        menPage.mouseHoverOnMenMenu();
        menPage.mouseHoverOnBottoms();
        menPage.mouseHoverOnPantsAndClick();
        menPage.mouseHoverToCronusYogaPant();
        menPage.mouseHoverToCronusYogaPantAndClickSize32();
        menPage.mouseHoverToCronusYogaPantAndClickBlackColour();
        menPage.mouseHoverToCronusAndClickOnAddToCartButton();
        menPage.mouseHoverToCronusYogaPant1();
        menPage.mouseHoverToCronusAndClickOnAddToCartButton1();
        menPage.getTextFromAddedCronusPantInYourShoppingCart();
        menPage.clickOnShoppingCartLinkIntoMessage();
        menPage.verifyShoppingCartText();
        menPage.verifyCronusYogaPantText();
        menPage.verifyProductSize32Text();
        menPage.verifyBlackColourText();
    }
}
