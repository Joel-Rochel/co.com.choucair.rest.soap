package co.com.choucair.rest.soap.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.choucair.rest.soap.utils.enums.RestService.BASE_URL;


public class BeforeHook {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("brandon").whoCan(CallAnApi.at(BASE_URL.toString()));
    }


}
