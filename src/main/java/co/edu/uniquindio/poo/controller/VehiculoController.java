package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Concesionario;
import java.util.Collection;

public class VehiculoController {

  Concesionario concesionario;

  public VehiculoController(Concesionario concesionario) {
    this.concesionario = concesionario;
  }

  public boolean agregarVehiculo(Vehiculo vehiculo) {
    return concesionario.agregarVehiculo(vehiculo);
  }

  public Collection<Vehiculo> obtenerListaVehiculos() {
    return concesionario.getVehiculos();
  }

  public boolean eliminarVehiculo(String matricula) {
    return concesionario.eliminarVehiculo(matricula);
  }

  public boolean actualizarVehiculo(String matricula, Vehiculo vehiculo) {
    return concesionario.actualizarVehiculo(matricula, vehiculo);
  }
}
