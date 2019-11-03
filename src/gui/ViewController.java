package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

	@FXML
	private TextField txtNumero1;

	@FXML
	private TextField txtNumero2;

	@FXML
	private Label lbResultado;

	@FXML
	private Button btSuma;

	@FXML
	public void onBtSomaAction() {
		try {
			Locale.setDefault(Locale.US);
			double nro1 = Double.parseDouble(txtNumero1.getText());
			double nro2 = Double.parseDouble(txtNumero2.getText());

			lbResultado.setText(String.format("%.2f", (nro1 + nro2)));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Erro Soma", null, "Valores incorretos", AlertType.ERROR);
			txtNumero1.setText(null);
			txtNumero2.setText(null);
			lbResultado.setText(null);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		Constraints.setTextFieldDouble(txtNumero1);
		Constraints.setTextFieldDouble(txtNumero2);
		
		Constraints.setTextFieldMaxLength(txtNumero1, 12);
		Constraints.setTextFieldMaxLength(txtNumero2, 12);
		
	}
}
