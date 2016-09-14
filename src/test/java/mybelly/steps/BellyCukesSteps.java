package mybelly.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import mybelly.Belly;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BellyCukesSteps {
    private Belly belly;
    private int waitingTime;

    @Given("^I have (\\d+) (?:cuke|cukes) in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly = new Belly();
        belly.eatCukes(cukes);
    }

    @Then("^My belly should (?:be )?\"([^\"]*)\"$")
    public void my_belly_should(String expectedSound) throws Throwable {
        String actualSound = belly.getSound(waitingTime);
        assertThat(actualSound, is(expectedSound));
    }
}
