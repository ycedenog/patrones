/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Vehiculo;

/**
 *
 * @author Victor
 */
public class VehiculoDirector {
    protected VehiculoBuilder builder;

    public VehiculoDirector(VehiculoBuilder builder) {
        this.builder = builder;
    }
    public void construirVehiculo(){
        builder.DefinirVehiculo();
        builder.ConstruirHabitaculo();
        builder.ConstuirMotor();
    }
    
    public Vehiculo getVehiculo(){
        return builder.getVehiculo();
    }
}
