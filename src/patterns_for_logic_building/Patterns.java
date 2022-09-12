package patterns_for_logic_building;
import java.lang.*;
public class Patterns {
    public static void main(String[] args) {
//        Pattern 1
//            *****
//            *****
//            *****
//            *****
//            *****

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <5 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Pattern 2
//            *
//            **
//            ***
//            ****
//            *****


//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Pattern 3
//        1
//        12
//        123
//        1234
//        12345

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(j+1);
//            }
//            System.out.println();
//        }

//        Pattern 4
//        1
//        22
//        333
//        4444
//        55555

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(i+1);
//            }
//            System.out.println();
//        }

//        Pattern 5
//        *****
//        ****
//        ***
//        **
//        *

//        for (int i = 5; i >0 ; i--) {
//            for (int j = i; j >0 ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Pattern 6
//        12345
//        1234
//        123
//        12
//        1

//        for (int i = 5; i >0 ; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        Pattern 7
//        *
//       ***
//      *****
//     *******
//    *********


//for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <=9; j++) {
//                if(j >= 6-i && j <= 4+i )
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

//        Pattern 8
//        *********
//         *******
//          *****
//           ***
//            *

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 9; j >=1 ; j--) {
//                if(j>=i && j<=10-i)
//                System.out.print("*");
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        Pattern 9
//            *
//           ***
//          *****
//         *******
//        *********
//        *********
//         *******
//          *****
//           ***
//            *

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <=9; j++) {
//                if(j >= 6-i && j <= 4+i )
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 9; j >=1 ; j--) {
//                if(j>=i && j<=10-i)
//                    System.out.print("*");
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        Pattern 10
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

//        for (int i = 1 ; i <=9 ; i++) {
//            for (int j = 1; j <=5 ; j++) {
//                if(i >= j && i <= 10-j )
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

//        Pattern 11
//        1
//        01
//        101
//        0101
//        10101

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <=i ; j++) {
//                if(((i%2 == 0) && (j%2!=0)) || ((j%2 == 0) && i%2 !=0))
//                    System.out.print("0");
//                else{
//                    System.out.print("1");
//                }
//            }
//            System.out.println();
//        }


//        Pettern 12
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j<=4 ; j++) {
                if(j<=4-i)
                    System.out.print(" ");
                else
                    System.out.print(i);
            }
            System.out.println();
        }

    }
}
