package com.epam.task.branching;

import com.epam.task.entity.Point;
import com.epam.task.util.PointsCheck;

public class Task3 {

    public static void main(String[] args) {
        Point first = new Point(1, 1);
        Point second = new Point(2, 2);
        Point third = new Point(4, 4);
        System.out.println(PointsCheck.isPointsOnLine(first, second, third));
    }

}
