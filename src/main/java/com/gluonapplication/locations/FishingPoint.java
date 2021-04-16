package com.gluonapplication.locations;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class FishingPoint implements Point {

    private String pointName;
    private int x;
    private int y;

    @Override
    public String toString() {
        return "FishingPoint{" +
                "pointName='" + pointName + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public String getCoordinate() {
        return this.toString();
    }
}
