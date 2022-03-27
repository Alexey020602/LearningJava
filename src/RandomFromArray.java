public class RandomFromArray {
    private int[] arr;
    RandomFromArray(int[] a, int[] b){
        if(a.length!=b.length) return;
        int len=0;
        for(int it:b) {
            len += it;
        }
        arr=new int[len];
        int pos=0;
        for (int i=0; i<a.length; i++){
            for(int k=0; k<b[i]; k++){
                arr[pos+k]=a[i];
            }
            pos+=b[i];
        }
    }
    public int getElement(){
        int i=(int) (Math.random()*(arr.length-1));
        return arr[i];
    }
}
