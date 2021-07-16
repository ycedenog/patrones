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
public class AudiBuilder extends VehiculoBuilder{
    public void DefinirVehiculo() {
        v = new Vehiculo();
         v.setMarca("Audi");
        v.setModelo("A3 Sportback");
    }

    public void ConstruirHabitaculo() {
        v.setTipoCarroceria( new Carroceria());
        v.getTipoCarroceria().setTipoCarroceria("monovolumen");
        v.setColor("plata cromado");
        v.getTipoCarroceria().setHabitaculoReforzado(true);
        v.getTipoCarroceria().setMaterial("fibra de carbono") ;    
    }

    public void ConstuirMotor() {
        v.setMotor(new MotorDiesel());
    }

    public void DefinirExtras() {
        v.setDireccionAsistida(true);
    }
}
