

public class demo {

    static int[] ints = {1, 5, 8, 7, 3, 4, 9, 10, 4,55,8,79,18,684,484,5,464,484,654,6,61,4,651,4,8,1654,6,164,61,654,161,4,58,16,99,1,61};


    public static void main(String[] args) {
       int[] intss=  Method2();

        for (int Element:intss
             ) {
            System.out.println(Element);

        }

    }

    //找到最大的值
    static int[] Method() {

        for (int i = 0; i < ints.length-1; i++) {


            if (ints[i] > ints[i + 1]) {

                int a, b;
                a = ints[i];
                b = ints[i + 1];

                ints[i + 1] = a;

                ints[i] = b;

            }
        }
        return ints;
    }


   static int[]   Method2(){
       for (int j = 0; j < ints.length-1; j++) {
           Method();
       }


       return ints;
   }




}
