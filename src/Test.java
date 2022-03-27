public class Test {
    public static void main(String args[]){
        int[] a={1, 3, 5};
        int[] b={1, 9, 25};
        RandomFromArray A= new RandomFromArray(a, b);
        int el= A.getElement();
        System.out.println(el);
    }
}
