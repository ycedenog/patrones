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
public class SistemasSensores extends VehiculoDecorator{
    
    public SistemasSensores(VehiculoBase wrappe) {
        super(wrappe);
    }
    
    @Override
    public String getPrestaciones(){
        return super.getPrestaciones() + "Añadiendo Sistema de sensores\n";
    }
}
