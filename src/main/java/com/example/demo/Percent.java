package com.example.demo;

public class Percent
{
    private double Calc;
    public Percent()
    {
        Calc=0.0;
    }

    public double countPr(double sum, int pr)  //возвращает значение  заданного % pr от суммы sum
    {
        return sum*pr/100;
    }

    public double countSum(double sum, int pr)  //возвращает значение итоговой суммы с учетом заданного % pr
    // от суммы sum
    {
        return sum+countPr(sum,pr)/100;
    }

    public int countSumTrunc(double sum, int pr) //округленное до ближайшего целого значение итоговой суммы
    // с учетом заданного % pr от суммы sum
    {
        return (int)Math.round(countSum(sum,pr));
    }
}
