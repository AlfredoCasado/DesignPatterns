package com.codesai.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PointFlyweight {
    private final int x;
    private final int y;

    public PointFlyweight(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
