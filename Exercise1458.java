import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise1458 {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        v2(ls);
    }
    public static void v1(List<String> ls){
        List<Integer> li = new ArrayList<>();
        Integer res = 1;
        for (String str : ls){
            li.add(str.length());
        }
        Collections.sort(li);
        for (Integer i : li){
            res = res*i;
        }
        System.out.println(res);
    }
    public static void v2(List<String> ls){
        System.out.println(ls.stream()
                .map(n -> n.length())
                .sorted()
                //.reduce(1,(a,b)->a*b))
                .collect(()->1,(a,b)->{a=a*b;},(a,b)->a=a*b)) //ToDo Вопрос как реализовать через collect, reduce в модуле неописан? В таком варианте результат всегда 1
        ;
    }
}
