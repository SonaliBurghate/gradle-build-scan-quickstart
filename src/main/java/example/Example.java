package example;

import com.google.common.base.Joiner;

import java.time.LocalDate;

public class Example {

    public static String join(String... args) {
        return Joiner.on(' ').join(args);
    }


    public static Integer addNumbers(Integer x, Integer y){

        return x + y;
    }

}

