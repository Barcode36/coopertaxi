/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import coopertaxi.PUsuario;
import coopertaxi.TabelaUser;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

/**
 *
 * @author PC-ASUS
 */
public class ControlPrincipal implements Initializable {


    @FXML
    MenuItem fechar;

    @FXML
    MenuItem idCadUser;

    @Override
    public void initialize(java.net.URL location,
            java.util.ResourceBundle resources) {
        idCadUser.setAccelerator(
                KeyCombination.keyCombination("SHORTCUT+U")
        );
    }

    @FXML
    void cadusuario(ActionEvent event) {
        try {
            new PUsuario().start(new Stage());
            
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    @FXML
    void viewUsuario(ActionEvent event) {
        try {
            new TabelaUser().start(new Stage());
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    @FXML
    private void sairSistema() {
        Platform.exit();
    }

}
