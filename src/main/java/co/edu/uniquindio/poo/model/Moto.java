package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {
  private boolean cajaAutomatica;

  public Moto(String matricula, String marca, String modelo, double añoFabricacion, boolean cajaAutomatica,
      boolean reservado) {
    super(matricula, marca, modelo, añoFabricacion, reservado);
    this.cajaAutomatica = cajaAutomatica;
  }

  public boolean isCajaAutomatica() {
    return cajaAutomatica;
  }

  public void setCajaAutomatica(boolean cajaAutomatica) {
    this.cajaAutomatica = cajaAutomatica;
  }

  public String tipoVehiculo() {
    return "Moto";
  }

  @Override
  public String toString() {
    return "Moto [matricula=" + matricula + ", cajaAutomatica=" + cajaAutomatica + ", marca=" + marca + ", modelo="
        + modelo + ", añoFabricacion=" + añoFabricacion + ", isCajaAutomatica()=" + isCajaAutomatica() + "]";
  }
}
