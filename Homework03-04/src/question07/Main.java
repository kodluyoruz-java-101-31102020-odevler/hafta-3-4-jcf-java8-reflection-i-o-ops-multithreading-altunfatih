package question07;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        List<Integer> tempArray = fillArrayList();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        int first = 0, second = 2500;
        for (int i = 0; i < 4; i++) {
            SampleSingleorDouble separateListSingleOrDouble = new SampleSingleorDouble(tempArray.subList(first, second));
            first += 10;
            second += 10;
            threadPoolExecutor.execute(separateListSingleOrDouble);
        }
        threadPoolExecutor.shutdown();
        while (!threadPoolExecutor.isTerminated()) {
        }
        
        System.out.println("Finished all threads");
        System.out.println("Çift Sayılar ");
        SampleSingleorDouble.doubleArrayList.stream().forEach(ff -> System.out.println(ff));
        System.out.println("Çift eleman sayısı : " + SampleSingleorDouble.doubleArrayList.size());
        System.out.println("---------------- ");
        System.out.println("Tek Sayılar ");
        SampleSingleorDouble.singleArrayList.stream().forEach(ff -> System.out.println(ff));
        System.out.println("Tek eleman sayısı : " + SampleSingleorDouble.singleArrayList.size());
    }

    public static List<Integer> fillArrayList() {
        List<Integer> tempArray = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            tempArray.add(i + 1);
        }
        return tempArray;
    }
}
