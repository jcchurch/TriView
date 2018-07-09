/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triview.model.geometry;

/**
 *
 * @author jcchurch
 */
public class Vector2 {
    
    public final double x;
    public final double y;
    
    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double magSqrd() {
        return this.dot(this);
    }
    
    public double mag() {
        return Math.sqrt(this.magSqrd());
    }
    
    public Vector2 unit() {
        return new Vector2(this.x/this.mag(), this.y/this.mag());
    }
    
    public Vector2 add(Vector2 v) {
        this.checkForNullVector(v);
        return new Vector2(this.x+v.x, this.y+v.y);
    }

    private void checkForNullVector(Vector2 v) {
        if (v == null) {
            throw new NullPointerException("v is null");
        }
    }
    
    public double dot(Vector2 v) {
        this.checkForNullVector(v);
        return this.x * v.x + this.y * v.y;
    }
}
