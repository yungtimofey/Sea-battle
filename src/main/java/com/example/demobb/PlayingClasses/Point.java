package com.example.demobb.PlayingClasses;

import java.io.Serializable;

public class Point implements Serializable {
    public int column;
    public int row;

    public Point(Point point) {
        this.column = point.column;
        this.row = point.row;
    }

    public Point(int row, int column) {
        this.column = column;
        this.row = row;
    }

    @Override
    public boolean equals(Object obj)
    {
        Point point = (Point)obj;
        return point.row == this.row && point.column == this.column;
    }
}
