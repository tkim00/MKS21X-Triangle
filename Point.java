public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.getX();
    y= p.getY();
  }

  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public void setX(double x2){
    x = x2;
  }
  public void setY(double y2){
    y = y2;
  }
  public String toString(){
    return "(" + x + "," + y + ")";
  }
  public Point copy(){
    return new Point(x, y);
  }
  public double distanceTo(Point other){
    return Math.sqrt(Math.pow(x - other.getX(), 2) + Math.pow(y - other.getY(), 2));
  }
  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getX() - p2.getY(), 2));
  }
}
