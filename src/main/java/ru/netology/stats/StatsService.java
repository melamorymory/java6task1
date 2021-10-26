package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales){
        int sum = 0;
        for (int sale: sales) {
            sum += sale;
        } return sum;
    }

    public int averageSales(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int sale : sales) {
            sum += sale;
            month += 1;
        } return sum / month;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        } return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        } return minMonth + 1;
    }

    public int underAverageSales(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int sale : sales) {
            sum += sale;
            month += 1;
        }
        int average = sum / month;
        int monthCount = 0;
        for (int sale : sales) {
            if (sale < average) {
                monthCount += 1;
            }
        } return monthCount;
    }

    public int overAverageSales(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int sale : sales) {
            sum += sale;
            month += 1;
        }
        int average = sum / month;
        int monthCount = 0;
        for (int sale : sales) {
            if (sale > average) {
                monthCount += 1;
            }
        } return monthCount;
    }
}
