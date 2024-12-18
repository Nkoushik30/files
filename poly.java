import java.util.*;
class A{
    public void display(){
        System.out.println("hi to every one ");
    }
}
class poly extends A{
    public void display(){
        System.out.println("second display()");       
    }
    public static void main(String []args){
        poly obj=new poly();
        obj.display();
    }
}
