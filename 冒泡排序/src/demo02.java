import java.lang.reflect.Method;

public class demo02 {

    static int[] ints = {1, 5, 8, 7, 3, 4, 9, 10, 4, 55, 8, 79, 18, 684, 484, 5, 464, 484, 654, 6, 61, 4, 651, 4, 8, 1654, 6, 164, 61, 654, 161, 4, 58, 16, 99, 1, 61};

    public static void main(String[] args) {
        Method1();

        for (int Element:ints
             ) {
            System.out.print(Element+"  ");

        }
    }


    static void Method1() {

        for (int j = 0; j < ints.length - 1; j++) {


            for (int i=0 ; i < ints.length - 1; i++) {

                //如果左边的值大于右边则互换
                if (ints[i] > ints[i + 1]) {

                    int a;
                    int b;

                    a = ints[i];
                    b = ints[i + 1];

                    ints[i] = b;
                    ints[i + 1] = a;

                }


            }
        }

    }


}
