
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManagerSorted {

    public static Goods[] readingFIle() throws IOException {
       Goods[] good = new Goods[50];


        try {
            FileReader fileReader = new FileReader("C:\\Users\\gavro\\Desktop\\lab1math\\lab2struct\\src\\sorted.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for(int i = 0; i < good.length; i++) {
                good[i] = new Goods();
                good[i].readingFile(bufferedReader);
            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

        return good;
    }
    public static String binarySearch(Goods[]good, int target) {
        long startTime = System.nanoTime();
        long endTime;

        int left = 0;
        int right = good.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (good[mid].getID() == target) {
                endTime = System.nanoTime();
                System.out.println("Time of execution: " + (endTime - startTime)+ " Nano Seconds");
                return good[mid].toString();
            } else if (good[mid].getID() < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        endTime = System.nanoTime();
        System.out.println("Time of execution: " + (endTime - startTime)+ " Nano Seconds");
        return "Error";
    }
    public static String interpolationSearch(Goods[] good, int target) {
        long startTime = System.nanoTime();
        long endTime;

        int left = 0;
        int right = good.length - 1;
        while (left <= right && target >= good[left].getID() && target <= good[right].getID()) {
            int pos = left + ((target - good[left].getID()) * (right - left)) / (good[right].getID() - good[left].getID());
            if (good[pos].getID() == target) {
                endTime = System.nanoTime();
                System.out.println("Time of execution: " + (endTime - startTime) + " Nano Seconds");
                return good[pos].toString();
            } else if (good[pos].getID() < target) {
                left = pos + 1;
            } else {
                right = pos - 1;
            }
        }
        endTime = System.nanoTime();
        System.out.println("Time of execution: " + (endTime - startTime) + " Nano Seconds");
        return "Error";
    }
    public static String fibonacciSearch(Goods[] good, int target) {
        long startTime = System.nanoTime();
        long endTime;

        int n = good.length;
        int fib2 = 0;
        int fib1 = 1;
        int fib = fib2 + fib1;
        while (fib < n) {
            fib2 = fib1;
            fib1 = fib;
            fib = fib2 + fib1;
        }
        int offset = -1;
        while (fib > 1) {
            int i = Math.min(offset + fib2, n - 1);
            if (good[i].getID() < target) {
                fib = fib1;
                fib1 = fib2;
                fib2 = fib - fib1;
                offset = i;
            } else if (good[i].getID() > target) {
                fib = fib2;
                fib1 = fib1 - fib2;
                fib2 = fib - fib1;
            } else {
                endTime = System.nanoTime();
                System.out.println("Time of execution: " + (endTime - startTime) + " Nano Seconds");
                return good[i].toString();
            }
        }
        if (fib1 == 1 && good[offset + 1].getID() == target) {
            endTime = System.nanoTime();
            System.out.println("Time of execution: " + (endTime - startTime) + " Nano Seconds");
            return good[offset + 1].toString();
        }
        endTime = System.nanoTime();
        System.out.println("Time of execution: " + (endTime - startTime) + " Nano Seconds");
        return "Error";
    }

};
