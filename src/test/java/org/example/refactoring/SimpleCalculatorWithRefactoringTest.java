package org.example.refactoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

class SimpleCalculatorWithRefactoringTest {

    @Test
    void addTest() {
        String input = "1+2";
        OutputStream out = getOutputStream(input);
        Assertions.assertThat(out.toString()).isEqualTo("3");
    }

    @Test
    void subtractTest() {
        String input = "1-2";
        OutputStream out = getOutputStream(input);
        Assertions.assertThat(out.toString()).isEqualTo("-1");
    }

    @Test
    void multiplyTest() {
        String input = "1*2";
        OutputStream out = getOutputStream(input);
        Assertions.assertThat(out.toString()).isEqualTo("2");
    }

    @Test
    void divideTest() {
        String input = "6/2";
        OutputStream out = getOutputStream(input);
        Assertions.assertThat(out.toString()).isEqualTo("3");
    }

    @Test
    void addWithSpaceTest() {
        String input = "1 + 2";
        OutputStream out = getOutputStream(input);
        Assertions.assertThat(out.toString()).isEqualTo("3");
    }

    private static OutputStream getOutputStream(String input) {
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        SimpleCalculatorWithRefactoring.main(new String[]{});
        return out;
    }
}