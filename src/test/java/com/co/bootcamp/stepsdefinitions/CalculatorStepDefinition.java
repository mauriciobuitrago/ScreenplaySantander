package com.co.bootcamp.stepsdefinitions;

import com.co.bootcamp.questions.CaptureResult;
import com.co.bootcamp.tasks.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class CalculatorStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Mauro");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^he user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://testsheepnz.github.io/BasicCalculator.html"));
    }

    @When("^he user made a Minimun$")
    public void heUserMadeAMinimun() {
        OnStage.theActorInTheSpotlight().attemptsTo(Calculator.calculate());

            }

    @Then("^he user could see the result$")
    public void heUserCouldSeeTheResult() {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CaptureResult.validate()
    , Matchers.equalTo(4)));
    }

}
