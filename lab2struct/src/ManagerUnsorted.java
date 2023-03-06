import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ManagerUnsorted {

    public static Goods[] readingFIle() throws IOException {
            Goods[] good = new Goods[50];
            try {
                FileReader fileReader = new FileReader("C:\\Users\\gavro\\Desktop\\lab1math\\lab2struct\\src\\unsorted.txt");
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
    public static String sequentialSearch(Goods[] good, int target) {
        long startTime = System.nanoTime();
        long endTime;
        for (int i = 0; i < good.length; i++) {
            if (good[i] != null && good[i].getID() == target) {
                endTime = System.nanoTime();
                System.out.println("Time of execution: " + (endTime - startTime)+ " Nano Seconds");
                return good[i].toString();
            }
        }
        endTime = System.nanoTime();
        System.out.println("Time of execution: " + (endTime - startTime)+ " Nano Seconds");
        return "Error"; // если элемент не найден
    }
}

