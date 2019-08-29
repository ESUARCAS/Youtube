package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheResult implements Question<Boolean> {
    public static TheResult wasSuccessful() {
        return new TheResult();
    }

    public static Question<Boolean> equalsToExpectedResult(){ return new TheResult();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String obtainedResult = actor.recall("ObtainedResult");
        String expectedResult = actor.recall("ExpectedResult");
        return obtainedResult.equals(expectedResult);
    }
}
