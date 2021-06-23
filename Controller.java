package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.util.Arrays;


public class Controller {

    int num0 = 128;
    int num1 = 64;
    int num2 = 32;
    int num3 = 16;
    int num4 = 8;
    int num5 = 4;
    int num6 = 2;
    int num7 = 1;


    @FXML
    private TextField txtNumber;

    @FXML
    private TextField txtResult;

    @FXML
    private Label lblError;

    @FXML
    private TextField bin1;

    @FXML
    private TextField bin0;

    @FXML
    private TextField bin2;

    @FXML
    private TextField bin3;

    @FXML
    private TextField bin4;

    @FXML
    private TextField bin5;

    @FXML
    private TextField bin6;

    @FXML
    private TextField bin7;


    @FXML
    void OnActionOblicz(ActionEvent event) {

        if (txtNumber.getText().isEmpty()) {

            lblError.setTextFill(Color.RED);
            lblError.setText("Pole jest puste!");
            return;

        }

        ClearFields();

        String StrNumber = txtNumber.getText();

        int IntNumber = 0;

        try {
            IntNumber = Integer.parseInt(StrNumber);
            lblError.setTextFill(Color.GREEN);
            lblError.setText("Podano poprawną liczbę");


        } catch (NumberFormatException e) {

            lblError.setTextFill(Color.RED);
            lblError.setText("Podaj liczbę!");
            return;
        }

        if((IntNumber > 255) || (IntNumber <= 0)){
            lblError.setTextFill(Color.RED);
            lblError.setText("Przekroczyles zakres!");
            ClearFields();
            return;
        }

        //////////////num0

        if ((IntNumber / num0) < 1) {
            SetRed(bin0);
            SetResult(0);
        }

        if ((IntNumber / num0) >= 1) {
            SetGreen(bin0);
            IntNumber = IntNumber - num0;
            SetResult(1);

        }

        /////////////num1

        if ((IntNumber / num1) < 1) {
            SetRed(bin1);
            SetResult(0);
        }

        if ((IntNumber / num1) >= 1) {
            SetGreen(bin1);
            IntNumber = IntNumber - num1;
            SetResult(1);
        }


        /////////////num2
        if ((IntNumber / num2) < 1) {
            SetRed(bin2);
            SetResult(0);
        }

        if ((IntNumber / num2) >= 1) {
            SetGreen(bin2);
            IntNumber = IntNumber - num2;
            SetResult(1);
        }


        /////////////num3
        if ((IntNumber / num3) < 1) {
            SetRed(bin3);
            SetResult(0);
        }

        if ((IntNumber / num3) >= 1) {
            SetGreen(bin3);
            IntNumber = IntNumber - num3;
            SetResult(1);
        }


        /////////////num4
        if ((IntNumber / num4) < 1) {
            SetRed(bin4);
            SetResult(0);
        }

        if ((IntNumber / num4) >= 1) {
            SetGreen(bin4);
            IntNumber = IntNumber - num4;
            SetResult(1);
        }


        /////////////num5
        if ((IntNumber / num5) < 1) {
            SetRed(bin5);
            SetResult(0);
        }

        if ((IntNumber / num5) >= 1) {
            SetGreen(bin5);
            IntNumber = IntNumber - num5;
            SetResult(1);
        }


        /////////////num6
        if ((IntNumber / num6) < 1) {
            SetRed(bin6);
            SetResult(0);
        }

        if ((IntNumber / num6) >= 1) {
            SetGreen(bin6);
            IntNumber = IntNumber - num6;
            SetResult(1);
        }


        /////////////num7
        if ((IntNumber / num7) < 1) {
            SetRed(bin7);
            SetResult(0);
        }

        if ((IntNumber / num7) >= 1) {
            SetGreen(bin7);
            IntNumber = IntNumber - num7;
            SetResult(1);
        }

    }

    @FXML
    void OnActionWyczysc(ActionEvent event) {
    ClearFields();
    txtNumber.setText("");
    lblError.setText("");
    }

    private void ClearFields(){

        //Wyczyść pola przed kolejną liczbą
        for (TextField textField : Arrays.asList(bin0, bin1, bin2, bin3, bin4, bin5, bin6, bin7)) {
            textField.setStyle("-fx-background-color: white;");
        }

        txtResult.setText("");
    }

    private void SetGreen(TextField FieldName){
        FieldName.setStyle("-fx-background-color: GREEN;");
    }

    private void SetRed(TextField FieldName){
        FieldName.setStyle("-fx-background-color: RED;");
    }

    private void SetResult(int Number){ txtResult.setText(txtResult.getText() + Number); }
}

