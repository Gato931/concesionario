package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo{
  private double capacidadCarga;

  public Camioneta(String matricula, String marca, String modelo, double añoFabricacion, double capacidadCarga, boolean reservado) {
    super(matricula, marca, modelo, añoFabricacion, reservado);
    this.capacidadCarga = capacidadCarga;
  }

  public double getCapacidadCarga() {
    return capacidadCarga;
  }

  public void setCapacidadCarga(double capacidadCarga) {
    this.capacidadCarga = capacidadCarga;
  }
  public String tipoVehiculo(){
    return "Camioneta";
  }
  @Override
  public String toString() {
    return "Camioneta [matricula=" + matricula + ", capacidadCarga=" + capacidadCarga + ", marca=" + marca + ", modelo="
        + modelo + ", añoFabricacion=" + añoFabricacion + "]";
  }
}
