package tasks;

import interactions.Enter;
import interactions.Select;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import user_interfaces.Youtube;
import static user_interfaces.Youtube.OBTAINED_RESULT;

public class Login implements Task {
    private String user;
    private String password;
    private String video;

    public Login(String user, String password, String video) {
        this.user = user;
        this.password = password;
        this.video = video;
    }

    public Login() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String expectedResult = String.valueOf(video);
        actor.remember("ExpectedResult", expectedResult);
        actor.attemptsTo(Select.account());
        actor.attemptsTo(Select.signIn());
        actor.attemptsTo(Select.addAccount());
        Youtube.EMAIL.resolveFor(actor).waitUntilVisible();
        actor.attemptsTo(Select.email());
        Youtube.EMAIL.resolveFor(actor).waitUntilVisible();
        actor.attemptsTo(Enter.email2(user));
        actor.attemptsTo(Select.next());
        Youtube.PASSWORD.resolveFor(actor).waitUntilVisible();
        actor.attemptsTo(Enter.password1(password));
        actor.attemptsTo(Select.next2());
        Youtube.AGREE.resolveFor(actor).waitUntilVisible();
        actor.attemptsTo(Select.agree());
        Youtube.MORE.resolveFor(actor).waitUntilVisible();
        actor.attemptsTo(Select.more());
        actor.attemptsTo(Select.accept());
        Youtube.SEARCH.resolveFor(actor).waitUntilVisible();
        actor.attemptsTo(Select.search());
        actor.attemptsTo(Enter.searchVideo(video));
        actor.attemptsTo(Select.searchLens());
        Youtube.VIDEO_NAME.resolveFor(actor).waitUntilVisible();
        actor.attemptsTo(Select.videoName());
        actor.remember("ObtainedResult", OBTAINED_RESULT.resolveFor(actor).getText());
    }
}
