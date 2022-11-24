package com.co.bootcamp.questions;

import com.co.bootcamp.userinterfaces.CalculatorPage;
import cucumber.deps.com.thoughtworks.xstream.io.binary.Token;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

public class CaptureResult implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        return Value.of(CalculatorPage.TXT_RESULT).viewedBy(actor).asString();

    }

    public static CaptureResult validate()
    {
        return new CaptureResult();
    }
}
