/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinpatron;

import patrones.VehiculoBase;

/**
 *
 * @author david_000
 */
public class Vehiculo implements VehiculoBase{
   protected String color;
   protected boolean direccionAsistida;
   protected String marca;
   protected String modelo;
   protected IMotor motor;
   protected Carroceria tipoCarroceria;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDireccionAsistida() {
        return direccionAsistida;
    }

    public void setDireccionAsistida(boolean direccionAsistida) {
        this.direccionAsistida = direccionAsistida;
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

    public IMotor getMotor() {
        return motor;
    }

    public void setMotor(IMotor motor) {
        this.motor = motor;
    }

    public Carroceria getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(Carroceria tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }
   
   public String getPrestaciones(){
       String n1 = "Prestaciones:\n";
       n1 += "El presente vehículo es un " + marca + "\n";
       n1 += "Estilo " + tipoCarroceria.tipoCarroceria + "\n";
       n1 += "Color: " + color + "\n";
       n1 += (direccionAsistida ? "Con ":"Sin ") + "dirección asistida" + "\n";
       n1 += "Carrocería de " + tipoCarroceria.material + "\n";
       n1 += "Respuesta del motor: " + motor.InyectarCombustible(100) + "\n";
       
       return n1;
   }
    
}
