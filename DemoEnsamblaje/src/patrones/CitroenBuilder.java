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
        v.marca = "Citroen";
        v.modelo = "Xsara Picasso";
    }

    public void ConstruirHabitaculo() {
        v.tipoCarroceria = new Carroceria();
        v.tipoCarroceria.tipoCarroceria = "monovolumen";
        v.color = "negro";
        v.tipoCarroceria.habitaculoReforzado = false;
        v.tipoCarroceria.material = "acero";
        
        
    }

    public void ConstuirMotor() {
        v.motor = new MotorDiesel();
    }

    public void DefinirExtras() {
        v.direccionAsistida = false;
    }
    
}
