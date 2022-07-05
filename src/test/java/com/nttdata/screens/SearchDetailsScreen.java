package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchDetailsScreen extends PageObject {

    @AndroidFindBy(id="search_input")
    private WebElement searchDetailInput;

    @AndroidFindBy(id="2131429999")
    private WebElement searchDetailInputText;

    @AndroidFindBy(id="Xpath")
    private WebElement firstOption;

    @AndroidFindBy(id="2131430997")
    private WebElement nextButton;

    @AndroidFindBy(id="2131430822")
    private WebElement searchButton;

    public void  enterSearchInput(String place) {
        searchDetailInput.click();
        searchDetailInputText.sendKeys(place);

    }

    public void clickFirstOption() {
        firstOption.click();
    }

    public void clickNext() {
        nextButton.click();
    }

    public void clickSearch() {

    }





}
