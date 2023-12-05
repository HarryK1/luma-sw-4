package com.softwaretestingboard.magento.testsuite;
/**
 * 1. Write down the following test into WomenTestclass
 * 1. verifyTheSortByProductNameFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click on Jackets
 * * Select Sort By filter “Product Name”
 * * Verify the products name display in
 * alphabetical order
 * 2. verifyTheSortByPriceFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click on Jackets
 * * Select Sort By filter “Price”
 * * Verify the products price display in
 * Low to High
 */

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

public class WomenTest extends TestBase {
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
     public void verifyTheSortByProductNameFilter() throws InterruptedException {
         //Mouse Hover on Women Menu
         womenPage.mouseHoverOnWomenMenu();
         //Mouse Hover on Tops
         womenPage.mouseHoverOnTops();
         //Click on Jackets
         womenPage.clickOnJackets();
         //Select Sort By filter “Product Name”
         womenPage.productListBeforeSorting();
         womenPage.productListAfterSorting();
         womenPage.priceListBeforeSorting();
         womenPage.priceListAfterSorting();
     }
}
