package edu.kis.powp.jobs2d.drivers.transformations;

public interface DriverLevelTransformation {
    int transformXPoint(int x, int y);

    int transformYPoint(int x, int y);
}