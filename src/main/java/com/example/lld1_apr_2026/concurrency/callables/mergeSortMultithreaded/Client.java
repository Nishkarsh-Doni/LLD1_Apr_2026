package com.example.lld1_apr_2026.concurrency.callables.mergeSortMultithreaded;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = List.of(5, 3, 8, 1, 9, 2, 6, 3, 4);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(arr, executorService);
        Future<List<Integer>> listFuture = executorService.submit(sorter);

        List<Integer> sortedList = listFuture.get();

        System.out.println("Sorted :" + sortedList);

        executorService.shutdown();

    }
}
