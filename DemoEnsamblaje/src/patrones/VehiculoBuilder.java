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
public abstract class VehiculoBuilder {
    //Referencia del producto a construir
    protected Vehiculo v;
    
    public Vehiculo getVehiculo(){
        return v;
    }
    
    public abstract void DefinirVehiculo();
    public abstract void ConstruirHabitaculo();
    public abstract void ConstuirMotor();
    public abstract void DefinirExtras();
    
}
