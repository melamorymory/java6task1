package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        StatsService service = new StatsService();
        return service.sumSales(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int underAverageSales(int[] sales) {
        StatsService service = new StatsService();
        int average = service.averageSales(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale < average) {
                monthCount += 1;
            }
        }
        return monthCount;
    }

    public int overAverageSales(int[] sales) {
        StatsService service = new StatsService();
        int average = service.averageSales(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale > average) {
                monthCount += 1;
            }
        }
        return monthCount;
    }
}
