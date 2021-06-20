package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Categories {

    @FXML
    private Label showId;
    @FXML
    private Label showname;
    @FXML
    private Label showtype;
    @FXML
    private TextField text_name;
    @FXML
    private TextField text_type;
    @FXML
    private TextField text_Id;
    private String category_Id="ID";    //ID set as default value
    private String category_Name="name";    //name set as default value
    private String measuring_type="type";    // consider about only two methods, default ano-of-items method

    public void saveOnAction(ActionEvent actionEvent) throws IOException {
        category_Id=text_Id.getText();
        category_Name=text_name.getText();
        measuring_type=text_type.getText();

        showId.setText(category_Id);
        showname.setText(category_Name);
        showtype.setText(measuring_type);

        NewCategory newCategory= new NewCategory();
//        newCategory.showItems(category_Id, category_Name, measuring_type);
        try {
            Stage stage = new Stage();
            stage.setTitle("New Category");
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("newCategory.fxml"))));
            stage.show();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
