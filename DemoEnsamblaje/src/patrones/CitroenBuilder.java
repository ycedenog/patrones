/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;
import sinpatron.Vehiculo;
import sinpatron.Carroceria;
import sinpatron.MotorDiesel;

/**
 *
 * @author Victor
 */
public class CitroenBuilder extends VehiculoBuilder{

    public void DefinirVehiculo() {
        v = new Vehiculo();
        v.setMarca("Citroen");
        v.setModelo("Xsara Picasso");
    }

    public void ConstruirHabitaculo() {
        v.setTipoCarroceria( new Carroceria());
        v.getTipoCarroceria().setTipoCarroceria("monovolumen");
        v.setColor("negro");
        v.getTipoCarroceria().setHabitaculoReforzado(false);
        v.getTipoCarroceria().setMaterial("acero") ;     
    }

    public void ConstuirMotor() {
        v.setMotor(new MotorDiesel());
    }

    public void DefinirExtras() {
        v.setDireccionAsistida(false);
    }
    
}
