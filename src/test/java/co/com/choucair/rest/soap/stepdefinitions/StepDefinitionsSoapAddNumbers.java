package co.com.choucair.rest.soap.stepdefinitions;

import co.com.choucair.rest.soap.questions.LastResponseStatus;
import co.com.choucair.rest.soap.tasks.AddNumbers;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class StepDefinitionsSoapAddNumbers {
    @When("^you add two number$")
    public void youAddTwoNumber(List<String>values) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddNumbers.with(values));
    }


    @Then("^I should see the response of the service is (\\d+)$")
    public void iShouldSeeTheResponseOfTheServiceIs(int code) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen
                .seeThat("last response status code is 200",
                        LastResponseStatus.isEqualsTo(code))
        );
    }
}
