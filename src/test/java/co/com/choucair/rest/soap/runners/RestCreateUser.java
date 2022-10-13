package co.com.choucair.rest.soap.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_user.feature",
        glue = {"co.com.choucair.rest.soap.stepdefinitions","co.com.choucair.rest.soap.utils"},
        snippets = SnippetType.CAMELCASE
)

public class RestCreateUser {
}
