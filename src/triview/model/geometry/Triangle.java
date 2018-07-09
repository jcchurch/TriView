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
public class Triangle {
    public final Point a;
    public final Point b;
    public final Point c;
    
    public Triangle(Point a, Point b, Point c) {
        checkForNullPoint(a);
        checkForNullPoint(b);
        checkForNullPoint(c);
        
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private double sign(Point p, Point r, Point s) {
        return (p.x - s.x) * (p.y - s.y) - (r.x - s.x) * (r.y - s.y);
    }
    
    public boolean containsPoint(Point p) {
        checkForNullPoint(p);
        
        boolean check1 = sign(p, a, b) < 0.0;
        boolean check2 = sign(p, b, c) < 0.0;
        boolean check3 = sign(p, c, a) < 0.0;
        
        return check1 == check2 && check2 == check3;
    }

    private void checkForNullPoint(Point p) {
        if (p == null) {
            throw new NullPointerException("point is null");
        }
    }
}
