import java.util.ArrayList;
import java.util.Collections;

public class Stats5 {
    public static void main(String[] args) {
        Double num1= Math.random();
        Double num2= Math.random();
        Double num3= Math.random();
        Double num4= Math.random();
        Double num5= Math.random();

        ArrayList<Double> list=new ArrayList<Double>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        for(Double l:list){
            System.out.println(l);
        }
        Double avg=num1+num2+num3+num4+num5/list.size();
        System.out.println("AVG IS:"+avg);
        Collections.sort(list);
        System.out.println("MIN is:"+list.get(0));
        System.out.println("MAX is:"+list.get(list.size() - 1));



    }
}
