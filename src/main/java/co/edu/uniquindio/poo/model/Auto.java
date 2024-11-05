package co.edu.uniquindio.poo.model;

public class Auto extends Vehiculo{
  private int nPuertas;

  public Auto(String matricula, String marca, String modelo, double añoFabricacion, int nPuertas,boolean reservado) {
    super(matricula, marca, modelo, añoFabricacion,reservado);
    this.nPuertas = nPuertas;
  }

  public int getnPuertas() {
    return nPuertas;
  }

  public void setnPuertas(int nPuertas) {
    this.nPuertas = nPuertas;
  }
  public String tipoVehiculo(){
    return "Auto";
  }
  @Override
  public String toString() {
    return "Auto [matricula=" + matricula + ", nPuertas=" + nPuertas + ", marca=" + marca + ", modelo=" + modelo
        + ", añoFabricacion=" + añoFabricacion + "]";
  }

}
