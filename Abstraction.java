abstract class Bus{
    abstract void engine();
    void breaks(){
        System.out.println("Bus has two breaks");
    }
}
class RB extends Bus{
    void engine(){
        System.out.println("Rb run at 40kmpr");
    }
} class Volvo extends Bus {
    void engine(){
        System.out.println("Volvo runs at 210kmpr");
    }
}
class Driver{
    public static void main(String[]args){
        Bus b;
        b=new RB();
        b.engine();
        b.breaks();
        
        b=new Volvo();
        b.engine();
        b.breaks();
    }
}


output:
Rb run at 40kmpr
bus has two breaks
volvo runs at 120kmpr
bus has two breaks
