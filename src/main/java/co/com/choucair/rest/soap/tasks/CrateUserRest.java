package co.com.choucair.rest.soap.tasks;

import co.com.choucair.rest.soap.interactions.ConsumeService;
import co.com.choucair.rest.soap.model.ModelCreateUserRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CrateUserRest implements Task {
    private List<ModelCreateUserRest> modelCreateUserRests;

    public CrateUserRest(List<ModelCreateUserRest> modelCreateUserRests) {
        this.modelCreateUserRests = modelCreateUserRests;
    }

    public static CrateUserRest with(List<ModelCreateUserRest> modelCreateUserRests) {
        return Tasks.instrumented(CrateUserRest.class, modelCreateUserRests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.whitPost(modelCreateUserRests.get(0).toString()));
    }
}
