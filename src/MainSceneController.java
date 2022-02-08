import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainSceneController {
    @FXML
    private TextField textField;

    @FXML
    void clearButton(ActionEvent event) {
        textField.setText("");
    }

    @FXML
    void deleteButton(ActionEvent event) {
        // working
        textField.setText(Manipulator.deleteLastChar(textField.getText()));
    }

    @FXML
    void equalsButton(ActionEvent event) {
        textField.setText(textField.getText() + "=");
    }

    @FXML
    void pointButton(ActionEvent event) {
        textField.setText(textField.getText() + ".");
    }

    @FXML
    void percentButton(ActionEvent event) {
        textField.setText(textField.getText() + "%");
    }

    @FXML
    void plusButton(ActionEvent event) {
        textField.setText(textField.getText() + "+");
    }

    @FXML
    void minusButton(ActionEvent event) {
        textField.setText(textField.getText() + "-");
    }

    @FXML
    void multiplyButton(ActionEvent event) {
        textField.setText(textField.getText() + "x");
    }

    @FXML
    void divideButton(ActionEvent event) {
        textField.setText(textField.getText() + "/");
    }

    @FXML
    void button0(ActionEvent event) {
        textField.setText(textField.getText() + "0");
    }

    @FXML
    void button1(ActionEvent event) {
        textField.setText(textField.getText() + "1");
    }

    @FXML
    void button2(ActionEvent event) {
        textField.setText(textField.getText() + "2");
    }

    @FXML
    void button3(ActionEvent event) {
        textField.setText(textField.getText() + "3");
    }

    @FXML
    void button4(ActionEvent event) {
        textField.setText(textField.getText() + "4");
    }

    @FXML
    void button5(ActionEvent event) {
        textField.setText(textField.getText() + "5");
    }

    @FXML
    void button6(ActionEvent event) {
        textField.setText(textField.getText() + "6");
    }

    @FXML
    void button7(ActionEvent event) {
        textField.setText(textField.getText() + "7");
    }

    @FXML
    void button8(ActionEvent event) {
        textField.setText(textField.getText() + "8");
    }

    @FXML
    void button9(ActionEvent event) {
        textField.setText(textField.getText() + "9");
    }

}
