package lesson5HW5;

public class Main {
    static final int SIZE = 10000000;
    static final int h = SIZE / 2;
    static float[] arr = new float[SIZE];
    static long time;


    public static void OneStream(float[]arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }
        time = System.currentTimeMillis()-a;

    }
    public static void MultiStream(float[] arr){

        for (int i = 0; i < arr.length; i++) {
          arr[i]=1;
        }
        float [] a1 = new float[h];
        float [] a2 = new float[h];

        long a = System.currentTimeMillis();

        System.arraycopy(arr,0,a1,0,h);
        System.arraycopy(arr, h, a2,0, h);

        Thread thread1 = new Thread(() -> {
            OneStream(a1);
        });
        Thread thread2 = new Thread(() -> {
            OneStream(a2);
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);

    }

    public static void main(String[] args) {

        OneStream(arr);
        System.out.println(time);
        MultiStream(arr);

        System.out.println("End");

    }

}
