import java.io.IOException;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) throws IOException {
        Goods[] goodUnsorted;
        Goods[] goodSorted;

        goodUnsorted = ManagerUnsorted.readingFIle();
        goodSorted = ManagerSorted.readingFIle();

        System.out.println("\nSequential Search (UN_SORTED): ");
        System.out.println(ManagerUnsorted.sequentialSearch(goodUnsorted, 1033));


        System.out.println("\nBinary Search (SORTED): ");
        System.out.println(ManagerSorted.binarySearch(goodSorted, 1033));
        System.out.println("\nInterpolation Search (SORTED): ");
        System.out.println(ManagerSorted.interpolationSearch(goodSorted, 1033));
        System.out.println("\nFibonacci Search (SORTED): ");
        System.out.println(ManagerSorted.fibonacciSearch(goodSorted, 1033));

        Tree tree = new Tree();
        for (Goods stud: goodSorted) {
            tree.insertNode(stud);
        }
        System.out.println("\nBinary tree search:");
        System.out.println(tree.findNodeByID(1033));
    }

};
