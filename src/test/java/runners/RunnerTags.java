package co.com.choucair.certification.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWith Serenity.class)
@CucumberOptions (
        features="src/test/resources/features/academyChoucair.feature",
        tags="@tag1",
        glue = "co.com.choucair.certificacion.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
