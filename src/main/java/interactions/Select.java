package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static user_interfaces.Youtube.*;

public class Select implements Interaction {
    private static Target target;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target));
    }

    public static Select account() {
        target = ACCOUNT;
        return instrumented(Select.class);
    }

    public static Select signIn() {
        target = SIGN_IN;
        return instrumented(Select.class);
    }

    public static Select addAccount() {
        target = ADD_ACCOUNT;
        return instrumented(Select.class);
    }

    public static Select email() {
        target = EMAIL;
        return instrumented(Select.class);
    }

    public static Select next() {
        target = NEXT;
        return instrumented(Select.class);
    }

    public static Select next2() {
        target = NEXT2;
        return instrumented(Select.class);
    }

    public static Select agree() {
        target = AGREE;
        return instrumented(Select.class);
    }

    public static Select more() {
        target = MORE;
        return instrumented(Select.class);
    }

    public static Select accept() {
        target = ACCEPT;
        return instrumented(Select.class);
    }

    public static Select search() {
        target = SEARCH;
        return instrumented(Select.class);
    }

    public static Select searchLens() {
        target = SEARCH_LENS;
        return instrumented(Select.class);
    }

    public static Select videoName() {
        target = VIDEO_NAME;
        return instrumented(Select.class);
    }
}
