//package hw2_2;
//
//import java.util.Arrays;
//
//public class HW2_2_Task_1 {
//
//    static class MyArraySizeException extends RuntimeException {
//        MyArraySizeException(String infoEx) {
//            super(infoEx);
//        }
//    }
//
//    static int[][] arr1 = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4,}};
//    static int[][] arr2 = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
//    static int[][] arr3 = {{1, 2, 3, 4, 5}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4,}};
//
//    public static void arrInf(int[][] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println();
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            if (arr.length == arr[4][4]) {
//            } else {
//                throw new MyArraySizeException("массив другого размера");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        arrInf(arr1);
//    }
//}

