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
public class VehiculoDecorator implements VehiculoBase{
    protected VehiculoBase wrappe;

    public VehiculoDecorator(VehiculoBase wrappe) {
        this.wrappe = wrappe;
    }
    
    public String getPrestaciones() {
        return this.wrappe.getPrestaciones();
    }
}
