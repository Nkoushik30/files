interface shape{
    void getarea();
}
class circle implements shape{
    double r;
    circle(double r){
        this.r=r;
    }
   public void getarea(){
        return 3.14*r*r;
    }
}
public class shape1{
    public static void main(String[] args){
        circle c = new circle(2);
       System.out.println( c.getarea());
    }
}