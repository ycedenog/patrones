/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinpatron;

/**
 *
 * @author david_000
 */
public class Carroceria {

    protected boolean habitaculoReforzado;
    protected String tipoCarroceria;
    protected String material;

    public boolean isHabitaculoReforzado() {
        return habitaculoReforzado;
    }

    public void setHabitaculoReforzado(boolean habitaculoReforzado) {
        this.habitaculoReforzado = habitaculoReforzado;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}
