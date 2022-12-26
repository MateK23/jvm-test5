package com.example.jvmfx;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class InputController {

    String st[] = { "English", "Math", "Software"};

    @FXML
    private TextField txt_name;
    @FXML
    private TextField txt_surname;
    @FXML
    private TextField txt_age;
    @FXML
    private ChoiceBox<String> choice_faculty;
    // private ChoiceBox choice_faculty = new ChoiceBox(FXCollections.observableArrayList(st));
    // choice_faculty.setItems(FXCollections.observableArrayList(st));
    // private ChoiceBox choice_faculty =  new ChoiceBox<>(FXCollections.observableArrayList(st));




    private void init(){
        choice_faculty.getItems().add("English");
        choice_faculty.getItems().add("German");

    }


    public void loginAction(ActionEvent actionEvent){
        init();

        System.out.println("Student Data: ");
        System.out.println("Name: " + txt_name.getText());
        System.out.println("Surname: " + txt_surname.getText());
        System.out.println("Age: " + txt_age.getText());
        System.out.println("Faculty: " + choice_faculty.getValue());
    }
}
