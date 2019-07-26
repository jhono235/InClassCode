public class examples {

    //problem 4
    private static void parameters(int i){
        if(i%3 == 0 && i%5 != 0)
            System.out.println("fizz");
            else if (i%3 !=0 && i%5 == 0)
                System.out.println("buzz");
            else if(i%3 !=0 && i%5 == 0)
                System.out.println(i);
            else
                System.out.println("fizz buzz");
        }

       //problem 3
        private static void mode(int [] a) {
            int count = 1;
            int tempCount;
            int most = a[0];
            int temp;

            for (int i = 0; i < (a.length - 1); i++) {
                temp = a[i];
                tempCount = 0;
                for (int j = 1; j < a.length; j++) {
                    if (temp == a[j])
                        tempCount++;
                }
                if (tempCount > count) {
                    most = temp;
                    count = tempCount;
                }

            }
            System.out.println(most);
        }

        //problem 1
        private static void palindrome(String word){

        String lower = word.toLowerCase();

        char [] charr = lower.toCharArray();

        int length = charr.length;
        char temp1, temp2;
        int forwards = 0;
        int backwards = charr.length - 1;

        while(backwards >forwards){
            temp1 = lower.charAt(forwards++);
            temp2 = lower.charAt(backwards--);

            if(temp1 != temp2)
                System.out.println("Not a palindrome!");
            else
                System.out.println("Palindrome!");
        }
    }

    //problem 5
    private static void armstrong(int i){
        int x =0,a,temp;
        temp = i;

        while(i>0){
            a=i%10;
            i=i/10;

            x=x+(a*a*a);
        }
        if(temp==x)
            System.out.println("Armstrong");
        else
            System.out.println("Not an Armstrong");

    }













        public static void main(String args []){


        parameters(15);

        //problem 3


        int [] arr = {2,3,4,5,5,6,7};
        mode(arr);

        palindrome("hello");

        armstrong(153);






        }
    }



