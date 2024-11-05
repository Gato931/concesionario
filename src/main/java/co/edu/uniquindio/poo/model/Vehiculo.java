package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {
  public String matricula;
  public String marca;
  public String modelo;
  public double añoFabricacion;
  public boolean reservado;

  public Vehiculo(String matricula, String marca, String modelo, double añoFabricacion, boolean reservado) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.añoFabricacion = añoFabricacion;
    this.reservado = false;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getAñoFabricacion() {
    return añoFabricacion;
  }

  public void setAñoFabricacion(double añoFabricacion) {
    this.añoFabricacion = añoFabricacion;
  }

  public boolean isReservado() {
    return reservado;
  }

  public void setReservado(boolean reservado) {
    this.reservado = reservado;
  }
  public abstract String tipoVehiculo();
  @Override
  public String toString() {
    return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", añoFabricacion="
        + añoFabricacion + ", reservado=" + reservado + "]";
  }
}