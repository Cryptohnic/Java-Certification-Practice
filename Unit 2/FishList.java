import java.util.ArrayList;

public class FishList{
    public static void main(String[] args){
        ArrayList<Float> fishLengthList=new ArrayList<>();
        fishLengthList.add(10.0f);
        fishLengthList.add(15.5f);
        fishLengthList.add(18.0f);
        fishLengthList.add(29.5f);
        fishLengthList.add(45.5f);
        for(Float f:fishLengthList)
            if(f>28) System.out.println(f);
    }
}