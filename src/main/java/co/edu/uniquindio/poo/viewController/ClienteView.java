package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.controller.VehiculoController;
import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Concesionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.LinkedList;

public class ClienteView {

  @FXML
  private TableView<Vehiculo> tblVehiculosDisponibles;

  @FXML
  private TableColumn<Vehiculo, Boolean> clmReservado;

  @FXML
  private TextField tfMarca;

  @FXML
  private TableView<Vehiculo> tblVehiculosReservados;

  @FXML
  private TableColumn<Vehiculo, Boolean> clmReservado1;

  @FXML
  private TableColumn<Vehiculo, String> clmModelo;

  @FXML
  private TableColumn<Vehiculo, String> clmModelo1;

  @FXML
  private TableColumn<Vehiculo, String> clmTipoVehiculo1;

  @FXML
  private TableColumn<Vehiculo, Double> clmAñoFabricacion;

  @FXML
  private TextField tfTipoVehiculo;

  @FXML
  private TableColumn<Vehiculo, Double> clmAñoFabricacion1;

  @FXML
  private TextField tfModelo;

  @FXML
  private TableColumn<Vehiculo, String> clmMatricula1;

  @FXML
  private TextField tfMatricula;

  @FXML
  private TableColumn<Vehiculo, String> clmMatricula;

  @FXML
  private TableColumn<Vehiculo, String> clmMarca1;

  @FXML
  private TableColumn<Vehiculo, String> clmMarca;

  @FXML
  private TextField tfAñoFabricacion;

  @FXML
  private TableColumn<Vehiculo, String> clmTipoVehiculo;

  private VehiculoController vehiculoController;

  public ClienteView() {
    Concesionario concesionario = new Concesionario("Concesionario Principal", new LinkedList<>());
    this.vehiculoController = new VehiculoController(concesionario);
  }

  @FXML
  void initialize() {
    clmMatricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
    clmMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
    clmModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
    clmAñoFabricacion.setCellValueFactory(new PropertyValueFactory<>("añoFabricacion"));
    clmTipoVehiculo.setCellValueFactory(new PropertyValueFactory<>("tipoVehiculo"));
    clmReservado.setCellValueFactory(new PropertyValueFactory<>("reservado"));

    actualizarTabla();
  }

  @FXML
  void onAgregarVehiculo(ActionEvent event) {
    String matricula = tfMatricula.getText();
    String modelo = tfModelo.getText();
    String marca = tfMarca.getText();
    String tipoVehiculo = tfTipoVehiculo.getText();
    double añoFabricacion = Double.parseDouble(tfAñoFabricacion.getText());

    Vehiculo nuevoVehiculo;
    switch (tipoVehiculo.toLowerCase()) {
      case "auto":
        nuevoVehiculo = new Auto(matricula, marca, modelo, añoFabricacion, 4, false);
        break;
      case "moto":
        nuevoVehiculo = new Moto(matricula, marca, modelo, añoFabricacion, false, false);
        break;
      case "camioneta":
        nuevoVehiculo = new Camioneta(matricula, marca, modelo, añoFabricacion, 2, false);
        break;
      default:
        System.out.println("Tipo de vehículo no reconocido");
        return;
    }
    vehiculoController.agregarVehiculo(nuevoVehiculo);

    limpiarCampos();

    actualizarTabla();
  }

  private void limpiarCampos() {
    tfMatricula.clear();
    tfMarca.clear();
    tfModelo.clear();
    tfAñoFabricacion.clear();
    tfTipoVehiculo.clear();
  }

  private void actualizarTabla() {
    tblVehiculosDisponibles.getItems().clear();
    tblVehiculosDisponibles.getItems().addAll(vehiculoController.obtenerListaVehiculos());
  }

@FXML
void onReservarVehiculo(ActionEvent event) {
    Vehiculo vehiculoSeleccionado = tblVehiculosDisponibles.getSelectionModel().getSelectedItem();
    if (vehiculoSeleccionado != null) {
        vehiculoSeleccionado.setReservado(true);
        actualizarTabla();
    } else {
        System.out.println("Por favor, selecciona un vehículo para reservar.");
    }
}

}