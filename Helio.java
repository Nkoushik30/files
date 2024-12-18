import java.util.*;
class Helio{
    public void Ac(){
        System.out.println("Ac method");
    }
    public void Ac(int a){
        System.out.println("a value:"+a);
    }
}
    class B extends Helio{
        public static void main(String[] args) {
            B sc=new B();
            sc.Ac();
            sc.Ac(2);
        }
    }