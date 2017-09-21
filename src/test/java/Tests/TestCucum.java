package Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by zhukov on 4/21/2017.
 */


public class TestCucum {

    @Given("^I logged in main page of JTalks Articles$")
    public void i_logged_in_main_page_of_JTalks_Articles() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given");

    }

    @When("^I click \"([^\"]*)\"$")
    public void i_click(String arg1) {
        // Write code here that turns the phrase above into concrete actions

    }


    @Then("^\"([^\"]*)\" page was opened$")
    public void page_was_opened(String arg1)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^\"([^\"]*)\" tab is activated$")
    public void tab_is_activated(String arg1)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I enter \"([^\"]*)\" to \"([^\"]*)\" textfield$")
    public void i_enter_to_textfield(String arg1, String arg2)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I enter \"([^\"]*)\" to \"([^\"]*)\" textfiled$")
    public void i_enter_to_textfiled(String arg1, String arg2)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I click \"([^\"]*)\" button$")
    public void i_click_button(String arg1)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^new article with \"([^\"]*)\" was created$")
    public void new_article_with_was_created(String arg1)  {
        // Write code here that turns the phrase above into concrete actions

    }


}
