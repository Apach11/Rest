package ru.netology.services;

public class RestService {
    /*Один фрилансер, воспользовавшись гибкостью графика своего вида работы, решил смоделировать свой отдых по следующей схеме:
    1.Изначально у него нет денег;
    2.Если он решает, что следующий месяц хочет активно поработать, то его деньги увеличиваются на income (доход от работы) и уменьшаются на expense (обязательные месячные траты);
    3.Если он решает, что следующий месяц хочет отдохнуть, то за месяц его доходы уменьшаются на expense, а затем остаток накоплений ещё уменьшается в три раза (траты на отдых);
    4.Решение отдохнуть ли в следующем месяце принимается по правилу: если на счету есть хотя бы threshold денег, то выбираем отдых, иначе - работу.
    5.Необходимо написать сервисный класс с методом, который по заданным income, expenses и threshold расчитает количество месяцев отдыха, которые будут в следующий год. Всё считается в целых числах.
     */
    public int calculateMoneyMonths(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}