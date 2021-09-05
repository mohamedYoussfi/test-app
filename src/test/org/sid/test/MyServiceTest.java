package org.sid.test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.sid.service.MyServiceImpl;
public class MyServiceTest{
    @Test()
    public void computeTes(){
        double a=8.0;   double b=3.0;    double exptected=11.0;
        MyServiceImpl service=new MyServiceImpl();
        double result=service.compute(a,b);
        assertEquals(result,exptected,0.01);
    }
}
