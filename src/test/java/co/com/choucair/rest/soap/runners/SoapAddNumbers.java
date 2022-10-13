package co.com.choucair.rest.soap.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add_two_numbers.feature",
        glue = {"co.com.choucair.rest.soap.stepdefinitions",
                "co.com.choucair.rest.soap.utils"},
        snippets = CAMELCASE)

public class SoapAddNumbers {
}
