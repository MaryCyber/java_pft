package ru.stqa.pft.sandbox;
public class Points{

    public static void main(String[] args) {

        PointsData P = new PointsData(0,1,2,-2);
        System.out.println("points distance =" + distance(P));
    }
    public static double distance (PointsData P){
        return Math.sqrt((P.p3-P.p1)*(P.p3-P.p1)+(P.p4-P.p2)*(P.p4-P.p2));
    }
}