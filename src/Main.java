public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 81;
        int k = 0;
        for (int i = 1; i <= 20; i++) {
            if (Math.pow(i, 4) == a) {
                k = i;
            }

        }

        if (Math.pow(k, 4) != a) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }

//Aregi grac lav dzev
        /**double n = 256;
        double t = Math.pow(n, (double) 1 / 4);
        System.out.println(t);
        if (t % 1 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
         */
        //63 Aregi dzev lav
        /**  int a=1343;
         boolean t=true;
         while (a>0){
         int k=a%10;
         a/=10;
         if (k==2){
         t=true;
         break;
         }else {
         t=false;
         }
         }
         System.out.println(t);
         */

    }
}
