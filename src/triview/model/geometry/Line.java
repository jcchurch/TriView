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
public class Line {
    public final Point a;
    public final Point b;
    
    public Line(Point a, Point b) {
        checkForNullPoint(a);
        checkForNullPoint(b);
        this.a = a;
        this.b = b;
    }
    
    public double length() {
        return (new Vector2(this.a.x - this.b.x, this.a.y - this.b.y)).mag();
    }

    private void checkForNullPoint(Point p) {
        if (p == null) {
            throw new NullPointerException("point is null");
        }
    }
}
