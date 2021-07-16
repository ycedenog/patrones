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
public class AudiBuilder extends VehiculoBuilder{
    public void DefinirVehiculo() {
        v = new Vehiculo();
        v.marca = "Audi";
        v.modelo = "A3 Sportback";
    }

    public void ConstruirHabitaculo() {
        v.tipoCarroceria = new Carroceria();
        v.tipoCarroceria.tipoCarroceria = "monovolumen";
        v.color = "plata cromado";
        v.tipoCarroceria.habitaculoReforzado = true;
        v.tipoCarroceria.material = "fibra de carbono";
        
        
    }

    public void ConstuirMotor() {
        v.motor = new MotorDiesel();
    }

    public void DefinirExtras() {
        v.direccionAsistida = true;
    }
}
