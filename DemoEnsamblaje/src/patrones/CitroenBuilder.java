/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 *
 * @author Victor
 */
public class CitroenBuilder extends VehiculoBuilder{

    public void DefinirVehiculo() {
        Vehiculo v = new Vehiculo();
        v.marca = "Citroen";
        v.modelo = "Xsara Picasso";
    }

    public void ConstruirHabitaculo() {
        Carroceria tipoCarroceria = new Carroceria();
        
    }

    public void ConstuirMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void DefinirExtras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}