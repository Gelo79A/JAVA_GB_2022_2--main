package hw5_2;

public class CalcThread extends Thread{
    private float[] arr;
    private int offset;
    public int returnValue;

    CalcThread(float[] arr, int offset){
        this.arr = arr;
        this.offset = offset;
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " startrd ...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] *
                    Math.sin(0.2f + (i + offset)/5) *
                    Math.cos(0.2f + (i + offset) / 5) *
                    Math.cos(0.4f + (i + offset) / 2));
            System.out.println(getName() + "stop");
            returnValue = 10;
        }
    }
}
