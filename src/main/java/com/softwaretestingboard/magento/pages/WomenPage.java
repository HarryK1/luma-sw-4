package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {

    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By tops = By.xpath("//a[@id='ui-id-9']");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By jacketsNameListBeforeSorting = By.xpath("//strong[@class='product name product-item-name']//a");
    By filterProductName = By.xpath("(//select[@id='sorter'])[1]\"), \"Product Name\"");
    By jacketsNameListAfterSorting = By.xpath("//strong[@class='product name product-item-name']//a");
    By jacketsPriceListBeforeSorting = By.xpath("//strong[@class='product name product-item-name']//a");
    By filterPrice = By.xpath("(//select[@id='sorter'])[1]\"), \"Price\"");
    By jacketsPriceListAfterSorting = By.xpath("//span[@class='price-wrapper ']//span");
    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
    }
    public void clickOnJackets(){
        clickOnElement(jackets);
    }
     public List<String> productListBeforeSorting() {
         List<WebElement> jacketsElementsList = driver.findElements(jacketsNameListBeforeSorting);
         List<String> jacketsNameListBefore = new ArrayList<>();
         for (WebElement value : jacketsElementsList) {
             jacketsNameListBefore.add(value.getText());
         }
         // Sort the before name list into Ascending Order
         jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
         return jacketsNameListBefore;
     }
     public List<String> productListAfterSorting() throws InterruptedException {
        //select sort by filter Product Name
         selectByVisibleTextFromDropDown(filterProductName, "Product Name");
        List<WebElement> jacketsElementsList = driver.findElements(jacketsNameListAfterSorting);
        List<String> jacketsNameListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsElementsList){
            jacketsNameListAfter.add(value.getText());
        }
        return jacketsNameListAfter;
     }
     public List<Double> priceListBeforeSorting(){
        //sorting jackets price in list
         List<WebElement> jacketsPriceElementList = driver.findElements(jacketsPriceListBeforeSorting);
         List<Double> jacketsPriceListBefore = new ArrayList<>();
         for (WebElement value : jacketsPriceElementList){
             //converting price into double and removing $ from price
             jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$","")));
         }
         //sort the jacketPriceListBefore to ascending order
         Collections.sort(jacketsPriceListBefore);
         return jacketsPriceListBefore;
     }
     public List<Double> priceListAfterSorting() throws InterruptedException {
        //select sort by filter price
         selectByVisibleTextFromDropDown(filterPrice, "Price");
         Thread.sleep(1000);
         //after sorting products by price
         List<WebElement> jacketsPriceElementList = driver.findElements(jacketsPriceListAfterSorting);
         List<Double> jacketsPriceListAfter = new ArrayList<>();
         Thread.sleep(1000);
         for (WebElement value : jacketsPriceElementList){
             //converting price into double and removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$","")));
         }
         return jacketsPriceListAfter;

     }
}

