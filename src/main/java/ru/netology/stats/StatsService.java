package ru.netology.stats;


public class StatsService {
    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double average(long[] sales) {
        double average = 0;
        if (sales.length > 0) {
            long sum = 0;
            for (long sale : sales) {
                sum += sale;
            }
            average = sum / sales.length;
        }
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int aboveAvg(long[] sales) {
//        double average = 0;
//        if (sales.length > 0) {
//            long sum = 0;
//            for (long sale : sales) {
//                sum += sale;
//            }
//            average = sum / sales.length;
//        }
        double salesAverage = average(sales);
        int count = 0;
        int countAboveAvg = 0;
        for (long sale : sales) {
            if (sale > salesAverage) {
                count++;
            }
            countAboveAvg = count;
        }
        return countAboveAvg;
    }

    public int belowAvg(long[] sales) {
//        double average = 0;
//        if (sales.length > 0) {
//            long sum = 0;
//            for (long sale : sales) {
//                sum += sale;
//            }
//            average = sum / sales.length;
//        }
        double salesAverage = average(sales);
        int count = 0;
        int countBelowAvg = 0;
        for (long sale : sales) {
            if (sale < salesAverage) {
                count++;
            }
            countBelowAvg = count;
        }
        return countBelowAvg;
    }

}