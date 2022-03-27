public class Program {
    public static void main(String args[]){
        int n=100;
        double[] arr=new double[n];
        getRandomArr(arr);

        double min=Double.MAX_VALUE, max=-Double.MAX_VALUE, sum=0;
        for (double it:arr
             ) {
            if(it>max){
                max=it;
            }
                if(it<min){
                    min=it;
                }
                sum+=it;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum/n);
    }
    private static void getRandomArr(double[] arr){
        for (int i=0; i<arr.length; i++){
            arr[i]=100*Math.random();
        }
        //return arr;
    }
}
