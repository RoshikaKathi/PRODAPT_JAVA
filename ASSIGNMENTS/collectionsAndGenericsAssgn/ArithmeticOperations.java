package collectionsAndGenericAssgn;

import java.util.List;
import java.util.Vector;
 
public class ArithmeticOperations {
	
    public static <T extends Number> Number add(T t1, T t2) {
        return t1.doubleValue() + t2.doubleValue();
    }
    public static <T extends Number> Number add(List<? extends Number> list) {
        double d = 0;
        for (int i = 0; i < list.size(); i++) {
            d += list.get(i).doubleValue();
        }
        return new Double(d);
    }
    
    public static <T extends Number> Number mul(T t1, T t2) {
        return t1.doubleValue() * t2.doubleValue();
    }
    public static <T extends Number> Number mul(List<? extends Number> list) {
        double d = 0;
        for (int i = 0; i < list.size(); i++) {
            d *= list.get(i).doubleValue();
        }
        return new Double(d);
    }

    
    public static<T extends Number> Number sub(T t1,T t2) {
    	return t1.doubleValue()-t2.doubleValue();
    }
    public static <T extends Number> Number sub(List<? extends Number> list) {
        double d = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            d -= list.get(i).doubleValue();
        }
        return new Double(d);
    }
    
    public static<T extends Number> Number Div(T t1,T t2) {
    	return t1.doubleValue()/t2.doubleValue();
    }
    public static <T extends Number> Number Div(List<? extends Number> list) {
        double d = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            d /= list.get(i).doubleValue();
        }
        return new Double(d);
    }
    
    public static void dumpList(List<?> list) {
        System.out.println("List dump with unbounded wildcard:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
 
    public static void main(String[] args) {
        // Adding 2 integers
        Integer i1 = new Integer(12), i2 = new Integer(21);
        System.out.println("Add integers with generic method: " + ArithmeticOperations.add(i1, i2));
        System.out.println("Mul integers with generic method: " + ArithmeticOperations.mul(i1, i2));
        System.out.println("Sub integers with generic method: " + ArithmeticOperations.sub(i1, i2));
        System.out.println("Div integers with generic method: " + ArithmeticOperations.Div(i1, i2));
        System.out.println();
        
        Float f1 = new Float(12.12), f2 = new Float(21.21);
        System.out.println("Add floats with generic method: " + ArithmeticOperations.add(f1, f2));
        System.out.println("Mul floats with generic method: " + ArithmeticOperations.mul(f1, f2));
        System.out.println("Sub floats with generic method: " + ArithmeticOperations.sub(f1, f2));
        System.out.println("Div floats with generic method: " + ArithmeticOperations.Div(f1, f2));
        System.out.println();
        
        /// Adding 2 integers through a list
        Vector<Number> l = new Vector<>();
        l.add(new Integer(34));
        l.add(new Integer(43));
        // Subtracting 2 integers through a list
        Vector<Number> s = new Vector<>();
        s.add(new Double(12.56));
        s.add(new Float(3.6778));
        //Dividing 2 integers through a list
        Vector<Number> d = new Vector<>();
        d.add(new Integer(20));
        d.add(new Integer(5));
        //multiple 2 integers through a list
        Vector<Number> m = new Vector<>();
        m.add(new Integer(34));
        m.add(new Integer(43));
        System.out.println("Add with upper bounded wildcard: " + ArithmeticOperations.add(l));
        System.out.println("Sub with upper bounded wildcard: " + ArithmeticOperations.sub(s));
        System.out.println("Division with upper bounded wildcard: " + ArithmeticOperations.Div(d));
        System.out.println("Multiple with upper bounded wildcard: " + ArithmeticOperations.mul(m));
 
        System.out.println(" ");
        // Dumping the list to the console.
        ArithmeticOperations.dumpList(l);
        ArithmeticOperations.dumpList(s);
        ArithmeticOperations.dumpList(d);
        ArithmeticOperations.dumpList(m);
 
    }
}