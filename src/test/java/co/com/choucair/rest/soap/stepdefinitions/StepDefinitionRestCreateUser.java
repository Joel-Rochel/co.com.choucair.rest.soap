package co.com.choucair.rest.soap.stepdefinitions;

import co.com.choucair.rest.soap.model.ModelCreateUserRest;
import co.com.choucair.rest.soap.questions.LastResponseStatusCode;
import co.com.choucair.rest.soap.tasks.CrateUserRest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.choucair.rest.soap.utils.Constant.VALUE;

public class StepDefinitionRestCreateUser {

    @When("^you create an user$")
    public void youCreateAnUser(List<ModelCreateUserRest> modelCreateUserRests) {
        OnStage.theActorInTheSpotlight().attemptsTo(CrateUserRest.with(modelCreateUserRests));
    }

    @Then("^I should see the user created$")
    public void iShouldSeeTheUserCreated() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LastResponseStatusCode.is(VALUE)));
    }

}
