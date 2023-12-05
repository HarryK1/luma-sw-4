package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //Homepage action takes to WomenPage
    // Mouse Hover on Women Menu
    By mouseHoverWomenMenu = By.xpath("//span[normalize-space()='Women']");
    // Mouse Hover on Tops
    By mouseHoverTop = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    // Click on Jackets

    public void mouseHoverWomenMenu()
    {
        mouseHoverToElement(mouseHoverWomenMenu);
    }

    public void mouseHoverOnTop()
    {
        //waitUntilVisibilityOfElementLocated(mouseHoverTop,10);
        mouseHoverToElement(mouseHoverTop);
        // waitUntilVisibilityOfElementLocated(mouseHoverTop,10);
    }

    //Homepage action takes to MenPage
    By mouseHoverOnMenMenu = By.xpath("//span[normalize-space()='Men']");
    By mouseHoverOnBottom = By.xpath("//a[@id='ui-id-18']");

    //Mouse Hover on Men Menu
    public void mouseHoverMenMenu(){
        mouseHoverToElement(mouseHoverOnMenMenu);
    }
    //Mouse Hover On Bottom
    public void mouseHoverBottom(){
        mouseHoverToElement(mouseHoverOnBottom);
    }

    //Homepage action takes to GearPage

    By mouseHoverGearMenu = By.xpath("//span[normalize-space()='Gear']");

    // Mouse Hover on Gear Menu
    public void mouseHoveOnGearMenu()
    {
        mouseHoverToElement(mouseHoverGearMenu);
    }

}
