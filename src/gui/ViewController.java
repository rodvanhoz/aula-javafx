package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

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
}
