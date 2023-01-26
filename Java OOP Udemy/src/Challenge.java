import java.util.ArrayList;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(73);
        inputList.add(67);
        inputList.add(38);
        inputList.add(33);

        for(Integer input : inputList){
            Integer roundedNumber = roundUp(input);
            if(roundedNumber - input < 3){
                System.out.println(roundedNumber);
            }else{
                System.out.println(input);
            }
        }
    }

    static Integer roundUp(Integer n) {
        if(n < 38){
            return n;
        }
        return (n + 4) / 5 * 5;
    }
}
