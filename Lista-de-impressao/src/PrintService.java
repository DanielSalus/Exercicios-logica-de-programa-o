import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list  = new ArrayList<T>();

    public void addValue(T value) {
        list.add(value);
    }

    public  T primeiro(){
        if(list.isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        return list.get(0);

    }

    public void print(){
        System.out.print("[ ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+", ");
        }
        System.out.print(" ]");
    }


}
