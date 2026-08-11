package Array.test;

public class Count {

    public static void main(String[] args) {
        int num=1568967;
        //int Count=0;
       // while(num!=0) {
         //   num = num / 10;
         //   Count++;


       // }
     //   System.out.println(Count);
      //  int sum=0;
      //  while(num!=0) {
          //  int digit=num%10;
           // sum=sum+digit;
         //   num=num/10;
       // }
       // System.out.println(sum);

        int rev=0;
         while(num!=0) {
             int digit=num%10;
               num=num/10;
               rev=rev*10+digit;
         }
         System.out.println(rev);


    }
}
