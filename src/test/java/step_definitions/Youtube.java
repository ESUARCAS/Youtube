package step_definitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import errors.ErrorValidationAssertion;
import interactions.Load;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.TheResult;
import tasks.Login;
import static errors.ErrorValidationAssertion.ERROR_VALIDATION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Youtube {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^I open the Youtube APP$")
    public void iOpenTheYoutubeAPP() {
        aNewActor().wasAbleTo(Load.theApp());
    }

    @When("^I enter the credentials of (.*) with (.*) to acces Youtube and play the (.*)$")
    public void iEnterTheCredentialsOfEsuarcaGmailComWithToAccesYoutubeAndPlayTheOneStrangeRockTrailer(String user, String password, String video) {
        theActorInTheSpotlight().attemptsTo(new Login(user, password, video));
    }

    @Then("^I verify that video reproduced equals to the searched video$")
    public void iVerifyThatVideoReproducedEqualsToTheSearchedVideo() {
        theActorInTheSpotlight().should(seeThat(TheResult.equalsToExpectedResult()).orComplainWith(ErrorValidationAssertion.class, ERROR_VALIDATION));
    }
}




