public class Main{
    // class name should be upper case
    public static void main(String[] args) {
        //package name should be lower case lika mybookshop
        int num1=10;//var name should be lower case
        int num2=20;
        System.out.println(num1+num2);
        System.out.println(sum(num1,num2));

    }
    public static int sum(int num1,int num2)// method name should be lower case
    {
        return num1+num2;
    }
    //constant name should be all uppercase

}
//enum Level {
//    LOW,
//    MEDIUM,
//    HIGH
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Level myVar = Level.MEDIUM;
//
//        switch(myVar) {
//            case LOW:
//                System.out.println("Low level");
//                break;
//            case MEDIUM:
//                System.out.println("Medium level");
//                break;
//            case HIGH:
//                System.out.println("High level");
//                break;
//        }
//    }
//}
//
////        int number=100000;
////        double num=number;//direct
////        System.out.println(number);
////        System.out.println(num);
////        float floatnum=number;
////        short num1=(short) number;//manual
////
////        System.out.println(num1);
////        System.out.println(floatnum);
