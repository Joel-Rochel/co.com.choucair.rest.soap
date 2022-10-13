package co.com.choucair.rest.soap.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class ConsumeService {
    private ConsumeService(){
    }
    public static WithPost whitPost(String body) {
        return Tasks.instrumented(WithPost.class,body);
    }
}
