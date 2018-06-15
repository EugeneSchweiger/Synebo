import java.util.Arrays;

public class saleforce2 {


    public static void main(String[] args) {
        //int[]a={8,5,3,2,1,1,0,-1,-3,-2,-5,-5,-6,-3,-1,0,1,1,-1,5,2,5,5,4,7,10,11,15};
        int[]a={5, -2, 3, 8, 6};



        System.out.println(Arrays.toString(solution(a)));
    }

    public static int[] solution(int[] T) {
        int averageTemperature=0;
        int arrayLength=T.length;
        int startIndex=0;
        int stopIndex=0;
        for(int temp2:T){
            averageTemperature+=temp2;
        }
        averageTemperature= (averageTemperature/arrayLength);

        for(int i=0;i<=(T.length-1);i++){
            if ((double)averageTemperature>(double)((T[i]+T[i+1])/2)){
                startIndex=i;
                break;
            }
        }
        for(int i=startIndex+1;i<=(T.length-1);i++){
            if (averageTemperature<=(double)((T[i]+T[i+1])/2)){
                stopIndex=i;
                break;
            }
        }
        int[]winter= Arrays.copyOfRange(T, startIndex,stopIndex+1);

        return winter;


    }
}
