package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class AirbnbSteps {

    LoginScreen loginscreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailScreen;

    @Step("Click en cerrar")
    public void clickClose() {
        loginscreen.clickClose();
    }

    @Step("Búsqueda por texto {0]")
    public void searchByText(String place){
        searchScreen.clickSearchInput();
        searchDetailScreen.enterSearchInput(place);
        searchDetailScreen.clickFirstOption();
        searchDetailScreen.clickNext();
        searchDetailScreen.clickSearch();

    }

    public String getResultText() {
        return searchScreen.getResultText();
    }
}
