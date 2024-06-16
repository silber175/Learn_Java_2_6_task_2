package Task2.Tasks.Kruchkov;

import java.awt.*;

public class Circule implements Circuleable {
    private Point centre;
    private double radius;
    public int count = 0;
    public int countP = 0;

    Circule(Point centre,  double radius)   {
        this.centre = centre;
        this.radius = radius;
    }
    @Cashe
    public double diametr()    {
        count ++;
        return 2*this.radius;
    }
    @Cashe
    public double circusLen()  {
        countP ++;
        return 2*Math.PI*this.radius;
    }
    @Mutator
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Mutator
    public void setCentre(Point centre)  {
        this.centre = centre;
    }
    public double getRadius() {
        return this.radius;
    }
    public Point getCentre()  {
       return  this.centre;
    }
}
