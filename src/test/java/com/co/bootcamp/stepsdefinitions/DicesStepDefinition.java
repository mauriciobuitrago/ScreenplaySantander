package com.co.bootcamp.stepsdefinitions;

import com.co.bootcamp.questions.ValidationTextDices;
import com.co.bootcamp.tasks.NumberGame;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class DicesStepDefinition {


    @When("^he user throw dices$")
    public void heUserThrowDices() {
        OnStage.theActorInTheSpotlight().attemptsTo(NumberGame.throwDice());

    }

    @Then("^he user should see the result$")
    public void heUserShouldSeeTheResult() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationTextDices.vadilate()
        , Matchers.equalTo("Guess the number...")));
    }

}
