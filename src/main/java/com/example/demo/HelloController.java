package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label Calculation;
    private Label Percent15;
    private Label Percent10;
    private Label Percent5;
    private Percent perc = new Percent();

    @FXML
    protected void onHelloButtonClick()
    {

        double text=Double.parseDouble(Calculation.getText());
        perc.countSumTrunc(text,15);
        Percent15.setText(perc+" рублей.");
        perc.countSumTrunc(text,10);
        Percent10.setText(perc+" рублей.");
        perc.countSumTrunc(text,5);
        Percent5.setText(perc+" рублей.");
    }
}