package com.co.bootcamp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NumberGamePage {

    public static final Target BTN_NUMBER_GAME = Target.the("select option Number game")
            .locatedBy("//*[text()='Number Game']");

    public static final Target BTN_THE_GAME = Target.the("select the game ")
            .locatedBy("//a[@id='gotoNumberGameButton']");

    public static final Target SELECT_NUMBER_DICES = Target.the("select number dices ")
            .locatedBy("//select[@id='buildNumber']");

    public static final Target BTN_ROLL_DICES = Target.the("roll dices")
            .locatedBy("//input[@id='rollDiceButton']");

 public static final Target LBL_VALIDATION_ROLL = Target.the("valdation")
            .locatedBy("//*[text()='Guess the number...']");


}
