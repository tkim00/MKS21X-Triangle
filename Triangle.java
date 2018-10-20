public class Triangle{
  Point v1;
  Point v2;
  Point v3;

  public Triangle(Point p1, Point p2, Point p3){
    v1 = p1;
    v2 = p2;
    v3 = p3;
  }
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter(){
    return Point.distance(v1, v2) + Point.distance(v2, v3) + Point.distance(v1, v3);
  }
  public Point getVertex(int index){
    if (index == 0){  return v1.copy();  }
    if (index == 1){  return v2.copy();  }
    if (index == 2){  return v3.copy();  }
    return null;
  }
  public String toString(){
    return "Triangle: A(" + v1.getX() + "," + v1.getY() +
    ") B(" + v2.getX() + "," + v2.getY() +
    ") C(" + v3.getX() + "," + v3.getY() + ")";
  }

  public void setVertex(int index, Point newP){
    if (index == 0){  v1 = newP;  }
    if (index == 1){  v2 = newP;  }
    if (index == 2){  v2 = newP;  }
  }
}
