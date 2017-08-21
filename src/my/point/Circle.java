package my.point;



public class Circle {
    private double radius;
    private String color;
    private double sectordegree;
    
    public double getRadius(){
        return radius;
    }
    
    
    public void setRadius(double rad){
        if(rad<=0)
        {
            System.out.println("radius cannot be lower than 0");
            System.exit(0);
        }
        else
        {
            radius = rad;
        }
    }
    
    public void setSectorDegree(double deg)
    {
        if(deg<=0)
        {
            System.out.println("sector degree cannot be lower than 0");
            System.exit(0);
        }
        else
        {
            sectordegree = deg;
        }
    }
    
        public double getSectorDegree()
    {
        return sectordegree;
    
    }
    
    public String getColor()
    {
        return color;
    }
    
    public String setColor()
    {
        return color;
    }
    
    public double getArea()
    {
        return radius * radius * Math.PI;
    }
    
    public double getCircumference()
    {
        return 2.0 * Math.PI * radius;
    }
    
    public double getDiameter()
    {
        return (2.0 * Math.PI * radius) / Math.PI;
    }
    
    public double getSegment()
    {
        return Math.PI * (radius * radius);
    }
    
    public double getSectorarea()
    {
        return (radius * radius * Math.PI) / (360 / sectordegree);
    }
    
    public double getArc()
    {
        return (2.0 * Math.PI * radius) / (360 / sectordegree);
    }
}
