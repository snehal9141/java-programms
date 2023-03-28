interface Shape{
    void findArea();
}
class Rectangle implements Shape{
    double l,b;
    public void findArea(){
        System.out.println("Rectangle area:"+(l*b));
    }
}
class Circle implements Shape{
    double r;
     public void findArea(){
        System.out.println("Circle area:"+(3.14*(r*r)));
     }
}
class Square implements Shape{
    double l;
    public void findArea(){
        System.out.println("Square area:"+(l*l));
    }
}
class Main{
    public static void main(String []args){
        Rectangle r1=new Rectangle();
        r1.l=10;
        r1.b=20;
        r1.findArea();
        
        Square s1=new Square();
        s1.l=20;
        s1.findArea();
        
        Circle c1=new Circle();
        c1.r=2.4;
        c1.findArea();
    }
}

output:
Circle area:18.0864
  Rectangle area:200.0
    Square area:400.0
