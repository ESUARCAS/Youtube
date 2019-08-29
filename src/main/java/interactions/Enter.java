package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static user_interfaces.Youtube.*;

public class Enter implements Interaction {
    private static Target target;
    private String login;

    public Enter(String login) {
        this.login = login;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {;
        actor.attemptsTo(SendKeys.of(login).into(target));
    }

    public static Enter email2(String user) {
        target = EMAIL;
        return instrumented(Enter.class, user);
    }

    public static Enter password1(String password) {
        target = PASSWORD;
        return instrumented(Enter.class, password);
    }

    public static Enter searchVideo(String video) {
        target = SEARCH_VIDEO;
        return instrumented(Enter.class, video);
    }

}
