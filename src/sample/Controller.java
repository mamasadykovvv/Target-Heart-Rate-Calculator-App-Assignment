package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private TextField ageTextField;

    @FXML
    private TextField maxTextField;

    @FXML
    private TextField targetTextField;

    public void click(ActionEvent actionEvent) {
        int age = Integer.parseInt(ageTextField.getText());
        if(age > 1 && age < 29) {
            maxTextField.setText("210 bpm");
            targetTextField.setText("100-170 beats per minute");
        } else if(age > 30 && age < 34) {
            maxTextField.setText("190 bpm");
            targetTextField.setText("95-162 beats per minute");
        } else if(age > 35 && age < 39) {
            maxTextField.setText("185 bpm");
            targetTextField.setText("93-157 beats per minute");
        } else if(age > 40 && age < 44) {
            maxTextField.setText("180 bpm");
            targetTextField.setText("90-153 beats per minute");
        } else if(age > 45 && age < 49) {
            maxTextField.setText("175 bpm");
            targetTextField.setText("88-149 beats per minute");
        } else if(age > 50 && age < 54) {
            maxTextField.setText("170 bpm");
            targetTextField.setText("85-145 beats per minute");
        } else if(age > 55 && age < 59) {
            maxTextField.setText("165 bpm");
            targetTextField.setText("83-140 beats per minute");
        } else if(age > 60 && age < 64) {
            maxTextField.setText("160 bpm");
            targetTextField.setText("80-136 beats per minute");
        } else if(age > 65 && age < 69) {
            maxTextField.setText("155 bpm");
            targetTextField.setText("78-132 beats per minute");
        } else if(age > 70 && age < 119) {
            maxTextField.setText("150 bpm");
            targetTextField.setText("75-128 beats per minute");
        } else {
            maxTextField.setText("Oops! While you’re never too old to run,");
            targetTextField.setText("you’re too old for this calculator.");
        }
    }
}

