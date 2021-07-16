package com.codesai.patterns.flyweight;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlyweightTest {

    @Test
    public void java_string_are_flyweights() {
        String a = "ok";
        String b = "ok";

        final String a_memory_dir = Integer.toHexString(System.identityHashCode(a));
        final String b_memory_dir = Integer.toHexString(System.identityHashCode(b));

        assertThat(a_memory_dir).isEqualTo(b_memory_dir);
    }

    @Test
    public void java_integers_are_flyweights() {
        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(1);

        final String a_memory_dir = Integer.toHexString(System.identityHashCode(a));
        final String b_memory_dir = Integer.toHexString(System.identityHashCode(b));

        assertThat(a_memory_dir).isEqualTo(b_memory_dir);
    }

    @Test
    public void make_point_class_a_flyweight() {
        PointFlyweight a = new PointFlyweight(1,1);
        PointFlyweight b = new PointFlyweight(1,1);

        final String a_memory_dir = Integer.toHexString(System.identityHashCode(a));
        final String b_memory_dir = Integer.toHexString(System.identityHashCode(b));

        assertThat(a_memory_dir).isEqualTo(b_memory_dir);
    }
}
