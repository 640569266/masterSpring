import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by xixiwen on 2016/5/23.
 */
public class ReflectTest {
    public static Car initByDefaultConst() throws Throwable{
        ClassLoader loader=Thread.currentThread().getContextClassLoader();
        Class clazz=loader.loadClass("Car");
        //
        Constructor cons=clazz.getDeclaredConstructor((Class[])null);
        Car car=(Car)cons.newInstance();
        //
        Method setBrand=clazz.getMethod("setBrand",String.class);
        setBrand.invoke(car,"ºìÆìCA72");
        Method setColor=clazz.getMethod("setColor",String.class);
        setColor.invoke(car,"ºÚÉ«");
        Method setMaxSpeed=clazz.getMethod("setMaxSpeed",int.class);
        setMaxSpeed.invoke(car,200);
        return car;
    }
    public static void main(String[] args) throws Throwable{
        Car car=initByDefaultConst();
        car.introduce();

    }
}
