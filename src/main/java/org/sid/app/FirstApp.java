package org.sid.app;
import org.sid.service.*;
public class FirstApp{
    public static void main(String[] args){
        if(args.length!=2) {
            System.out.println("2 arguments are provided!");
            System.exit(0);
        }
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        MyServiceImpl service=new MyServiceImpl();
        double somme=service.compute(a,b);
        System.out.println(String.format("Somme de %s et %s est %s :",a,b,somme));
    }
}