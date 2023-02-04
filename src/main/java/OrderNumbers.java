public class OrderNumbers {
    public static void main(String[] args) {
//        int[] table = new int[args.length];
//
//        for(int i=0 ; i< args.length ; i++){
//            table[i] = Integer.parseInt(args[i]);
//        }
        int[] table = {1,3,4,5,9,2};
        int cmp = 0;
        int n = table.length;
        System.out.println(n);
        System.out.println("test1");
        for( int i=0 ; i<n ; i++ ){
            for( int j=1 ; j<n-i ; j++ ){
                if(table[j-1]>table[j]){
                        cmp = table[j-1];
                        table[j-1] = table[j];
                        table[j] = cmp;
                }
            }
        }
        System.out.println("end of test");
        //  System.out.println(table[3]);
        for ( int i = 0 ; i < n ; i++ ){
            System.out.println(table[i]);
        }
    }
}
