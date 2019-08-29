package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static user_interfaces.Youtube.MAIN_YOUTUBE;

public class Load implements Interaction {
    public static Load theApp() {
        return instrumented(Load.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        MAIN_YOUTUBE.resolveFor(actor).shouldBeVisible();

    }
}
