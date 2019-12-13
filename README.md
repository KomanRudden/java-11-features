Java 11 Features

    1. LTS and Oracle JDK no longer commercially free
    2. Running with single command
    3. Utility methods in String class
    4. Local-Variable syntax in Lambda parameters
    
Set Java 11

    Linux/macOS
        export JAVA_HOME=<PATH_TO_INSTALLATION>\jdk-11.0.5
        export Path=%JAVA_HOME%\bin;%Path%
    Windows
        set JAVA_HOME=<PATH_TO_INSTALLATION>\jdk-11.0.5
        set Path=%JAVA_HOME%\bin;%Path%        
        
Run sample

    java -jar target/java-11-features-1.0.0.jar
    
SingleFileFeature output should be

    $ java SingleFileFeature.java
    No need to use javac, simply run the java class using java
    
StringMethods output should be

    true
    Line1
    Line2
    Line3
    Line4
    [Line1, Line2, Line3, Line4]
    ====
    (-- komanrudden --)
    (-- komanrudden --  )
    (  -- komanrudden --)
    
Lambda rules for local-variables i.e. var

    (var s1, var s2) -> s1 + s2; //compiles
    (var s1, s2) -> s1 + s2; //illegal
    (var s1, String s2) -> s1 + s2; //illegal
    var s1 -> s1; //illegal, needs parentheses