package com.test.dima.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;

import static java.util.concurrent.TimeUnit.MICROSECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

@State(Scope.Benchmark)
public class TestStack {

  @BeforeAll
  public static void init() throws IOException, RunnerException {
    org.openjdk.jmh.Main.main(new String[]{});
  }

  @Test
  @Threads(1)
  @Benchmark
  @Warmup(iterations = 10, time = 1, timeUnit = SECONDS)
  @Measurement(iterations = 10, time = 1, timeUnit = SECONDS)
  @Fork(value = 1, warmups = 1)
  @BenchmarkMode({Mode.AverageTime})
  @Timeout(time = 10, timeUnit = SECONDS)
  @OutputTimeUnit(MICROSECONDS)
  public void test() {
    Stack<Integer> values = new Stack<>();
    values.push(5);
    values.push(6);
    values.push(7);
    Assertions.assertEquals(3, values.size());
    Integer pop = values.pop();
    Assertions.assertEquals(7, pop.intValue());
    values.size();
    Assertions.assertEquals(2, values.size());
    Assertions.assertFalse(values.isEmpty());
  }
}
