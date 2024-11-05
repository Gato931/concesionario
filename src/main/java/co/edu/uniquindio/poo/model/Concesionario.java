package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Concesionario {
  private String nombre;
  private LinkedList<Vehiculo> vehiculos;

  public Concesionario(String nombre, LinkedList<Vehiculo> vehiculos) {
    this.nombre = nombre;
    this.vehiculos = vehiculos;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public LinkedList<Vehiculo> getVehiculos() {
    return vehiculos;
  }

  public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
    this.vehiculos = vehiculos;
  }

  public boolean agregarVehiculo(Vehiculo vehiculo) {
    boolean centinela = false;
    if (!verificarVehiculo(vehiculo.getMatricula())) {
        vehiculos.add(vehiculo);
        centinela = true;
    }
    return centinela;
  }

  public boolean eliminarVehiculo(String matricula) {
    boolean centinela = false;
    for (Vehiculo vehiculo : vehiculos) {
        if (vehiculo.getMatricula().equals(matricula)) {
            vehiculos.remove(vehiculo);
            centinela = true;
            break;
        }
    }
    return centinela;
  }

  public boolean actualizarVehiculo(String matricula, Vehiculo nuevoVehiculo) {
    boolean centinela = false;
    for (Vehiculo vehiculo : vehiculos) {
        if (vehiculo.getMatricula().equals(matricula)) {
            vehiculo.setMatricula(nuevoVehiculo.getMatricula());
            vehiculo.setModelo(nuevoVehiculo.getModelo());
            vehiculo.setMarca(nuevoVehiculo.getMarca());
            vehiculo.setAñoFabricacion(nuevoVehiculo.getAñoFabricacion());
            centinela = true;
            break;
        }
    }
    return centinela;
  }

  public boolean verificarVehiculo(String matricula) {
    boolean centinela = false;
    for (Vehiculo vehiculo : vehiculos) {
        if (vehiculo.getMatricula().equals(matricula)) {
            centinela = true;
            break;
        }
    }
    return centinela;
  }
}
