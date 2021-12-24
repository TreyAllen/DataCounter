/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datacounter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Trey
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label newLabel;    
    @FXML private Label updateLabel;    
    @FXML private Label inactLabel;    
    @FXML private Label dayOfVerifLabel;    
    @FXML private Label prevDayVerifLabel;    
    //@FXML private Label backLogVerifLabel;    
    @FXML private Label certsCreatedLabel;    
    @FXML private Label cellActivationsLabel;    
    @FXML private TextField newTextBox;    
    @FXML private TextField updateTextBox;    
    @FXML private TextField inactTextBox;    
    @FXML private TextField dayOfVerifTextBox;    
    @FXML private TextField prevDayVerifTextBox;    
    //@FXML private TextField backlogVerifTextBox;    
    @FXML private TextField certsCreatedTextBox;    
    @FXML private TextField cellActivationsTextBox;    
    @FXML private Button newAddButton;    
    @FXML private Button newSubButton;    
    @FXML private Button updateAddButton;    
    @FXML private Button updateSubButton;    
    @FXML private Button inactAddButton;    
    @FXML private Button inactSubButton;    
    @FXML private Button dayOfVerifAddButton;    
    @FXML private Button dayOfVerifSubButton;    
    @FXML private Button prevDayVerifAddButton;    
    @FXML private Button prevDayVerifSubButton;    
//    @FXML private Button backlogVerifAddButton;    
//    @FXML private Button backlogVerifSubButton;    
    @FXML private Button certsCreatedAddButton;    
    @FXML private Button certsCreatedSubButton;    
    @FXML private Button cellActivationsAddButton;    
    @FXML private Button cellActivationsSubButton;    
    @FXML private Button newResetButton;    
    @FXML private Button updateResetButton;    
    @FXML private Button inactResetButton;    
    @FXML private Button dayOfVerifResetButton;    
    @FXML private Button prevDayVerifResetButton;    
    //@FXML private Button backlogVerifResetButton;    
    @FXML private Button certsCreatedResetButton;    
    @FXML private Button cellActivationsResetButton;   
    
    @FXML private void handleIncreaseNewOnClick(ActionEvent event) { increaseCount(newTextBox); }
    
    @FXML private void handleDecreaseNewOnClick(ActionEvent event) { decreaseCount(newTextBox); }
    
    @FXML private void handleIncreaseUpdateOnClick(ActionEvent event) { increaseCount(updateTextBox); }
    
    @FXML private void handleDecreaseUpdateOnClick(ActionEvent event) { decreaseCount(updateTextBox); }
    
    @FXML private void handleIncreaseInactOnClick(ActionEvent event) { increaseCount(inactTextBox); }
    
    @FXML private void handleDecreaseInactOnClick(ActionEvent event) { decreaseCount(inactTextBox); }
    
    @FXML private void handleIncreaseDayOfVerifOnClick(ActionEvent event) { increaseCount(dayOfVerifTextBox); }
    
    @FXML private void handleDecreaseDayOfVerifOnClick(ActionEvent event) { decreaseCount(dayOfVerifTextBox); }
    
    //@FXML private void handleIncreaseBacklogVerifOnClick(ActionEvent event) { increaseCount(backlogVerifTextBox); }
    
    @FXML private void handleIncreasePrevDayVerifOnClick(ActionEvent event) { increaseCount(prevDayVerifTextBox); }
    
    @FXML private void handleDecreasePrevDayVerifOnClick(ActionEvent event) { decreaseCount(prevDayVerifTextBox); }
    
    //@FXML private void handleDecreaseBacklogVerifOnClick(ActionEvent event) { decreaseCount(backlogVerifTextBox); }
    
    @FXML private void handleIncreaseCertsCreatedOnClick(ActionEvent event) { increaseCount(certsCreatedTextBox); }
    
    @FXML private void handleDecreaseCertsCreatedOnClick(ActionEvent event) { decreaseCount(certsCreatedTextBox); }
    
    @FXML private void handleIncreaseCellActivationsOnClick(ActionEvent event) { increaseCount(cellActivationsTextBox); }
    
    @FXML private void handleDecreaseCellActivationsOnClick(ActionEvent event) { decreaseCount(cellActivationsTextBox); }
    
    @FXML private void handleNewResetOnClick(ActionEvent event) { newTextBox.setText("0"); }
    
    @FXML private void handleUpdateResetOnClick(ActionEvent event) { updateTextBox.setText("0"); }
    
    @FXML private void handleInactResetOnClick(ActionEvent event) { inactTextBox.setText("0"); }
    
    @FXML private void handleVerifResetOnClick(ActionEvent event) { dayOfVerifTextBox.setText("0"); }
    
    @FXML private void handlePrevDayVerifResetOnClick(ActionEvent event) { prevDayVerifTextBox.setText("0"); }
    
    //@FXML private void handleBacklogVerifResetOnClick(ActionEvent event) { backlogVerifTextBox.setText("0"); }
    
    @FXML private void handleCertsCreatedResetOnClick(ActionEvent event) { certsCreatedTextBox.setText("0"); }
    
    @FXML private void handleCellActivationsResetOnClick(ActionEvent event) { cellActivationsTextBox.setText("0"); }
    
    private void increaseCount(TextField tf){
        
        int val = Integer.parseInt(tf.getText());
        
        val++;
        
        tf.setText(String.valueOf(val));
        
    }
    
    private void decreaseCount(TextField tf){
        
        int val = Integer.parseInt(tf.getText());
        
        if (val != 0) {
            
            val--;
            
        }
        
        tf.setText(String.valueOf(val));
        
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
