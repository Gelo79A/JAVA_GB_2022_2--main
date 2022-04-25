package hw5_2;

import java.util.Arrays;

public class Flow {

        static final int size = 10000000;
        static final int h = size / 2;
        static float[] arr = new float[size];
        static float[] arr2 = new float[size];

        public static void main(String[] args) {

            Arrays.fill(arr, 1f);
            Arrays.fill(arr2, 1f);

            long startTime = System.nanoTime();
            timeArr(arr);
            long timeOfCompletion = System.nanoTime() - startTime;
            System.out.println("1 Thread time: " + timeOfCompletion * 1e-9f);

            startTime = System.nanoTime();
            timeArrThread(arr2);
            timeOfCompletion = System.nanoTime() - startTime;
            System.out.println("2 Thread time: " + timeOfCompletion * 1e-9f);

            if (Arrays.equals(arr, arr2)) {
                System.out.println("arr equals arr2");
            } else {
                System.out.println("arr not equals arr2");
            }
        }

        private static void timeArr (float[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }

        private static void timeArrThread (float[] arr) {
            float[] a1 = new float[h];
            float[] a2 = new float[h];

            System.arraycopy(arr, 0, a1, 0, h);
            System.arraycopy(arr, 0, a2, 0, h);

            CalcThread thread1 = new CalcThread(a1, 0);
            CalcThread thread2 = new CalcThread(a2, h);

            try {
                thread1.join();
                thread2.join();
                System.out.println(thread1.returnValue);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

