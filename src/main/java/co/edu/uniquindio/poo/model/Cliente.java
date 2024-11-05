package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Cliente {
  private String nombre;
  private LinkedList<Vehiculo> vehiculosReservados;

  public Cliente(String nombre, LinkedList<Vehiculo> vehiculosReservados) {
      this.nombre = nombre;
      this.vehiculosReservados = vehiculosReservados;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public LinkedList<Vehiculo> getVehiculos() {
      return vehiculosReservados;
  }

  public void setVehiculos(LinkedList<Vehiculo> vehiculosReservados) {
      this.vehiculosReservados = vehiculosReservados;
  }
  public boolean reservarVehiculo(Vehiculo vehiculo) {
      if (!vehiculosReservados.contains(vehiculo)) {
          vehiculosReservados.add(vehiculo);
          return true;
      }
      return false;
  }

  public boolean cancelarReservaVehiculo(Vehiculo vehiculo) {
      return vehiculosReservados.remove(vehiculo);
  }

  @Override
  public String toString() {
      return "Cliente [nombre=" + nombre + ", vehiculosReservados=" + vehiculosReservados + "]";
  }
}
