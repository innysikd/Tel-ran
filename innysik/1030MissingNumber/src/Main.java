public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};

        System.out.println(findMissingNumber1(numbers));

    }
        /* public static int findMissingNumber (int[] numbers){
            int res =-1;
            for (int i = 0; i<numbers.length; i++){
                if(numbers[i] + 1 != numbers[i+1]){
                    res = numbers[i]+1;
                }

            }
            return res;
        }*/

        public static int findMissingNumber1 (int[] num){
            int res =-1;
            for (int i = 0; i<num.length; i++){
                if (num[i+1] - num[i]>1){
                        res = num[i+1];
                }
            }
            return res;
        }

}


