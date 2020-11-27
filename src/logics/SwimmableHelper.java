package logics;

public class SwimmableHelper {

    public static boolean checkSwimmableImplementation(Object obj) {
        Class cl = obj.getClass();
        Class[] interfaces = cl.getInterfaces();

        boolean isImplementsSwimmableInterfase = false;
        for (Class cInterfaces : interfaces) {
            if (cInterfaces.getName().equals("logics.Swimmable")) {
                isImplementsSwimmableInterfase = true;
                break;
            }
        }
        return isImplementsSwimmableInterfase;
    }
}
