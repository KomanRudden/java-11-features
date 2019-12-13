package com.komanrudden.features;

import java.util.stream.Collectors;

public class StringMethods {
    public void demoStringMethods() {

        //isBlank()
        System.out.println("  ".isBlank()); //prints true

        //lines()
        String lines = "Line1\nLine2\nLine3\nLine4";
        System.out.println(lines);
        System.out.println(lines.lines().collect(Collectors.toList())); //prints [Line1, Line2, Line3, Line4]

        //repeat()
        System.out.println("=".repeat(4)); //prints ====

        //strip(), stripLeading() and stripTrailing()
        String strip = "  -- komanrudden --  ";
        System.out.println("(" + strip.strip() + ")"); //prints (-- komanrudden --)
        System.out.println("(" + strip.stripLeading() + ")"); //prints (-- komanrudden --  )
        System.out.println("(" + strip.stripTrailing() + ")"); //prints (  -- komanrudden --)
    }
}
