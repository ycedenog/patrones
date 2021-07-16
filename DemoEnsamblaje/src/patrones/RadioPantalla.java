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
public class RadioPantalla extends VehiculoDecorator{
    
    public RadioPantalla(VehiculoBase wrappe) {
        super(wrappe);
    }
    
    @Override
    public String getPrestaciones(){
        return super.getPrestaciones() + "Añadiendo Radio de pantalla\n";
    }
}
