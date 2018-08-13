import java.util.ArrayList;
import java.util.List;

public class aaa {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i= 1;i<=100;i++){
            list.add(i);
        }
        int num = 1;
        for (int i=1;;i++){
            if (list.size()==1){
                System.out.println(list);
                break;
            }
            if (i>list.size()){
                num=i%7;
                i=1;
            }
            if ((i+num-1)%7==0){
                list.remove(i-1);
            }
        }
    }
}
