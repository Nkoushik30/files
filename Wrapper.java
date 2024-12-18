import java.util.*;
class Wrapper{
     public static void main(String[] args) {
        int a=20;
        Integer boxednum=new Integer(a);
        System.out.println("boxed num is :"+boxednum);
        Integer autoboxednum=a;
        System.out.println("auto boxed num is:"+autoboxednum);
     }
}