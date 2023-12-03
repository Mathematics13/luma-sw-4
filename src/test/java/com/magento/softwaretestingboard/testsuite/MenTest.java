package com.magento.softwaretestingboard.testsuite;

import com.magento.softwaretestingboard.pages.MenPage;
import com.magento.softwaretestingboard.testbase.TestBase;
import org.testng.annotations.Test;

public class MenTest extends TestBase
{
    MenPage menPage = new MenPage();
    @Test
    public void userShouldAddProductSuccessfullyToshoppingCart()
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
        menPage. verifyProductsize32Text();
        menPage.verifyBlackColourText();
    }
}
