package co.com.choucair.certification.utest.stepdefinitions;

import OpenUp.OpenUp;
import cucumber.api.java.en.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

//En el paso anterior el equipo en el que estoy realizando la prueba se apaga y no me permite obtener los métodos recomendados por consola

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){ Onstage.setTheStage(new Onlinecast()); }


    public void setstage () { Onstage.setThestage (new onlinecast()); }

    @Given("^Camilo wants to access the community benefits$") public void camiloWantsToAccessTheCommunityBenefits() {
        OnStage.theActorCalled("Camilo"). wasAbleTo(OpenUp.thePage()); //OpenUp.thePage

    }

    @when ("^when the user creation starts$") public void whenTheUserCreationStarts () {

    }

    @Then ("^then actually create the user$") public void thenActuallyCreateTheUser() {

    }
}
