package es.aketzagonzalez.aeropuertosO;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * The Class ProductoLabel.
 */
public class ProductoLabel extends GridPane {
	
	/** The lbl nombre producto. */
	@FXML
	protected Label lblNombreProducto;
	
	/** The lbl stock. */
	@FXML
	protected Label lblStock;
	
	/** The img producto. */
	@FXML
	private ImageView imgProducto;

	/**
	 * Instantiates a new producto label.
	 */
	public ProductoLabel() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/componenteTrigo.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	/**
	 * Sets the stock.
	 *
	 * @param cantidad the new stock
	 */
	public void setStock(double cantidad) {
		String style;
		if (cantidad > 100) {
			style = "verde";
		} else if (cantidad > 20) {
			style = "azul";
		} else {
			style = "rojo";
		}
		lblStock.setText(cantidad + "");
		this.getStyleClass().clear();
		this.getStyleClass().add(style);
	}

	/**
	 * Sets the image.
	 *
	 * @param imagen the new image
	 */
	public void setImage(Image imagen) {
		imgProducto.setImage(imagen);
	}

	/**
	 * Sets the name.
	 *
	 * @param nombre the new name
	 */
	public void setName(String nombre) {
		lblNombreProducto.setText(nombre + "");
	}
}
