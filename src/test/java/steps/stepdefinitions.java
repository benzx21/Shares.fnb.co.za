package steps;

import base.FrameworkConfig;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CreateUserPage;

public class stepdefinitions {
    @Given("I navigate to the application")
    public void i_navigate_to_the_application() {
        FrameworkConfig.LocalPage.navigate("https://shares.fnb.co.za/#!/");
    }




    @And("I click the openaccount button")
    public void iClickTheOpenaccountButton() {
        CreateUserPage createUserPage = new CreateUserPage();
        createUserPage.clickOpenAccount();
    }

    @And("I enter the title")
    public void iEnterTheTitle(String title) {

    }


    @And("I enter the title as {string}")
    public void iEnterTheTitleAs(String title) {
        CreateUserPage createUserPage = new CreateUserPage();
        createUserPage.enterTitle(title);
    }

    @And("I enter the firstname as {string}")
    public void iEnterTheFirstnameAs(String name) {
        CreateUserPage createUserPage = new CreateUserPage();
        createUserPage.enterTitle(name);
    }
}
