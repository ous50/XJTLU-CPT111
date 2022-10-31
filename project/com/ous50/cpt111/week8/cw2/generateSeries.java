package com.ous50.cpt111.week8.cw2;

public class generateSeries{

    public static double[] generateSeries(int n) {
        double[] seriesArray = new double[n];

        for (int i=0 ; i < seriesArray.length; i++){
            seriesArray[i]=1.0+1.0/((i+1.0)*(i+1.0));
        }
    
    return seriesArray;
    }


}