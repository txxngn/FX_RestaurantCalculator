package com.example.fx_restaurantcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class RestaurantController {

    RestaurantModel model = new RestaurantModel();

    @FXML
    private ToggleGroup Tip;

    @FXML
    private RadioButton Tip10;

    @FXML
    private RadioButton Tip15;

    @FXML
    private RadioButton Tip20;

    @FXML
    private Button btnCalculate;

    @FXML
    private CheckBox taxCheck;

    @FXML
    private TextField txtFoodCost;

    @FXML
    private TextField txtTotal;

    @FXML
    void calculateResult(ActionEvent event) {
        setTotal(model.calculateTotal(getFoodCost(),getTip(),getTax()));
    }

    //get value from foodcost
    public double getFoodCost(){
        return Double.parseDouble(txtFoodCost.getText());
    }


    //get value from RadioButton TIP
    public double getTip(){
        if (Tip10.isSelected())
            return getFoodCost() * 0.1;
        else if (Tip15.isSelected()) {
            return getFoodCost() * 0.15;
        } else if (Tip20.isSelected()) {
            return getFoodCost() * 0.2;
        } else
            return 0;
    }



    //get tax value from checkbox
    public double getTax(){
        if (taxCheck.isSelected()){
            return getFoodCost() * 0.13;
        }
        else
            return 0;
    }



    //set result to txtTotal
    public void setTotal(double value){
        txtTotal.setText(value+"");
    }


}
