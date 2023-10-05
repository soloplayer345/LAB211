/*
 * lambda: 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
/**
 *
 * @author Admin
 */
public interface myfunc<T,U,V> {
    public abstract V eval(T x,U y);
    
    public static void main(String args[]){
         myfunc<Double, Double, Double> f = new myfunc<Double, Double, Double>() {
             @Override
             public Double eval(Double x, Double y) {
                 return 5*y*x-6*y+5;
             }
         };
         System.out.println(f.eval(1.0, -1.0));
         myfunc<Double,Double,Double> f2=(x,y) ->{
             return 5*y*x-6*y+5;
         };
         System.out.println(f2.eval(2.0, 2.0));
         BiPredicate<Integer,Integer> hf = (t, u) -> {
             return t<=u;
         };
         System.out.println(hf.test(5, 7));
         Function<List<Double>, Double> f3=(t) -> {
             double result = Double.MIN_VALUE;
             for (double x : t) {
                 if (result<x) {
                     result=x;
                 }
             }
             return result;
         };
         ArrayList<Double> L =new ArrayList();
         L.addAll(1, L);L.addAll(8, L);
    } 
   
}
