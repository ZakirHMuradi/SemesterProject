package com.example.caloriescalculator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class Controller {

    private double calories;

    @FXML
    private TextField ageInput;
    @FXML
    private TextField weightInput;
    @FXML
    private TextField heightInput;
    @FXML
    private ChoiceBox<String> genderInput;
    @FXML
    private ChoiceBox<String> activityLevelInput;
    @FXML
    private TextArea resultTextArea;

    public void initialize() {
        ObservableList<String> genderChoice = FXCollections.observableArrayList("Male", "Female", "Others");
        ObservableList<String> levels = FXCollections.observableArrayList("Sedentary: little or no exercise", "Light: 1-3 times/week", "Moderate: 4-5 times/week", "Active: daily exercise", "Intense");
        genderInput.setItems(genderChoice);
        activityLevelInput.setItems(levels);
    }

    public void calculateButtonClicked() {
        System.out.println("The Programmer is progress, please wait!!!");
        int age = Integer.parseInt(ageInput.getText());
        double weight = Double.parseDouble(weightInput.getText());
        double height = Double.parseDouble(heightInput.getText());


        double bmrCalories;
        if (genderInput.getSelectionModel().getSelectedItem().equals("Male")) {
            bmrCalories = 66 + (6.23 * weight) + (12.7 * height * 12) - (6.76 * age);
        }else {
            bmrCalories = 65.5 + (4.35 * weight) + (4.7 * height * 12) - (4.7 * age);
        }


        String activityLevelChoice = activityLevelInput.getSelectionModel().getSelectedItem();
        switch (activityLevelChoice) {
            case "Sedentary: little or no exercise" -> calories = bmrCalories * 1.2;
            case "Light: 1-3 times/week" -> calories = bmrCalories * 1.375;
            case "Moderate: 4-5 times/week" -> calories = bmrCalories * 1.55;
            case "Active: daily exercise" -> calories = bmrCalories * 1.725;
            case "Intense" -> calories = bmrCalories * 1.9;
        }

        resultTextArea.setText("Your exercise result is: " + Math.round(calories) +" Calories");
    }

}